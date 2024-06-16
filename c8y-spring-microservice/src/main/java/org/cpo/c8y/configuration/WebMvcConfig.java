package org.cpo.c8y.configuration;

import java.util.Base64;

import org.cpo.c8y.MicroserviceSubscriptionsService;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class WebMvcConfig implements WebMvcConfigurer {
    private final MicroserviceSubscriptionsService microserviceSubscriptionsService;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
                    throws Exception {
                String authorization = request.getHeader("Authorization");
                if (authorization != null && authorization.startsWith("Basic")) {
                    var decoder = Base64.getDecoder();
                    microserviceSubscriptionsService
                            .setCurrentTenant(new String(decoder.decode(authorization.split(" ")[1])).split("/")[0]);
                }

                return true;
            }
        });
    }
}
