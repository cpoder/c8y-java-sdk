package org.cpo.c8y.microservice.configuration;

public record Bootstrap(
        String tenant,
        String name,
        String password) {
}
