package org.cpo.c8y.annotation;

import static org.springframework.context.annotation.ScopedProxyMode.*;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Scope;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Scope(value = "user", proxyMode = TARGET_CLASS)
public @interface UserScope {

}
