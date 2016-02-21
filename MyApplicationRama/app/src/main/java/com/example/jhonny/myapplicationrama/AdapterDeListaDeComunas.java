package com.example.jhonny.myapplicationrama;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rodrigo on 27/01/2016.
 */
public class AdapterDeListaDeComunas extends BaseAdapter {
    ArrayList<Comuna> comunas;
    private final Context context;
    public AdapterDeListaDeComunas(ArrayList<Comuna> comunas,Context context) {
        this.context=context;
        this.comunas = comunas;
    }
//
    @Override
    public int getCount() {
        return comunas.size();
    }

    @Override
    public Object getItem(int position) {
        return comunas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return comunas.hashCode();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View v= LayoutInflater.from(context).inflate(R.layout.layout_item_de_lista_de_comunas, parent, false);
        TextView texto = (TextView) v.findViewById(R.id.idDeTextViewDeItemDeLista);
        texto.setText(comunas.get(position).getNombreDeComuna());//Me dice el nombre de la comuna x posicion
        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, MainActivityMostrarMapa.class);
                intent.putExtra("clave",comunas.get(position).getImagen());
                context.startActivity(intent);
            }
        });
        return v;
    }


}
