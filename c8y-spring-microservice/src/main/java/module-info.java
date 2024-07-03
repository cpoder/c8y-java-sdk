module c8y.spring.microservice {
    requires transitive jakarta.annotation;
    requires transitive c8y.specifications;
    requires transitive spring.beans;
    requires transitive spring.web;
    requires transitive spring.webmvc;
    requires transitive spring.core;
    requires transitive spring.context;
    requires transitive spring.boot;
    requires transitive spring.boot.autoconfigure;
    requires transitive org.slf4j;
    requires transitive spring.aop;
    requires transitive lombok;
    requires transitive jakarta.servlet;

    exports org.cpo.c8y.microservice;
    exports org.cpo.c8y.microservice.annotation;
    exports org.cpo.c8y.microservice.event;
    exports org.cpo.c8y.microservice.exception;
    exports org.cpo.c8y.microservice.scope;
}
