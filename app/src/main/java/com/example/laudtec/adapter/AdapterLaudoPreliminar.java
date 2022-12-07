package com.example.laudtec.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laudtec.R;
import com.example.laudtec.model.LaudoPreliminar;

import java.util.List;

public class AdapterLaudoPreliminar extends RecyclerView.Adapter<AdapterLaudoPreliminar.LaudoPreliminarVH> {

    public List<LaudoPreliminar> listaLaudoPreliminar;
    public AdapterLaudoPreliminar(List<LaudoPreliminar> lista){
        this.listaLaudoPreliminar = lista;
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

        LaudoPreliminar laudoPreliminar = listaLaudoPreliminar.get(position);


        holder.compEdificio.setText(laudoPreliminar.getNomeCompania());
        holder.nomeEdificio.setText(laudoPreliminar.getNomeEdificio());

    }

    @Override
    public int getItemCount() {
        return listaLaudoPreliminar.size();
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
