package quest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.laudtec.R;
import com.example.laudtec.mostraPDF;


public class questionario extends PDF {


    RadioGroup radioGroup;
    TextView textoNorma,textoEdificio;
   // Boolean ultimaPagina = false;

    EditText crea,responsavel, telefone, email, dataRealizacao, condicaoClimatica,justificatica ;

    String nomeEdificio;

    //View questionario2;

    ConstraintLayout questionario1, questionario2, questionario3, questionario4, questionario5,questionario6,questionario7;
    LinearLayout linear;
    Button Salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionario);

        textoNorma = findViewById(R.id.txtNorma);

        linear = findViewById(R.id.espacoquestionario);

        Salvar = findViewById(R.id.botaoSalvarQuestionario);



        questionario1 = findViewById(R.id.includeLayout1);
        questionario2 = findViewById(R.id.includeLayout2);
        questionario3 = findViewById(R.id.includeLayout3);
        questionario4 = findViewById(R.id.includeLayout4);
        questionario5 = findViewById(R.id.includeLayout5);
        questionario6 = findViewById(R.id.includeLayout6);
        questionario7 = findViewById(R.id.includeLayout7);

        //pegar o nome do edifício do put extra

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                nomeEdificio= null;
            } else {
                nomeEdificio= extras.getString("NOME_EDIFIO_SELEC");
            }
        } else {
            nomeEdificio= (String) savedInstanceState.getSerializable("NOME_EDIFIO_SELEC");
        }

        textoEdificio = findViewById(R.id.nomeEdificioQuest);
        textoEdificio.setText(nomeEdificio);


        //As linhas abaixo foram usadas antes para
        // parent.removeAllViews();
        //View childView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.activity_normas, parent, false);
        //parent.addView(childView);
        //addListenerOnButton();

        Spinner spinner = (Spinner) findViewById(R.id.spinnerLaudo);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapterView = ArrayAdapter.createFromResource(this,
                R.array.normas, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapterView.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapterView);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {//primeiro item
                    textoNorma.setText("laudo spinner 1");
                }
                if (i == 1) {
                    textoNorma.setText("laudo spinner 2");
                }
                if (i == 2) {
                    textoNorma.setText("laudo spinner 3");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        radioGroup = findViewById(R.id.radioGrupoQuestionario);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            //@Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                adapterView.getItemAtPosition(i);
            }
            //@Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }



            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                questionario1.setVisibility(View.GONE);
                questionario2.setVisibility(View.GONE);
                questionario3.setVisibility(View.GONE);
                questionario4.setVisibility(View.GONE);
                questionario5.setVisibility(View.GONE);
                questionario6.setVisibility(View.GONE);
                questionario7.setVisibility(View.GONE);


                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == R.id.radioPagina1) {
                    mostra1();
                        /*
                        LinearLayout parent = findViewById(R.id.espacoquestionario);
                        parent.removeAllViews();
                        View childView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.questionario2, parent, false);
                        parent.addView(childView);
                           */
                }
                if (selectedId == R.id.radioPagina2) {mostra2();}
                if (selectedId == R.id.radioPagina3) {mostra3();}
                if (selectedId == R.id.radioPagina4) {mostra4();}
                if (selectedId == R.id.radioPagina5) {mostra5();}
                if (selectedId == R.id.radioPagina6) {mostra6();}
                if (selectedId == R.id.radioPagina7) {
                    mostra7();
                    Salvar.setText("Salvar");
                    //ultimaPagina = true;
                }else{Salvar.setText("Proximo"); }



            }
        });


        Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questionario7.getVisibility()==View.VISIBLE){//botão inferior se a ultima pagina do questionario estiver ativa
                    Salvar.setText("Salvar");

                    textoNorma = findViewById(R.id.txtNorma);
                    String txtNorma = (String) textoNorma.getText();

                    crea = findViewById(R.id.questionarioCREA);
                    String textoCrea = crea.getText().toString();

                    telefone = findViewById(R.id.questionarioTelefone);
                    String textoTelefone = telefone.getText().toString();

                    responsavel = findViewById(R.id.questionarioResponsavelTecnico);
                    String  textoResponsavel = responsavel.getText().toString();



                    criarPdf(textoCrea,textoResponsavel);

                    Intent intent = new Intent(questionario.this, mostraPDF.class);
                    startActivity(intent);




                   // email = findViewById(R.id.questionarioEmail).toString();
                   // dataRealizacao = findViewById(R.id.questionarioDataRealizacao).toString();
                   // condicaoClimatica = findViewById(R.id.questionarioJustificativa).toString();




                }else{
                    int selectedId = radioGroup.getCheckedRadioButtonId();

                    if(questionario1.getVisibility()==View.VISIBLE){questionario1.setVisibility(View.GONE);mostra2();}else
                    if(questionario2.getVisibility()==View.VISIBLE){questionario2.setVisibility(View.GONE);mostra3();}else
                    if(questionario3.getVisibility()==View.VISIBLE){questionario3.setVisibility(View.GONE);mostra4();}else
                    if(questionario4.getVisibility()==View.VISIBLE){questionario4.setVisibility(View.GONE);mostra5();}else
                    if(questionario5.getVisibility()==View.VISIBLE){questionario5.setVisibility(View.GONE);mostra6();}else
                    if(questionario6.getVisibility()==View.VISIBLE){questionario6.setVisibility(View.GONE);mostra7();Salvar.setText("Salvar");
                    }


                    }
            }
        });


    }

    public void mostra1(){questionario1.setVisibility(View.VISIBLE);}
    public void mostra2(){questionario2.setVisibility(View.VISIBLE);}
    public void mostra3(){questionario3.setVisibility(View.VISIBLE);}
    public void mostra4(){questionario4.setVisibility(View.VISIBLE);}
    public void mostra5(){questionario5.setVisibility(View.VISIBLE);}
    public void mostra6(){questionario6.setVisibility(View.VISIBLE);}
    public void mostra7(){questionario7.setVisibility(View.VISIBLE);}


}






