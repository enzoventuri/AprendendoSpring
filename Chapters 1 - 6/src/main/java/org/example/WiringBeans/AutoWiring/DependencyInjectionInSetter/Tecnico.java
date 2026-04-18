package org.example.WiringBeans.AutoWiring.DependencyInjectionInSetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tecnico {
    private String nome = "Tecnico";

    private Computador computador;

    public Computador getComputador() {
        return computador;
    }

    @Autowired
    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public String getNome() {
        return nome;
    }
}
