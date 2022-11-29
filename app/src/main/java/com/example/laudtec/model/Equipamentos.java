package com.example.laudtec.model;

public class Equipamentos {

    private String nomeEquipamentos;
    private String modeloEquipamentos;

    public Equipamentos(){

    }

    public Equipamentos(String nomeEdificio, String nomeCompania) {
        this.nomeEquipamentos = nomeEdificio;
        this.modeloEquipamentos = nomeCompania;
    }

    public String getNomeEdificio() { return nomeEquipamentos; }

    public void setNomeEdificio(String nomeEdificio) {
        this.nomeEquipamentos = nomeEquipamentos;
    }

    public String getNomeCompania() {
        return modeloEquipamentos;
    }

    public void setNomeCompania(String nomeCompania) {
        this.modeloEquipamentos = modeloEquipamentos;
    }
}
