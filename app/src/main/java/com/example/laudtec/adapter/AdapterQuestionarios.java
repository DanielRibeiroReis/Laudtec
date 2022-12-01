package com.example.laudtec.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laudtec.R;
import com.example.laudtec.model.Questionarios;

import java.util.List;

public class AdapterQuestionarios extends RecyclerView.Adapter<AdapterQuestionarios.QuestionariosVH> {

    public List<Questionarios> listaQuestionarios;
    public AdapterQuestionarios(List<Questionarios> lista){

        this.listaQuestionarios = lista;
    }


    @NonNull
    @Override
    public AdapterQuestionarios.QuestionariosVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listagem_normas,parent,false);

        return new AdapterQuestionarios.QuestionariosVH(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterQuestionarios.QuestionariosVH holder, int position) {

        Questionarios questionarios = listaQuestionarios.get(position);

        holder.nomeQuestionario.setText(questionarios.getNomeQuestionario());
        holder.dataQuestionario.setText(questionarios.getDataQuestionario());


    }

    @Override
    public int getItemCount() {
        return listaQuestionarios.size();
    }

    public class QuestionariosVH extends RecyclerView.ViewHolder {
        TextView nomeQuestionario;
        TextView dataQuestionario;



        public QuestionariosVH(@NonNull View itemView) {
            super(itemView);

            nomeQuestionario = itemView.findViewById(R.id.nomeNormaid);
            dataQuestionario = itemView.findViewById(R.id.nomeDataId);
        }
    }

    ;


}
