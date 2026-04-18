package org.example.WiringBeans.Wiring;

public class Produto {
    private long idAutoIncrement = 1L;

    private String nome;

    public Produto() {
        System.out.println("Produto criado!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome do Produto da Pessoa: " + nome;
    }
}
