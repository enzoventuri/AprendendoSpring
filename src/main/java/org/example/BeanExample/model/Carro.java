package org.example.BeanExample.model;

public class Carro {
    private String modelo;
    private String placa;
    private int quilometragem;

    public Carro(String modelo, String placa, int quilometragem) {
        this.modelo = modelo;
        this.placa = placa;
        this.quilometragem = quilometragem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
}
