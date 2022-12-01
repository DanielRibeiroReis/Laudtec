package com.example.laudtec.model;

public class Questionarios {

    private String nomeQuestionario;
    private String dataQuestionario;
/*
    public Questionario(){

    }
*/
    public Questionarios(String nomeQuestionario, String dataQuestionario) {
        this.nomeQuestionario = nomeQuestionario;
        this.dataQuestionario = dataQuestionario;
    }

    public String getNomeQuestionario() { return nomeQuestionario; }

    public void getNomeQuestionario(String nomeQuestionario) {
        this.nomeQuestionario = nomeQuestionario;
    }

    public String getDataQuestionario() {
        return dataQuestionario;
    }

    public void getDataQuestionario(String dataAdicao) {
        this.dataQuestionario = dataQuestionario;
    }
}
