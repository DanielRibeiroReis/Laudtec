package com.example.laudtec.model;

public class Equipamentos {

    private String nomeEquipamentos;
    private String modeloEquipamentos;


    public Equipamentos(String nomeEdificio, String nomeCompania) {
        this.nomeEquipamentos = nomeEdificio;
        this.modeloEquipamentos = nomeCompania;
    }

    public String getNomeEquipamentos() { return nomeEquipamentos; }

    public void setNomeEquipamentos(String nomeEquipamentos) {
        this.nomeEquipamentos = nomeEquipamentos;
    }

    public String getModeloEquipamentos() {
        return modeloEquipamentos;
    }

    public void setModeloEquipamentos(String setModeloEquipamentos) {
        this.modeloEquipamentos = modeloEquipamentos;
    }
}
