package org.example.WiringBeans.AutoWiring.ConstrutorWiring;

import org.springframework.stereotype.Component;

@Component
public class Computador {
    private String marca = "Acer";

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
