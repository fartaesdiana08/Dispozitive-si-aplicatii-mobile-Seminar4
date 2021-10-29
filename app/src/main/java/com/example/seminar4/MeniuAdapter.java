package com.example.seminar4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MeniuAdapter extends BaseAdapter {

    private List<Meniu> listaMeniuri=new ArrayList<>();

    public MeniuAdapter(List<Meniu> lista){
        listaMeniuri=lista;
    }

    @Override
    public int getCount() {
        return listaMeniuri.size();
    }

    @Override
    public Meniu getItem(int position) {
        return listaMeniuri.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view1=inflater.inflate(R.layout.item_menu, viewGroup, false);
        TextView textNume=view1.findViewById(R.id.tvNume);
        TextView textPret=view1.findViewById(R.id.tvPret);
        TextView textIngrediente=view1.findViewById(R.id.tvIngrediente);

        Meniu temp=listaMeniuri.get(position);
        textNume.setText(temp.getNume());
        textPret.setText(temp.getPret()+"");
        textIngrediente.setText(temp.getIngrediente());

        return view1;
    }

    public void updateList(List<Meniu> lista){
        listaMeniuri.clear();
        listaMeniuri.addAll(lista);

        notifyDataSetChanged();

    }
}
