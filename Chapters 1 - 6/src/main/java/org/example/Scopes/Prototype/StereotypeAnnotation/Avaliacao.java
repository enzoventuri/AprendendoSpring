package org.example.Scopes.Prototype.StereotypeAnnotation;

public class Avaliacao {
    private String nomeUsuario;
    private String descricao;
    private int quantidadeEstrelas;

    public Avaliacao(String nomeUsuario, String descricao, int quantidadeEstrelas) {
        this.nomeUsuario = nomeUsuario;
        this.descricao = descricao;
        this.quantidadeEstrelas = quantidadeEstrelas;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidadeEstrelas() {
        return quantidadeEstrelas;
    }
}
