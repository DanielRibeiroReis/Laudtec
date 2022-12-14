package com.example.laudtec.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laudtec.R;
import com.example.laudtec.model.Equipamentos;

import java.util.List;

public class AdapterEquipamentos extends RecyclerView.Adapter<AdapterEquipamentos.EquipamentosVH> {

    public List<Equipamentos> listaEquipamentos;
    public AdapterEquipamentos(List<Equipamentos> lista){
        this.listaEquipamentos = lista;
    }


    @NonNull
    @Override
    public AdapterEquipamentos.EquipamentosVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listagem_edificacoes,parent,false);

        return new AdapterEquipamentos.EquipamentosVH(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterEquipamentos.EquipamentosVH holder, int position) {

        Equipamentos equipamentos = listaEquipamentos.get(position);


        holder.nomeEquipamento.setText(equipamentos.getNomeEquipamentos());
        holder.modeloEquipamento.setText(equipamentos.getModeloEquipamentos());

    }

    @Override
    public int getItemCount() {
        return listaEquipamentos.size();
    }

    public class EquipamentosVH extends RecyclerView.ViewHolder {
        TextView nomeEquipamento;
        TextView modeloEquipamento;



        public EquipamentosVH(@NonNull View itemView) {
            super(itemView);

            nomeEquipamento = itemView.findViewById(R.id.nomeEdificioid);
            modeloEquipamento = itemView.findViewById(R.id.nomeCompaniaId);
        }
    }

    ;


}