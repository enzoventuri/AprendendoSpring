package org.example.WiringBeans.AutoWiring.QualifierAnnotation.WiringVersion;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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

    @Bean
    public Tecnico tecnico(
            @Qualifier("computador1") Computador computador) {
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Técnico");
        tecnico.setComputador(computador);

        return tecnico;
    }

//    Não é necessário utilizar o @Qualifier, pode colocar no parâmetro, o nome
//    do método que será utilizado

}
