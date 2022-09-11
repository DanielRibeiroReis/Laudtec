package com.example.laudtec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.laudtec.activity.MainActivity;


public class Painel extends AppCompatActivity {

    public Button edificacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paineladm);

        edificacoes = findViewById(R.id.painelEdificacoessid);

        edificacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Painel.this, Edificacoes.class);
                startActivity(intent);
            }
        });


    }
}