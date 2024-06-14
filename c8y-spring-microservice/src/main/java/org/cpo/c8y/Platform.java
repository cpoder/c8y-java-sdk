package org.cpo.c8y;

import org.cpo.c8y.ApiClient.Api;
import org.cpo.c8y.configuration.C8YProperties;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Platform {

    private final C8YProperties config;

    private final CumulocityCredentialsRequestInterceptor cumulocityCredentialsRequestInterceptor;

    public ApiClient getApi() {
        var client = new ApiClient();
        client.addAuthorization("Basic", cumulocityCredentialsRequestInterceptor);
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

}
