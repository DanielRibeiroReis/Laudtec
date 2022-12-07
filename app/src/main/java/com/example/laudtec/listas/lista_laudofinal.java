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
import com.example.laudtec.adapter.AdapterLaudoFinal;
import com.example.laudtec.model.LaudoFinal;

import java.util.ArrayList;
import java.util.List;

import quest.questionario;

public class lista_laudofinal extends AppCompatActivity {

    public RecyclerView listaLaudoFinal;
    public TextView label;
    public List<LaudoFinal> listarLaudoFinal = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_equipamentos);

        listaLaudoFinal = findViewById(R.id.listaEquipamentos);
        label = findViewById(R.id.labelNumeroLaudoPreliminar);

        this.listarLaudoFinal();

        //Configurando adapter
        AdapterLaudoFinal adapter = new AdapterLaudoFinal(listarLaudoFinal);

        RecyclerView.LayoutManager layoutManagerEd = new LinearLayoutManager(getApplicationContext());
        listaLaudoFinal.setLayoutManager(layoutManagerEd);
        listaLaudoFinal.setHasFixedSize(true);

        listaLaudoFinal.setAdapter(adapter);

        listaLaudoFinal.addOnItemTouchListener(
                new ClickListener(getApplicationContext(), listaLaudoFinal, new ClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        com.example.laudtec.model.LaudoFinal laudoFinal = listarLaudoFinal.get(position);

                        Intent intent = new Intent(lista_laudofinal.this, questionario.class);
                        String extraLaudoFinal = laudoFinal.getNomeEdificio();
                        intent.putExtra("NOME_LAUDOFINAL_SELEC" ,extraLaudoFinal);
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

    public void listarLaudoFinal(){
        com.example.laudtec.model.LaudoFinal laudoFinal = new com.example.laudtec.model.LaudoFinal("Equipamento","06/12");
        this.listarLaudoFinal.add(laudoFinal);

        laudoFinal = new com.example.laudtec.model.LaudoFinal("Paineiras", "16/12");
        this.listarLaudoFinal.add(laudoFinal);




        label.setText("Você possui " + this.listarLaudoFinal.size() + " equipamentos cadastradas");





    }

}