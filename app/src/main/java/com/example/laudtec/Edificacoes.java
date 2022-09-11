package com.example.laudtec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.laudtec.adapter.AdapterEdificacoes;

import java.util.ArrayList;
import java.util.List;

public class Edificacoes extends AppCompatActivity {

    private RecyclerView listaEdificacoes;

    private List<com.example.laudtec.model.Edificacoes> listaEdificios = new ArrayList<com.example.laudtec.model.Edificacoes>();

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
    }

    public void listarEd(){
        com.example.laudtec.model.Edificacoes edificio = new com.example.laudtec.model.Edificacoes("Sagres","Raíssa");
        this.listaEdificios.add(edificio);

        edificio = new com.example.laudtec.model.Edificacoes("Sagres2", "Raíssa2");
        this.listaEdificios.add(edificio);

        edificio  = new com.example.laudtec.model.Edificacoes("Sagres3","Raíssa3");
        this.listaEdificios.add(edificio);

        edificio  = new com.example.laudtec.model.Edificacoes("Sagres4","Raíssa4");
        this.listaEdificios.add(edificio);

    }

}