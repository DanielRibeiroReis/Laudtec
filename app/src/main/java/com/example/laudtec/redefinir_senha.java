package com.example.laudtec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class redefinir_senha extends AppCompatActivity {

    private Button entrarRedefinicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redefinir_senha);

        entrarRedefinicao = (Button) findViewById(R.id.botaoRedefinirSenhaid);

        Intent intent = new Intent (redefinir_senha.this, painelAdm.class);
        startActivity(intent);


    }
}