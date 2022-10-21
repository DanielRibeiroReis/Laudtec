package com.example.laudtec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.laudtec.databinding.Questionario5Binding;

public class questionario extends AppCompatActivity {


    RadioGroup radioGroup;
    RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionario);



        addListenerOnButton();
    }

/*
    public void mudaPagina(int id){
        int rec = Integer.parseInt(String.valueOf(id));

        LinearLayout parent = findViewById(R.id.espacoquestionario);
        parent.removeAllViews();
        View childView = LayoutInflater.from(getApplicationContext()).inflate(ESSA PORRA AQUI, parent, false);
        parent.addView(childView);
    }

Olá, aqui é o Daniel de 1:17 da madrugada que desistiu de ser esperto
O metodo comentado é uma tentativa de não ter que repetir 4 metodos em cada listener
O metodo mudaPagina recebe o id que já foi checado quando o radio é pressinado,
porém o parãmetro do inflate carinhosamente apelidado de ESSA PORRA AQUI, não esta aceitando nada fora do padrão
que esta agora de R.layout.questionariox se der um jeito, cada check precisaria somente do mudaPagina(selectedId);
e o salário ó: <
*/


    public void addListenerOnButton() {

            radioGroup = findViewById(R.id.radioGrupoQuestionario);

           radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


               @Override
               public void onCheckedChanged(RadioGroup radioGroup, int i) {



                    int selectedId = radioGroup.getCheckedRadioButtonId();

                    if(selectedId == R.id.radioPagina1){
                        //mudaPagina(selectedId);
                        LinearLayout parent = findViewById(R.id.espacoquestionario);
                        parent.removeAllViews();
                        View childView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.questionario1, parent, false);
                        parent.addView(childView);

                    }

                   if(selectedId == R.id.radioPagina2){
                        //mudaPagina(selectedId);
                       LinearLayout parent = findViewById(R.id.espacoquestionario);
                       parent.removeAllViews();
                       View childView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.questionario2, parent, false);
                       parent.addView(childView);
                   }

                   if(selectedId == R.id.radioPagina3){
                       //mudaPagina(selectedId);
                       LinearLayout parent = findViewById(R.id.espacoquestionario);
                       parent.removeAllViews();
                       View childView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.questionario3, parent, false);
                       parent.addView(childView);
                   }

                   if(selectedId == R.id.radioPagina4){
                       //mudaPagina(selectedId);
                       LinearLayout parent = findViewById(R.id.espacoquestionario);
                       parent.removeAllViews();
                       View childView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.questionario4, parent, false);
                       parent.addView(childView);
                   }

                   if(selectedId == R.id.radioPagina5){
                       //mudaPagina(selectedId);
                       LinearLayout parent = findViewById(R.id.espacoquestionario);
                       parent.removeAllViews();
                       View childView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.questionario5, parent, false);
                       parent.addView(childView);
                   }






                }
            });




        }

    }

