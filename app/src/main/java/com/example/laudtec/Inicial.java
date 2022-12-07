package com.example.laudtec;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import quest.PDF;


public class Inicial extends PDF {

    public Button loginAdministrador, loginColaborador,gerarPDF;
    private PDF gerador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        gerarPDF = findViewById(R.id.geraDev);
        loginAdministrador = (Button) findViewById(R.id.entraAdministrador);
        loginColaborador = (Button) findViewById(R.id.entraColaborador);
        loginColaborador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logColab = new Intent(Inicial.this, LoginAdm.class);
                logColab.putExtra("LOG",false);
                startActivity(logColab);
            }
        });

        loginAdministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logAdm = new Intent(Inicial.this, LoginAdm.class);
                logAdm.putExtra("LOG",true);
                startActivity(logAdm);
            }
        });

        gerarPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                criarPdf();
            }
        });

    }
}