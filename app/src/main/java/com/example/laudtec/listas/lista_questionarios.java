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
import com.example.laudtec.adapter.AdapterQuestionarios;
import com.example.laudtec.model.Questionarios;

import java.util.ArrayList;
import java.util.List;

public class lista_questionarios extends AppCompatActivity {

    public RecyclerView listaQuestionario;
    public TextView labelQuestionario;
    public List<com.example.laudtec.model.Questionarios> listagemQuestionario = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_questionarios);
        labelQuestionario = findViewById(R.id.labelNumeroLaudoPreliminar);
        listaQuestionario = findViewById(R.id.listaQuestionarios);

        //Listagem Questionarios
        this.listarQuestionarios();

        //Configurando adapter
        AdapterQuestionarios adapter = new AdapterQuestionarios(listagemQuestionario);


        RecyclerView.LayoutManager layoutManagerEd = new LinearLayoutManager(getApplicationContext());
        listaQuestionario.setLayoutManager(layoutManagerEd);
        listaQuestionario.setHasFixedSize(true);

        listaQuestionario.setAdapter(adapter);

        listaQuestionario.addOnItemTouchListener(
                new ClickListener(getApplicationContext(), listaQuestionario, new ClickListener.OnItemClickListener() {
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

    public void listarQuestionarios(){
        Questionarios questionario = new Questionarios("Adicionada em 21/11/2022", "NBR 5410:2004");
        this.listagemQuestionario.add(questionario);


        labelQuestionario.setText("Você possui " + this.listagemQuestionario.size() + " normas cadastradas");


    }


}