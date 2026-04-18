package org.example.Scopes.Prototype.WithBeanAnnotation;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public PlantaCafe plantaCafe() {
        return new PlantaCafe(2, 100);
    }
}
