package org.example.Scopes.Prototype.WithBeanAnnotation;

public class PlantaCafe {
    private int idadeAnos;
    private double tamanhoEmCm;

    public PlantaCafe(int idade, double tamanhoEmCm) {
        this.idadeAnos = idade;
        this.tamanhoEmCm = tamanhoEmCm;
    }

    public int getIdadeAnos() {
        return idadeAnos;
    }

    public double getTamanhoEmCm() {
        return tamanhoEmCm;
    }
}
