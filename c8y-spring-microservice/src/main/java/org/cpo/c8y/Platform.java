package org.cpo.c8y;

import java.util.HashMap;
import java.util.Map;

import org.cpo.c8y.ApiClient.Api;
import org.cpo.c8y.configuration.C8YProperties;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Platform {

    private final C8YProperties config;

    private final MicroserviceCredentialsRequestInterceptor cumulocityCredentialsRequestInterceptor;

    private final UserCredentialsRequestInterceptor userCredentialsRequestInterceptor;

    private final Map<Class<?>, Object> microserviceApis = new HashMap<>();

    private final Map<Class<?>, Object> userApis = new HashMap<>();

    public ApiClient getApi() {
        var client = new ApiClient();
        client.addAuthorization("Basic", cumulocityCredentialsRequestInterceptor);
        client.setBasePath(config.getBaseUrl());
        return client;
    }

    public ApiClient getUserApi() {
        var client = new ApiClient();
        client.addAuthorization("Basic", userCredentialsRequestInterceptor);
        client.setBasePath(config.getBaseUrl());
        return client;
    }

    @SuppressWarnings("unchecked")
    public <A extends Api> A buildClient(Class<A> clientClass) {
        return (A) microserviceApis.computeIfAbsent(clientClass, key -> getApi().buildClient(clientClass));
    }

    @SuppressWarnings("unchecked")
    public <A extends Api> A buildUserClient(Class<A> clientClass) {
        return (A) userApis.computeIfAbsent(clientClass, key -> getUserApi().buildClient(clientClass));
    }

}
