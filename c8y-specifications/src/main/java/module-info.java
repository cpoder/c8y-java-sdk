module c8y.specifications {
    requires jakarta.annotation;
    requires scribejava.core;
    requires transitive java.logging;
    requires transitive feign.core;
    requires transitive feign.form;
    requires transitive feign.jackson;
    requires transitive feign.okhttp;
    requires transitive feign.slf4j;
    requires transitive com.fasterxml.jackson.core;
    requires transitive com.fasterxml.jackson.databind;
    requires transitive com.fasterxml.jackson.datatype.jsr310;
    requires transitive org.openapitools.jackson.nullable;
    requires io.swagger.v3.oas.annotations;
    requires jakarta.validation;
    requires spring.context;
    requires jakarta.servlet;
    requires spring.web;

    exports org.cpo.c8y;
    exports org.cpo.c8y.api;
    exports org.cpo.c8y.model;
}
