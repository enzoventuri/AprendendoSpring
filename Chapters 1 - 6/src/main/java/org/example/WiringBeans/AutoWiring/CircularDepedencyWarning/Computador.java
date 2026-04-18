package org.example.WiringBeans.AutoWiring.CircularDepedencyWarning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computador {
    private String marca = "Acer";
    private final Tecnico tecnico;

    @Autowired
    public Computador(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
