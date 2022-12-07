package com.example.laudtec.listas;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laudtec.ClickListener;
import com.example.laudtec.R;
import com.example.laudtec.adapter.AdapterColaboradores;
import com.example.laudtec.model.Colaboradores;

import java.util.ArrayList;
import java.util.List;

import quest.questionario;


public class lista_colaboradores extends AppCompatActivity {

    private RecyclerView listaColaboradores;
    public TextView label;
    private List<Colaboradores> listaColaborador;
    private SearchView searchView;
    private  AdapterColaboradores adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_colaboradores);

        searchView = findViewById(R.id.pesquisaColaboradores);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return true;
            }
        });

        listaColaborador = new ArrayList<>();

        listaColaboradores = findViewById(R.id.listaEquipamentos);
        label = findViewById(R.id.labelNumeroLaudoPreliminar);
        //Listagem Edificações
        this.listarColab();

        //Configurando adapter
        AdapterColaboradores adapter = new AdapterColaboradores(listaColaborador);


        RecyclerView.LayoutManager layoutManagerEd = new LinearLayoutManager(getApplicationContext());
        listaColaboradores.setLayoutManager(layoutManagerEd);
        listaColaboradores.setHasFixedSize(true);

        listaColaboradores.setAdapter(adapter);

        listaColaboradores.addOnItemTouchListener(
                new ClickListener(getApplicationContext(), listaColaboradores, new ClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        com.example.laudtec.model.Colaboradores colaboradores = listaColaborador.get(position);
                        //Toast.makeText(Edificacoes.this, "click curto " + edificios.getNomeEdificio(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(lista_colaboradores.this, questionario.class);
                        //String extraEdificio = edificios.getNomeEdificio();
                        //intent.putExtra("NOME_EDIFIO_SELEC" ,extraEdificio);
                        //startActivity(intent);

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

    private void filterList(String text) {
        List<Colaboradores> filteredList = new ArrayList<>();
        for(Colaboradores item : listaColaborador){
            if(item.getNomeEdificio().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }
        if(filteredList.isEmpty()){
            Toast.makeText(this, "vazio", Toast.LENGTH_SHORT).show();
        }else{
            adapter.setListaFiltradaColaboradores(filteredList);
        }

    }

    @SuppressLint("SetTextI18n")
    public void listarColab(){
        com.example.laudtec.model.Colaboradores colaborador = new com.example.laudtec.model.Colaboradores("Daniel","Administrador");
        this.listaColaborador.add(colaborador);

        colaborador  = new com.example.laudtec.model.Colaboradores("Raíssa","Histivan inc.");
        this.listaColaborador.add(colaborador);
        colaborador  = new com.example.laudtec.model.Colaboradores("Mayla","Histivan inc.");
        this.listaColaborador.add(colaborador);
        colaborador  = new com.example.laudtec.model.Colaboradores("Histivan","Histivan inc.");
        this.listaColaborador.add(colaborador);
        colaborador  = new com.example.laudtec.model.Colaboradores("Fabio","Histivan inc.");
        this.listaColaborador.add(colaborador);

        label.setText("Você possui " + this.listaColaborador.size() + " colaboradores cadastradas");
    }



}