package com.example.ramonsl.myjobs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class CategoriaAdapter extends ArrayAdapter<Categoria> {

    public CategoriaAdapter(@NonNull Context context, @NonNull List<Categoria> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_main, parent, false);
        }

        Categoria categoria = getItem(position);

        TextView txtNome = listItemView.findViewById(R.id.);
        ImageView imageView = listItemView.findViewById(R.id.);

        txtNome.setText(categoria.getNome().toString());
        imageView.setImageResource(categoria.getImagem());

        return listItemView;

    }

}

