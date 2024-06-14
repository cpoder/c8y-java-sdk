package org.cpo.c8y.configuration;

import org.cpo.c8y.Platform;
import org.cpo.c8y.api.ManagedObjectsApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Primary
@RequiredArgsConstructor
@Slf4j
public class TenantConfig {
    private final Platform platform;

    @Bean
    @Scope("tenant")
    public ManagedObjectsApi getManagedObjectsApi() {
        log.info("Getting ManagedObjectsApi");
        return platform.buildClient(ManagedObjectsApi.class);
    }
}
