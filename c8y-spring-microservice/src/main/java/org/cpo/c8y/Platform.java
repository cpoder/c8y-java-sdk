package org.cpo.c8y;

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

    public <A extends Api> A buildClient(Class<A> clientClass) {
        var api = getApi();
        if (api != null) {
            return api.buildClient(clientClass);
        } else {
            return null;
        }
    }

    public <A extends Api> A buildUserClient(Class<A> clientClass) {
        var api = getUserApi();
        if (api != null) {
            return api.buildClient(clientClass);
        } else {
            return null;
        }
    }

}
