package org.example.WiringBeans.AutoWiring.ConstrutorWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tecnico {
    private String nome = "Tecnico";

    private final Computador computador;

    @Autowired
    public Tecnico(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public String getNome() {
        return nome;
    }
}
