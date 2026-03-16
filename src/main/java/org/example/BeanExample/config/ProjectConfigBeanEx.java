package org.example.BeanExample.config;

import org.example.BeanExample.model.Carro;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfigBeanEx {
    // Bean e utilizado para colocar a instancia do objeto dentro do contexto da spring
    // para ele poder utilizar e configurar tal objeto
    // O primary significa se chamar o beans sem identificador unico ele chama o @Primary automaticamente

    @Bean
    @Primary
    Carro carro1() {
        Carro carro = new Carro("LaFerrari", "VENTURI", 0);

        return carro;
    }

    // Nome do @Bean para identificacao especifico, caso nao tenha esse valor o @Bean identifica
    // pelo nome do metodo (nesse casso carro2)

    @Bean(name = "Honda")
    Carro carro2() {
        Carro carro = new Carro("Honda", "SHFGJ123", 0);

        return carro;
    }

    @Bean
    String teste() {
        String teste = "OI";

        return teste;
    }

    @Bean
    Integer numero() {
        Integer num = 100000;

        return num;
    }
}
