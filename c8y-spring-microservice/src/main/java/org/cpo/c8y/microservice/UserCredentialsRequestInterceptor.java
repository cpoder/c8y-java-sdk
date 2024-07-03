package org.cpo.c8y.microservice;

import org.springframework.stereotype.Component;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserCredentialsRequestInterceptor implements RequestInterceptor {
    private final MicroserviceSubscriptionsService microserviceSubscriptionsService;

    @Override
    public void apply(RequestTemplate template) {
        template.header("Authorization", microserviceSubscriptionsService.getCurrentUserCredentials());
    }

}
