package com.example.laudtec;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.core.app.ActivityCompat;

import com.example.laudtec.activity.MainActivity;


public class Inicial extends MainActivity {

    public Button loginAdministrador;
    public Button loginColaborador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        ActivityCompat.requestPermissions(this, new String[]{
                Manifest.permission.WRITE_EXTERNAL_STORAGE}, PackageManager.PERMISSION_GRANTED);




        loginAdministrador = (Button) findViewById(R.id.entraAdministrador);
        loginColaborador = (Button) findViewById(R.id.entraColaborador);

        loginColaborador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logColab = new Intent(Inicial.this, LoginAdm.class);
                startActivity(logColab);
            }
        });

        loginAdministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logAdm = new Intent(Inicial.this, LoginAdm.class);
                startActivity(logAdm);
            }
        });

    }
}