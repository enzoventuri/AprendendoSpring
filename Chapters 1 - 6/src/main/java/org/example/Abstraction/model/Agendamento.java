package org.example.Abstraction.model;

public class Agendamento {
    private String nome;
    private String descricao;

    public Agendamento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
