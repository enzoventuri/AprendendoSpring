package org.example.WiringBeans;

public class Produto {
    private long idAutoIncrement = 1L;

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                ", nome='" + nome + '\'' +
                '}';
    }
}
