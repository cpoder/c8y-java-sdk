package org.cpo.c8y.microservice;

import java.util.HashMap;
import java.util.Map;

import org.cpo.c8y.ApiClient;
import org.cpo.c8y.ApiClient.Api;
import org.cpo.c8y.microservice.configuration.C8YProperties;
import org.springframework.stereotype.Component;

import feign.RequestInterceptor;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Platform {

    private final C8YProperties config;

    private final MicroserviceCredentialsRequestInterceptor microserviceCredentialsRequestInterceptor;

    private final UserCredentialsRequestInterceptor userCredentialsRequestInterceptor;

    private final Map<Class<?>, Object> microserviceApis = new HashMap<>();

    private final Map<Class<?>, Object> userApis = new HashMap<>();

    public ApiClient getApi(RequestInterceptor authorizationHandler) {
        var client = new ApiClient();
        client.addAuthorization("Basic", authorizationHandler);
        client.setBasePath(config.getBaseUrl()).getFeignBuilder().dismiss404();
        return client;
    }

    public ApiClient getMicroserviceApi() {
        return getApi(microserviceCredentialsRequestInterceptor);
    }

    public ApiClient getUserApi() {
        return getApi(userCredentialsRequestInterceptor);
    }

    @SuppressWarnings("unchecked")
    public <A extends Api> A buildClient(Class<A> clientClass) {
        return (A) microserviceApis.computeIfAbsent(clientClass, key -> getMicroserviceApi().buildClient(clientClass));
    }

    @SuppressWarnings("unchecked")
    public <A extends Api> A buildUserClient(Class<A> clientClass) {
        return (A) userApis.computeIfAbsent(clientClass, key -> getUserApi().buildClient(clientClass));
    }

}
