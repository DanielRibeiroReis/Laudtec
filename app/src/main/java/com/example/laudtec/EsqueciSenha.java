package com.example.laudtec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EsqueciSenha extends AppCompatActivity {

    private Button enviaPin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esqueci_senha);

        enviaPin = (Button) findViewById(R.id.entrarContaid);

        enviaPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EsqueciSenha.this,pin_senha.class);
                startActivity(intent);
            }
        });







    }
}