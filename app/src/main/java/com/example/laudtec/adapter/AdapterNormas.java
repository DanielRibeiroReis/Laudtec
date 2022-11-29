package com.example.laudtec.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laudtec.R;
import com.example.laudtec.model.Normas;

import java.util.List;

public class AdapterNormas extends RecyclerView.Adapter<AdapterNormas.NormasVH> {

    public List<Normas> listaNorma;
    public AdapterNormas(List<Normas> lista){

        this.listaNorma = lista;
    }


    @NonNull
    @Override
    public AdapterNormas.NormasVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listagem_normas,parent,false);

        return new AdapterNormas.NormasVH(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterNormas.NormasVH holder, int position) {

        Normas normas = listaNorma.get(position);

        holder.nomeNorma.setText(normas.getDataAdicao());
        holder.nomeData.setText(normas.getNomeNorma());


    }

    @Override
    public int getItemCount() {
        return listaNorma.size();
    }

    public class NormasVH extends RecyclerView.ViewHolder {
        TextView nomeNorma;
        TextView nomeData;



        public NormasVH(@NonNull View itemView) {
            super(itemView);

            nomeNorma = itemView.findViewById(R.id.nomeNormaid);
            nomeData = itemView.findViewById(R.id.nomeDataId);
        }
    }

    ;


}
