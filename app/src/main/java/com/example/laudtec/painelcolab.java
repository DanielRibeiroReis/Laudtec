package com.example.laudtec;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.laudtec.listas.lista_edificacoes;
import com.example.laudtec.listas.lista_laudofinal;
import com.example.laudtec.listas.lista_laudopreliminar;
import com.example.laudtec.listas.lista_normas;
import com.example.laudtec.listas.lista_questionarios;


public class painelcolab extends AppCompatActivity {

    public Button edificacoes,normas,questionarios,equipamentos,laudoPreliminar,laudoFinal,botaoColab;
    public TextView labelEdificacoes,labelNormas,labelQuestionario,labelEquipamento,labelLaudoPrel,labelLaudoFinal,labelColab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painelcolab);

        edificacoes = findViewById(R.id.painelEdificacoessid);
        normas = findViewById(R.id.botaoPainelNormas);
        questionarios = findViewById(R.id.botaoPainelQuestionarios);
        equipamentos = findViewById(R.id.botaoPainelEquipamentos);
        laudoPreliminar = findViewById(R.id.botaoPainelLaudoPreliminar);
        laudoFinal = findViewById(R.id.botaoPainelLaudoFinal);

        //botaoColab = findViewById(R.id.gestaoColab);
        //labelColab = findViewById(R.id.labelGestaoColab);





        edificacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(painelcolab.this, lista_edificacoes.class);
                startActivity(intent);
            }
        });

        normas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(painelcolab.this, lista_normas.class);
                startActivity(intent);
            }
        });

        questionarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(painelcolab.this, lista_questionarios.class);
                startActivity(intent);

            }
        });

        equipamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(painelcolab.this, com.example.laudtec.listas.lista_equipamentos.class);
                startActivity(intent);

            }
        });

        laudoPreliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(painelcolab.this, lista_laudopreliminar.class);
                startActivity(intent);

            }
        });

        laudoFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(painelcolab.this, lista_laudofinal.class);
                startActivity(intent);
            }
        });

    }
}