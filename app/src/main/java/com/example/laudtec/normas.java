package com.example.laudtec;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class normas extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    int posicao;

    TextView textoNorma1 = findViewById(R.id.txtNorma);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normas);


        Toast.makeText(this, "Criado normas", Toast.LENGTH_SHORT).show();
                Spinner spinner = (Spinner) findViewById(R.id.spinnerLaudo1);
        // Create an ArrayAdapter using the string array and a default spinner layout
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                        R.array.normas, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
                spinner.setAdapter(adapter);
    }

        @Override
        public void onItemSelected (AdapterView < ? > adapterView, View view,int i, long l){

            posicao = (int) adapterView.getItemAtPosition(i);
            String pospos = adapterView.getItemAtPosition(i).toString();

            Toast.makeText(this, i, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, pospos, Toast.LENGTH_SHORT).show();


            if (i == 1) {
                textoNorma1.setText("laudo spinner 1");
            }
            if (i == 2) {
                textoNorma1.setText("laudo spinner 2");
            }
            if (i == 3) {
                textoNorma1.setText("laudo spinner 3");
            }

        }

        @Override
        public void onNothingSelected (AdapterView < ? > adapterView){

        }

}