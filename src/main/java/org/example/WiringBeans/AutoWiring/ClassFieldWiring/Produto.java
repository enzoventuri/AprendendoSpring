package org.example.WiringBeans.AutoWiring.ClassFieldWiring;

import org.springframework.stereotype.Component;

@Component
public class Produto {
    private String nome = "Mouse Logitech G703 Lightspeed com Sensor HERO";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
