package com.example.laudtec.listas;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laudtec.ClickListener;
import com.example.laudtec.R;
import com.example.laudtec.adapter.AdapterNormas;
import com.example.laudtec.model.Normas;

import java.util.ArrayList;
import java.util.List;

public class lista_normas extends AppCompatActivity {

    public RecyclerView listaNormas;
    public TextView label;
    public List<com.example.laudtec.model.Normas> listagemNorma = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_normas);
        label = findViewById(R.id.labelNumeroQuestionarios);
        listaNormas = findViewById(R.id.listaNormasid);

        //Listagem Edificações
        this.listarNormas();

        //Configurando adapter
        AdapterNormas adapter = new AdapterNormas(listagemNorma);

        RecyclerView.LayoutManager layoutManagerEd = new LinearLayoutManager(getApplicationContext());
        listaNormas.setLayoutManager(layoutManagerEd);
        listaNormas.setHasFixedSize(true);

        listaNormas.setAdapter(adapter);

        listaNormas.addOnItemTouchListener(
                new ClickListener(getApplicationContext(), listaNormas, new ClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        //com.example.laudtec.model.Edificacoes edificios = listaNormas.get(position);
                        //Toast.makeText(Edificacoes.this, "click curto " + edificios.getNomeEdificio(), Toast.LENGTH_SHORT).show();
                        //Intent intent = new Intent(Normas.this, questionario.class);
                        //String extraEdificio = edificios.getNomeEdificio();
                        //intent.putExtra("NOME_EDIFIO_SELEC" ,extraEdificio);
                       // startActivity(intent);

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

    public void listarNormas(){
        Normas norma = new Normas("Adicionada em 21/11/2022", "NBR 5410:2004");
        this.listagemNorma.add(norma);

        norma = new Normas("Adicionada 09/12/2021", "NBR 5419:2015");
        this.listagemNorma.add(norma);

        norma = new Normas("Adicionada em 29/09/2022", "10 NR 10");
        this.listagemNorma.add(norma);

        norma = new Normas("Adicionada 09/12/2021", "NBR 5419:2015");
        this.listagemNorma.add(norma);

        norma = new Normas("Adicionada em 29/09/2022", "10 NR 10");
        this.listagemNorma.add(norma);

        norma = new Normas("Adicionada 09/12/2021", "NBR 5419:2015");
        this.listagemNorma.add(norma);

        norma = new Normas("Adicionada em 29/09/2022", "10 NR 10");
        this.listagemNorma.add(norma);

        label.setText("Você possui " + this.listagemNorma.size() + " normas cadastradas");


    }


}