package com.example.laudtec.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laudtec.R;
import com.example.laudtec.model.Colaboradores;

import java.util.List;

public class AdapterColaboradores extends RecyclerView.Adapter<AdapterColaboradores.ColaboradoresVH> {

    public List<Colaboradores> listaColaboradores;
    public AdapterColaboradores(List<Colaboradores> lista){
        this.listaColaboradores = lista;
    }


    @NonNull
    @Override
    public AdapterColaboradores.ColaboradoresVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listagem_edificacoes,parent,false);

        return new AdapterColaboradores.ColaboradoresVH(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterColaboradores.ColaboradoresVH holder, int position) {

        Colaboradores colaboradores = listaColaboradores.get(position);


        holder.cargoColaborador.setText(colaboradores.getNomeCompania());
        holder.nomeColaborador.setText(colaboradores.getNomeEdificio());

    }

    @Override
    public int getItemCount() {
        return listaColaboradores.size();
    }

    public class ColaboradoresVH extends RecyclerView.ViewHolder {
        TextView nomeColaborador;
        TextView cargoColaborador;



        public ColaboradoresVH(@NonNull View itemView) {
            super(itemView);

            nomeColaborador = itemView.findViewById(R.id.nomeEdificioid);
            cargoColaborador = itemView.findViewById(R.id.nomeCompaniaId);
        }
    }

    ;


}