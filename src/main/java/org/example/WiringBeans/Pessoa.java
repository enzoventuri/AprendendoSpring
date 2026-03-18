package org.example.WiringBeans;

public class Pessoa {
    private long idAutoIncrement = 1L;

    private String nome;
    private Produto produto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                ", nome='" + nome + '\'' +
                '}';
    }

}
