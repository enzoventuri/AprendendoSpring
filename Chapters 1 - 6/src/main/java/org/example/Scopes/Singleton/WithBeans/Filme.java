package org.example.Scopes.Singleton.WithBeans;

public class Filme {
    private String genero;
    private double duracaoMinutes;

    public Filme(String genero, double duracao) {
        this.genero = genero;
        this.duracaoMinutes = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public double getDuracaoMinutes() {
        return duracaoMinutes;
    }
}
