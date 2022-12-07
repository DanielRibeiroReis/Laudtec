package com.example.laudtec;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class LoginAdm extends Inicial {


    private TextView esqueciSenha;
    private Button entrarConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //ainda não há nada implementado para validação de login, apertar o "Entrar" vai para o painel
        esqueciSenha  = (TextView) findViewById(R.id.esqueciSenhaid);
        entrarConta = findViewById(R.id.entrarContaid);
        Boolean adm = getIntent().getExtras().getBoolean("LOG",true);

        esqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginAdm.this, EsqueciSenha.class);
                startActivity(intent);
            }
        });
        if(adm==true) {
            entrarConta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LoginAdm.this, painelAdm.class);
                    startActivity(intent);
                }
            });
        }else{
            entrarConta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LoginAdm.this, painelcolab.class);
                    startActivity(intent);
                }
            });
        }



    }
}