package org.cpo.c8y;

import org.cpo.c8y.event.NewSubscribedTenant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableScheduling
@Slf4j
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @EventListener
    private void onNewSubsciption(NewSubscribedTenant newSubscribedTenant) {
        log.info("New tenant subscription: {}", newSubscribedTenant.getTenant());
    }
}