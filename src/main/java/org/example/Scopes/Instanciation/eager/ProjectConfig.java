package org.example.Scopes.Instanciation.eager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public BusService busService() {
        return new BusService();
    }
}
