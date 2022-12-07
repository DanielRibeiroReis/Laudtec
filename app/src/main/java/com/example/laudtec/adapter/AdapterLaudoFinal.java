package com.example.laudtec.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laudtec.R;
import com.example.laudtec.model.LaudoFinal;

import java.util.List;

public class AdapterLaudoFinal extends RecyclerView.Adapter<AdapterLaudoFinal.LaudoFinalVH> {

    public List<LaudoFinal> listaLaudoFinal;
    public AdapterLaudoFinal(List<LaudoFinal> lista){
        this.listaLaudoFinal = lista;
    }


    @NonNull
    @Override
    public AdapterLaudoFinal.LaudoFinalVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listagem_edificacoes,parent,false);

        return new AdapterLaudoFinal.LaudoFinalVH(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterLaudoFinal.LaudoFinalVH holder, int position) {

        LaudoFinal laudoFinal = listaLaudoFinal.get(position);


        holder.dataAtualizacao.setText(laudoFinal.getDataAtualizacao());
        holder.nomeEdificio.setText(laudoFinal.getNomeEdificio());

    }

    @Override
    public int getItemCount() {
        return listaLaudoFinal.size();
    }

    public class LaudoFinalVH extends RecyclerView.ViewHolder {
        TextView nomeEdificio;
        TextView dataAtualizacao;



        public LaudoFinalVH(@NonNull View itemView) {
            super(itemView);

            nomeEdificio = itemView.findViewById(R.id.nomeEdificioid);
            dataAtualizacao = itemView.findViewById(R.id.nomeCompaniaId);
        }
    }

    ;


}
