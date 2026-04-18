package org.example.WiringBeans.AutoWiring.QualifierAnnotation.WiringVersion;

public class Tecnico {
    private String nome;
    private Computador computador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }
}
