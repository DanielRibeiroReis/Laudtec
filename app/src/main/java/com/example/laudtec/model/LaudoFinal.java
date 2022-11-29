package com.example.laudtec.model;

public class LaudoFinal {

    private String nomeEdificio;
    private String dataAtualizado;

    public LaudoFinal(){

    }

    public LaudoFinal(String nomeEdificio, String nomeCompania) {
        this.nomeEdificio = nomeEdificio;
        this.dataAtualizado = nomeCompania;
    }

    public String getNomeEdificio() { return nomeEdificio; }

    public void setNomeEdificio(String nomeEdificio) {
        this.nomeEdificio = nomeEdificio;
    }

    public String getNomeCompania() {
        return dataAtualizado;
    }

    public void setNomeCompania(String nomeCompania) {
        this.dataAtualizado = dataAtualizado;
    }
}
