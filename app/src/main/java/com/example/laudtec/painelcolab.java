package com.example.laudtec;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.laudtec.listas.lista_edificacoes;
import com.example.laudtec.listas.lista_normas;


public class painelcolab extends AppCompatActivity {

    public Button edificacoes,normas,questionarios,equipamentos,laudoPreliminar,laudoFinal,botaoColab;
    public TextView labelEdificacoes,labelNormas,labelQuestionario,labelEquipamento,labelLaudoPrel,labelLaudoFinal,labelColab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paineladm);

        edificacoes = findViewById(R.id.painelEdificacoessid);
        normas = findViewById(R.id.botaoPainelNormas);
        questionarios = findViewById(R.id.botaoPainelQuestionarios);
        equipamentos = findViewById(R.id.botaoPainelEquipamentos);
        laudoPreliminar = findViewById(R.id.botaoPainelLaudoPreliminar);
        laudoFinal = findViewById(R.id.botaoPainelLaudoFinal);

        botaoColab = findViewById(R.id.gestaoColab);
        labelColab = findViewById(R.id.labelGestaoColab);





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
                // Intent intent = new Intent(painecolab.this, Questionarios.class);
                // startActivity(intent);
                Toast.makeText(painelcolab.this, "Questionarios", Toast.LENGTH_SHORT).show();
            }
        });

        equipamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(painecolab.this, Equipamentos.class);
                //startActivity(intent);
                Toast.makeText(painelcolab.this, "equipamentos", Toast.LENGTH_SHORT).show();
            }
        });

        laudoPreliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(painecolab.this, Equipamentos.class);
                //startActivity(intent);
                Toast.makeText(painelcolab.this, "laudo preliminar", Toast.LENGTH_SHORT).show();
            }
        });

        laudoFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(painecolab.this, Equipamentos.class);
                //startActivity(intent);
                Toast.makeText(painelcolab.this, "laudo final", Toast.LENGTH_SHORT).show();
            }
        });

    }
}