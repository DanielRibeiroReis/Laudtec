package com.example.laudtec.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laudtec.R;
import com.example.laudtec.model.Edificacoes;

import java.util.List;

public class AdapterEdificacoes extends RecyclerView.Adapter<AdapterEdificacoes.EdificacoesVH> {

    private List<Edificacoes> listaEdificacoes;
    public AdapterEdificacoes(List<Edificacoes> lista){
        this.listaEdificacoes = lista;
    }


    @NonNull
    @Override
    public EdificacoesVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listagem_edificacoes,parent,false);

        return new EdificacoesVH(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull EdificacoesVH holder, int position) {

        Edificacoes edificio = listaEdificacoes.get(position);

        holder.compEdificio.setText(edificio.getNomeCompania());
        holder.nomeEdificio.setText(edificio.getNomeEdificio());

    }

    @Override
    public int getItemCount() {
        return listaEdificacoes.size();
    }

    public class EdificacoesVH extends RecyclerView.ViewHolder {
        TextView nomeEdificio;
        TextView compEdificio;



        public EdificacoesVH(@NonNull View itemView) {
            super(itemView);

            nomeEdificio = itemView.findViewById(R.id.nomeEdificioid);
            compEdificio = itemView.findViewById(R.id.nomeCompaniaId);
        }
    }

    ;


}
