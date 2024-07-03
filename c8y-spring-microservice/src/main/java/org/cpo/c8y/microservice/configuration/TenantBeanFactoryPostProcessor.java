package org.cpo.c8y.microservice.configuration;

import org.cpo.c8y.microservice.scope.TenantScope;
import org.cpo.c8y.microservice.scope.UserScope;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.lang.NonNull;

public class TenantBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(@NonNull ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.registerScope("tenant", new TenantScope());
        beanFactory.registerScope("user", new UserScope());
    }

}
