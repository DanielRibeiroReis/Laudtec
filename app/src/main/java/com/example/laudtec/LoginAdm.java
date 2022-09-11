package com.example.laudtec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class LoginAdm extends AppCompatActivity {


    private TextView esqueciSenha;
    private Button entrarConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginadm);

        //ainda não há nada implementado para validação de login, apertar o "Entrar" vai para o painel

        esqueciSenha  = (TextView) findViewById(R.id.esqueciSenhaid);
        entrarConta = findViewById(R.id.entrarContaid);

        esqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginAdm.this, EsqueciSenha.class);
                startActivity(intent);
            }
        });

        entrarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginAdm.this, Painel.class);
                startActivity(intent);
            }
        });




    }
}