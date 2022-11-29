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

    public List<LaudoFinal> listaEdificacoes;
    public AdapterLaudoFinal(List<LaudoFinal> lista){
        this.listaEdificacoes = lista;
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

        LaudoFinal edificio = listaEdificacoes.get(position);


        holder.compEdificio.setText(edificio.getNomeCompania());
        holder.nomeEdificio.setText(edificio.getNomeEdificio());

    }

    @Override
    public int getItemCount() {
        return listaEdificacoes.size();
    }

    public class LaudoFinalVH extends RecyclerView.ViewHolder {
        TextView nomeEdificio;
        TextView compEdificio;



        public LaudoFinalVH(@NonNull View itemView) {
            super(itemView);

            nomeEdificio = itemView.findViewById(R.id.nomeEdificioid);
            compEdificio = itemView.findViewById(R.id.nomeCompaniaId);
        }
    }

    ;


}
