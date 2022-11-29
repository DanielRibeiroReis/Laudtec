package com.example.laudtec.model;

public class Normas {

    private String nomeNorma;
    private String dataAdicao;

    public Normas(){

    }

    public Normas(String nomeNorma, String dataAdicao) {
        this.nomeNorma = nomeNorma;
        this.dataAdicao = dataAdicao;
    }

    public String getNomeNorma() { return nomeNorma; }

    public void getNomeNorma(String nomeNorma) {
        this.nomeNorma = nomeNorma;
    }

    public String getDataAdicao() {
        return dataAdicao;
    }

    public void getDataAdicao(String dataAdicao) {
        this.dataAdicao = dataAdicao;
    }
}
