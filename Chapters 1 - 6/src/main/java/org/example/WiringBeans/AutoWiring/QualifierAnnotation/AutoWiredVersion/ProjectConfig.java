package org.example.WiringBeans.AutoWiring.QualifierAnnotation.AutoWiredVersion;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.WiringBeans.AutoWiring.QualifierAnnotation.AutoWiredVersion")
public class ProjectConfig {
    @Bean
    public Computador computador1() {
        Computador computador = new Computador();
        computador.setMarca("Acer");

        return computador;
    }

    @Bean
    public Computador computador2() {
        Computador computador = new Computador();
        computador.setMarca("Intel");

        return computador;
    }

}
