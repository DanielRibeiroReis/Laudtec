package com.example.laudtec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pin_senha extends AppCompatActivity {

    private Button entraPin;
    public TextView pin1;
    public TextView pin2;
    public TextView pin3;
    public TextView pin4;
    public TextView pin5;
    public TextView pin6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_senha);

        pin1 = findViewById(R.id.pin1id);
        pin2 = findViewById(R.id.pin2id);
        pin3 = findViewById(R.id.pin3id);
        pin4 = findViewById(R.id.pin4id);
        pin5 = findViewById(R.id.pin5id);
        pin6 = findViewById(R.id.pin6id);

        entraPin  = (Button) findViewById(R.id.botaoRedefinirSenhaid);


        pin1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (pin1.getText().toString().length()==1){pin2.requestFocus();}

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        pin2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (pin2.getText().toString().length()==1){pin3.requestFocus();}

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        pin3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (pin3.getText().toString().length()==1){pin4.requestFocus();}

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        pin4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (pin4.getText().toString().length()==1){pin5.requestFocus();}

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        pin5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (pin5.getText().toString().length()==1){pin6.requestFocus();}

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });








        entraPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pin_senha.this, redefinir_senha.class);
                startActivity(intent);
            }
        });



    }
}