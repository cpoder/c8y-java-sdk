package org.cpo.c8y.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "c8y")
@Data
public class C8YProperties {
    private String baseUrl;
    private Bootstrap bootstrap;
}
