package com.example.laudtec.model;

public class Colaboradores {

    private String nomeColaborador;
    private String cargoColaborador;

    public Colaboradores(){

    }

    public Colaboradores(String nomeColaborador, String cargoColaborador) {
        this.nomeColaborador = nomeColaborador;
        this.cargoColaborador = cargoColaborador;
    }

    public String getNomeEdificio() { return nomeColaborador; }

    public void setNomeEdificio(String nomeEdificio) {
        this.nomeColaborador = nomeEdificio;
    }

    public String getNomeCompania() {
        return cargoColaborador;
    }

    public void setNomeCompania(String nomeCompania) {
        this.cargoColaborador = nomeCompania;
    }
}
