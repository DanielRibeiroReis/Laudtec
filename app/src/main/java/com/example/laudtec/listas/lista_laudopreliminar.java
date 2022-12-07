package com.example.laudtec.listas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laudtec.ClickListener;
import com.example.laudtec.R;
import com.example.laudtec.adapter.AdapterLaudoPreliminar;
import com.example.laudtec.model.LaudoPreliminar;

import java.util.ArrayList;
import java.util.List;

import quest.questionario;

public class lista_laudopreliminar extends AppCompatActivity {

    public RecyclerView listaLaudoPreliminar;
    public TextView label;
    public List<LaudoPreliminar> listarLaudoPreliminar = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_laudopreliminar);

        listaLaudoPreliminar = findViewById(R.id.listaLaudoPreliminar);
        label = findViewById(R.id.labelNumeroLaudoPreliminar);

        this.listarLaudoPreliminar();

        //Configurando adapter
        AdapterLaudoPreliminar adapter = new AdapterLaudoPreliminar(listarLaudoPreliminar);

        RecyclerView.LayoutManager layoutManagerEd = new LinearLayoutManager(getApplicationContext());
        listaLaudoPreliminar.setLayoutManager(layoutManagerEd);
        listaLaudoPreliminar.setHasFixedSize(true);

        listaLaudoPreliminar.setAdapter(adapter);

        listaLaudoPreliminar.addOnItemTouchListener(
                new ClickListener(getApplicationContext(), listaLaudoPreliminar, new ClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        com.example.laudtec.model.LaudoPreliminar laudoPreliminar = listarLaudoPreliminar.get(position);

                        Intent intent = new Intent(lista_laudopreliminar.this, questionario.class);
                        String extraLaudoPreliminar = laudoPreliminar.getNomeEdificio();
                        intent.putExtra("NOME_LAUDOPRELIMINAR_SELEC" ,extraLaudoPreliminar);
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

    public void listarLaudoPreliminar(){
        com.example.laudtec.model.LaudoPreliminar laudoPreliminar = new com.example.laudtec.model.LaudoPreliminar("Equipamento","06/12");
        this.listarLaudoPreliminar.add(laudoPreliminar);

        laudoPreliminar = new com.example.laudtec.model.LaudoPreliminar("Paineiras", "16/12");
        this.listarLaudoPreliminar.add(laudoPreliminar);




        label.setText("Você possui " + this.listarLaudoPreliminar.size() + " equipamentos cadastradas");





    }

}