package org.cpo.c8y.configuration;

import org.cpo.c8y.scope.TenantScope;
import org.cpo.c8y.scope.UserScope;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class TenantBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.registerScope("tenant", new TenantScope());
        beanFactory.registerScope("user", new UserScope());
    }

}
