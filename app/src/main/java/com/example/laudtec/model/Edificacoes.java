package com.example.laudtec.model;

public class Edificacoes {

    private String nomeEdificio;
    private String nomeCompania;

    public Edificacoes(){

    }

    public Edificacoes(String nomeEdificio, String nomeCompania) {
        this.nomeEdificio = nomeEdificio;
        this.nomeCompania = nomeCompania;
    }

    public String getNomeEdificio() { return nomeEdificio; }

    public void setNomeEdificio(String nomeEdificio) {
        this.nomeEdificio = nomeEdificio;
    }

    public String getNomeCompania() {
        return nomeCompania;
    }

    public void setNomeCompania(String nomeCompania) {
        this.nomeCompania = nomeCompania;
    }
}
