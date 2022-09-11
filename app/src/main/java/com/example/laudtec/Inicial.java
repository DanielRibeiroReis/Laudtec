package com.example.laudtec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inicial extends AppCompatActivity {

    private Button loginAdministrador;
    private Button loginColaborador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        loginAdministrador.findViewById(R.id.entraAdministrador);
        loginColaborador.findViewById(R.id.entraColaborador);

        loginColaborador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(inicial.this, loginadm.class);
                startActivity(intent);
            }
        });

        loginAdministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(inicial.this, loginadm.class);
                startActivity(intent);
            }
        });

    }
}