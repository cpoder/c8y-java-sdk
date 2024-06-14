package org.cpo.c8y;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.cpo.c8y.api.CurrentApplicationApi;
import org.cpo.c8y.configuration.C8YProperties;
import org.cpo.c8y.event.NewSubscribedTenant;
import org.cpo.c8y.event.UnsubscribedTenant;
import org.cpo.c8y.model.ApplicationUserCollectionUsersInner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class MicroserviceSubscriptionsService {

    private CurrentApplicationApi currentApplicationApi;

    private final C8YProperties config;

    private final ApplicationEventPublisher applicationEventPublisher;

    private final Map<String, ApplicationUserCollectionUsersInner> detectedUsers = new HashMap<>();

    private List<String> userList = new ArrayList<>();

    @PostConstruct
    private void init() {
        log.info("Building initial Cumulocity platform access...");
        ApiClient client = new ApiClient("Basic");
        client.setBasePath(config.getBaseUrl()).setCredentials(
                config.getBootstrap().tenant() + "/" + config.getBootstrap().name(),
                config.getBootstrap().password());
        log.info("Bootstrap access configured for tenant {}", config.getBootstrap().tenant());
        currentApplicationApi = client.buildClient(CurrentApplicationApi.class);
    }

    @Scheduled(initialDelay = 2000, fixedDelay = 10000)
    private void scanTenantSubscriptions() {
        var subscriptions = currentApplicationApi.getApplicationUserCollectionRepresentation();
        detectedUsers.clear();
        if (subscriptions != null) {
            var users = subscriptions.getUsers();
            if (users != null) {
                final var detectedUserList = new ArrayList<String>();
                users.forEach(user -> {
                    detectedUsers.put(user.getTenant(), user);
                    detectedUserList.add(user.getTenant());
                });
                final var deletedUsers = new ArrayList<>(userList);
                deletedUsers.removeAll(detectedUserList);
                deletedUsers
                        .forEach(tenant -> applicationEventPublisher.publishEvent(new UnsubscribedTenant(tenant)));
                final var addedUsers = new ArrayList<>(detectedUserList);
                addedUsers.removeAll(userList);
                addedUsers
                        .forEach(tenant -> applicationEventPublisher.publishEvent(new NewSubscribedTenant(tenant)));
                userList = detectedUserList;
            }
        }
    }

    public String getCurrentTenant() {
        var attrs = RequestContextHolder.getRequestAttributes();
        String tenant = null;
        if (attrs != null) {
            HttpServletRequest request = ((ServletRequestAttributes) attrs).getRequest();
            String authorization = request.getHeader("Authorization");
            if (authorization != null && authorization.startsWith("Basic")) {
                var decoder = Base64.getDecoder();
                tenant = new String(decoder.decode(authorization.split(" ")[1])).split("/")[0];
            }
        }
        return tenant;
    }

    public ApplicationUserCollectionUsersInner getMicroserviceCredentials() {
        return detectedUsers.get(getCurrentTenant());
    }
}
