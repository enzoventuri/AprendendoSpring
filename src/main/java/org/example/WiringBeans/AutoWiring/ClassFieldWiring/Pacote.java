package org.example.WiringBeans.AutoWiring.ClassFieldWiring;

import org.example.WiringBeans.AutoWiring.ClassFieldWiring.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pacote {
    private String nome = "Pacote top";

    @Autowired
    private Produto produto;
    //  automaticamente pega o objeto dentro do contexto spring e adiciona
    //  o valor diretamente no atributo

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
