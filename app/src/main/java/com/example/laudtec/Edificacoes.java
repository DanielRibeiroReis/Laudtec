package com.example.laudtec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.laudtec.activity.MainActivity;
import com.example.laudtec.adapter.AdapterEdificacoes;

import java.util.ArrayList;
import java.util.List;

public class Edificacoes extends AppCompatActivity {

    public RecyclerView listaEdificacoes;

    public List<com.example.laudtec.model.Edificacoes> listaEdificios = new ArrayList<com.example.laudtec.model.Edificacoes>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edificacoes);

        listaEdificacoes = findViewById(R.id.listaEdificacoes);

        //Listagem Edificações
        this.listarEd();

        //Configurando adapter
        AdapterEdificacoes adapter = new AdapterEdificacoes(listaEdificios);

        RecyclerView.LayoutManager layoutManagerEd = new LinearLayoutManager(getApplicationContext());
        listaEdificacoes.setLayoutManager(layoutManagerEd);
        listaEdificacoes.setHasFixedSize(true);

        listaEdificacoes.setAdapter(adapter);

        listaEdificacoes.addOnItemTouchListener(
                new ClickListener(getApplicationContext(), listaEdificacoes, new ClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        com.example.laudtec.model.Edificacoes edificios = listaEdificios.get(position);
                        Toast.makeText(Edificacoes.this, "click curto " + edificios.getNomeEdificio(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Edificacoes.this, questionario.class);
                        startActivity(intent);

                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    }
                })
        );
    }

    public void listarEd(){
        com.example.laudtec.model.Edificacoes edificio = new com.example.laudtec.model.Edificacoes("Sagres","Raíssa");
        this.listaEdificios.add(edificio);

        edificio = new com.example.laudtec.model.Edificacoes("Paineiras", "Daniel");
        this.listaEdificios.add(edificio);

        edificio  = new com.example.laudtec.model.Edificacoes("Res. Arquipelago de Abrolhos","Mayla");
        this.listaEdificios.add(edificio);

        edificio  = new com.example.laudtec.model.Edificacoes("Res. Araucárias","Histivan inc.");
        this.listaEdificios.add(edificio);

        edificio  = new com.example.laudtec.model.Edificacoes("Res. Olavo Bilac","Solange");
        this.listaEdificios.add(edificio);

        edificio  = new com.example.laudtec.model.Edificacoes("Res. Via Brisa","Rogério");
        this.listaEdificios.add(edificio);

        edificio  = new com.example.laudtec.model.Edificacoes("Res. Art Life","José Roberto inc.");
        this.listaEdificios.add(edificio);

        edificio  = new com.example.laudtec.model.Edificacoes("Res. Daniel1","1mil inc.");
        this.listaEdificios.add(edificio);

        edificio  = new com.example.laudtec.model.Edificacoes("Res. Daniel2","1mil inc.");
        this.listaEdificios.add(edificio);

        edificio  = new com.example.laudtec.model.Edificacoes("Res. Daniel3","1mil inc.");
        this.listaEdificios.add(edificio);


        edificio  = new com.example.laudtec.model.Edificacoes("Res. Daniel4","1mil inc.");
        this.listaEdificios.add(edificio);






    }

}