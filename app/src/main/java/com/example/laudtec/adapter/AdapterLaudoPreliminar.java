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

public class AdapterLaudoPreliminar extends RecyclerView.Adapter<AdapterLaudoPreliminar.LaudoPreliminarVH> {

    public List<LaudoFinal> listaEdificacoes;
    public AdapterLaudoPreliminar(List<LaudoFinal> lista){
        this.listaEdificacoes = lista;
    }


    @NonNull
    @Override
    public AdapterLaudoPreliminar.LaudoPreliminarVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listagem_edificacoes,parent,false);

        return new AdapterLaudoPreliminar.LaudoPreliminarVH(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterLaudoPreliminar.LaudoPreliminarVH holder, int position) {

        LaudoFinal edificio = listaEdificacoes.get(position);


        holder.compEdificio.setText(edificio.getNomeCompania());
        holder.nomeEdificio.setText(edificio.getNomeEdificio());

    }

    @Override
    public int getItemCount() {
        return listaEdificacoes.size();
    }

    public class LaudoPreliminarVH extends RecyclerView.ViewHolder {
        TextView nomeEdificio;
        TextView compEdificio;



        public LaudoPreliminarVH(@NonNull View itemView) {
            super(itemView);

            nomeEdificio = itemView.findViewById(R.id.nomeEdificioid);
            compEdificio = itemView.findViewById(R.id.nomeCompaniaId);
        }
    }

    ;


}
