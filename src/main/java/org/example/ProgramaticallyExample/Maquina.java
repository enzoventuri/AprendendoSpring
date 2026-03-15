package org.example.ProgramaticallyExample;

import java.time.LocalDate;

public class Maquina {
    private long id;
    private String nome;
    private String tipo;
    private LocalDate dataProximaManutencao;

    private long idIncrement = 1L;

    public Maquina(String nome, String tipo, LocalDate dataProximaManutencao) {
        this.id = idIncrement++;
        this.nome = nome;
        this.tipo = tipo;
        this.dataProximaManutencao = dataProximaManutencao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getDataProximaManutencao() {
        return dataProximaManutencao;
    }

    public void setDataProximaManutencao(LocalDate dataProximaManutencao) {
        this.dataProximaManutencao = dataProximaManutencao;
    }
}
