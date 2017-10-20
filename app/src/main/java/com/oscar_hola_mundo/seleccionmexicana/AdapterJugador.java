package com.oscar_hola_mundo.seleccionmexicana;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by oemy9 on 19/10/2017.
 */

public class AdapterJugador extends BaseAdapter {

    private Context context;
    private ArrayList<Jugador>listJugadores;
    private LayoutInflater layoutInflater;

    public AdapterJugador(Context context, ArrayList<Jugador>listJugadores) {
        this.context=context;
        this.listJugadores=listJugadores;
        this.layoutInflater=LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        return listJugadores.size();
    }

    @Override
    public Jugador getItem(int position) {
        return listJugadores.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=layoutInflater.inflate(R.layout.item_jugador,parent,false);
        ImageView imgJugador=(ImageView)convertView.findViewById(R.id.imageJugador);
        TextView tvNombre=(TextView)convertView.findViewById(R.id.tvNombre);
        TextView tvPosicion=(TextView)convertView.findViewById(R.id.tvPosicion);
        Picasso.with(this.context).load(getItem(position).getImagen()).fit().into(imgJugador);
        tvNombre.setText(getItem(position).getNombre());
        tvPosicion.setText(getItem(position).getPosicion());
        return convertView;
    }
}
