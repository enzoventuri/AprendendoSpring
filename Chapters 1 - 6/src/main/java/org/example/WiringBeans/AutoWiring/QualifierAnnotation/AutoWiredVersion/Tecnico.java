package org.example.WiringBeans.AutoWiring.QualifierAnnotation.AutoWiredVersion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Tecnico {
    private String nome = "Técnico";
    private final Computador computador;

    @Autowired
    public Tecnico(@Qualifier("computador2") Computador computador) {
        this.computador = computador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Computador getComputador() {
        return computador;
    }

}
