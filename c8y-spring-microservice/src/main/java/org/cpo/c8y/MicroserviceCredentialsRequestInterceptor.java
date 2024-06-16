package org.cpo.c8y;

import java.util.Base64;

import org.springframework.stereotype.Component;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class MicroserviceCredentialsRequestInterceptor implements RequestInterceptor {
    private final MicroserviceSubscriptionsService microserviceSubscriptionsService;

    @Override
    public void apply(RequestTemplate template) {
        log.info("In MicroserviceCredentialsRequestInterceptor");
        var credentials = microserviceSubscriptionsService.getMicroserviceCredentials();
        byte[] authorizationHeader = Base64.getEncoder().encode(
                (credentials.getTenant() + "/" + credentials.getName() + ":" + credentials.getPassword()).getBytes());
        template.header("Authorization", "Basic " + new String(authorizationHeader));
    }

}
