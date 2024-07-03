package org.cpo.c8y.microservice.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.cpo.c8y.microservice.configuration.TenantConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Import(TenantConfig.class)
@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "org.cpo.c8y.microservice")
public @interface CumulocityMicroservice {

}
