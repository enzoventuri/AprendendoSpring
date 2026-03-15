package org.example.StereotypeExample;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Livro {
    private String nome;
    private String autor;
    private int numeroPaginas;

    @PostConstruct
    public void init() {
        this.nome = "Investimento";
        this.autor = "Enzo";
        this.numeroPaginas = 300;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
