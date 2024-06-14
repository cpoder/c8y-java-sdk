package org.cpo.c8y.configuration;

public record Bootstrap(
        String tenant,
        String name,
        String password) {
}
