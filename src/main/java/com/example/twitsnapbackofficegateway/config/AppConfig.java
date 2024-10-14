package com.example.twitsnapbackofficegateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import com.example.twitsnapbackofficegateway.gatewayFilters.AuthFilter;

@Configuration
public class AppConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public AuthFilter authFilter(RestTemplate restTemplate) {
        return new AuthFilter(restTemplate, System.getProperty("AUTH_MS_URI"));
    }
}
