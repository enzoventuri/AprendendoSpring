package org.example.Scopes.Singleton.WithBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    // Scope no Spring: Como Spring cria e gerencia o seu ciclo de vida
    // Página 106 para aprofundar

    @Bean
    public Filme filme() {
        Filme filme = new Filme("Ação", 180);

        return filme;
    }
}
