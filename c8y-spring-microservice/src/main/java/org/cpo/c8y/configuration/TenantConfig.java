package org.cpo.c8y.configuration;

import org.cpo.c8y.Platform;
import org.cpo.c8y.annotation.TenantScope;
import org.cpo.c8y.annotation.UserScope;
import org.cpo.c8y.api.ManagedObjectsApi;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class TenantConfig {
    private final Platform platform;

    @Configuration
    @Primary
    class TenantScopeConfig {
        @Bean(name = { "managedObjectsApi", "tenantManagedObjectsApi" })
        @TenantScope
        @Primary
        public ManagedObjectsApi getManagedObjectsApi() {
            return platform.buildClient(ManagedObjectsApi.class);
        }
    }

    @Configuration
    class UserScopeConfig {
        @Bean(name = "userManagedObjectsApi")
        @UserScope
        public ManagedObjectsApi getManagedObjectsApi() {
            return platform.buildUserClient(ManagedObjectsApi.class);
        }
    }

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new TenantBeanFactoryPostProcessor();
    }

}
