package com.apps.afis.crismasantuario.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.apps.afis.crismasantuario.Models.Avisos;
import com.apps.afis.crismasantuario.Models.Turmas;
import com.apps.afis.crismasantuario.R;

import java.util.ArrayList;
import java.util.List;

public class RcTurmasAdapter extends RecyclerView.Adapter<RcTurmasAdapter.ViewHolder> {

    List<Turmas> turmasList;
    Context context;

    public RcTurmasAdapter(List<Turmas> turmasList, Context context) {
        this.turmasList = new ArrayList<>(turmasList);
        this.context = context;
    }

    @NonNull
    @Override
    public RcTurmasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.lista_turmas, viewGroup, false);
        return new RcTurmasAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RcTurmasAdapter.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nomeTurma, idTurma;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
