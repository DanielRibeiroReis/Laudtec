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
import com.example.laudtec.adapter.AdapterEquipamentos;

import java.util.ArrayList;
import java.util.List;

import quest.questionario;

public class lista_equipamentos extends AppCompatActivity {

    public RecyclerView listaEquipamentos;
    public TextView label;
    public List<com.example.laudtec.model.Equipamentos> listarEquipamentos = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_equipamentos);

        listaEquipamentos = findViewById(R.id.listaEquipamentos);
        label = findViewById(R.id.labelNumeroLaudoPreliminar);

        this.listarEquipamentos();

        //Configurando adapter
        AdapterEquipamentos adapter = new AdapterEquipamentos(listarEquipamentos);

        RecyclerView.LayoutManager layoutManagerEd = new LinearLayoutManager(getApplicationContext());
        listaEquipamentos.setLayoutManager(layoutManagerEd);
        listaEquipamentos.setHasFixedSize(true);

        listaEquipamentos.setAdapter(adapter);

        listaEquipamentos.addOnItemTouchListener(
                new ClickListener(getApplicationContext(), listaEquipamentos, new ClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        com.example.laudtec.model.Equipamentos equipamentos = listarEquipamentos.get(position);

                        Intent intent = new Intent(lista_equipamentos.this, questionario.class);
                        String extraEequipamento = equipamentos.getNomeEquipamentos();
                        intent.putExtra("NOME_EQUIPAMENTO_SELEC" ,extraEequipamento);
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

    public void listarEquipamentos(){
        com.example.laudtec.model.Equipamentos equipamentos = new com.example.laudtec.model.Equipamentos("Equipamento","Deko");
        this.listarEquipamentos.add(equipamentos);

        equipamentos = new com.example.laudtec.model.Equipamentos("Paineiras", "Daniel");
        this.listarEquipamentos.add(equipamentos);




        label.setText("Você possui " + this.listarEquipamentos.size() + " equipamentos cadastradas");





    }

}