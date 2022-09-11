package com.example.laudtec.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.laudtec.Inicial;
import com.example.laudtec.R;


public class MainActivity extends AppCompatActivity {

    public Button botaoEntra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Aqui a tela não executa funções, somente vai para a proxima tela

        botaoEntra = (Button) findViewById(R.id.entra);

        botaoEntra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Inicial.class);
                startActivity(intent);
            }
        });
    }
}