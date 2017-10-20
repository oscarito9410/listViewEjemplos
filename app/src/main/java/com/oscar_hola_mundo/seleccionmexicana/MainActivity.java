package com.oscar_hola_mundo.seleccionmexicana;

import android.app.Dialog;
import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listVJugadores;
    private ArrayList<Jugador>datosJugadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listVJugadores=(ListView)findViewById(R.id.listVJugadores);
        datosJugadores=obtenerJugadores();
        AdapterJugador adapterJugador=new AdapterJugador(this,datosJugadores);
        listVJugadores.setAdapter(adapterJugador);
        listVJugadores.setOnItemClickListener(this);
    }

    private ArrayList<Jugador>obtenerJugadores(){
        ArrayList<Jugador>listJugadores=new ArrayList<>();
        listJugadores.add(new Jugador(R.drawable.guillermo_ochoa,"Guillermo Ochoa","Portero"));
        listJugadores.add(new Jugador(R.drawable.miguel_layun,"Miguel Layun","Defensa"));
        listJugadores.add(new Jugador(R.drawable.hector_moreno,"Hector Moreno","Defensa"));
        listJugadores.add(new Jugador(R.drawable.diego_reyes,"Diego Reyes","Defensa"));
        listJugadores.add(new Jugador(R.drawable.andres_guardado,"Andres Guardado","Medio"));
        listJugadores.add(new Jugador(R.drawable.elias_hernandez_elias,"Elias Hernandez","Medio"));
        listJugadores.add(new Jugador(R.drawable.giovani_dos_santos,"Giovani Dos Santos","Medio"));
        listJugadores.add(new Jugador(R.drawable.hector_herrera,"Hector Herrera","Medio"));
        listJugadores.add(new Jugador(R.drawable.javier_hernandez,"Javier Hernandez","Delantero"));
        listJugadores.add(new Jugador(R.drawable.raul_jimenez,"Raul Jimenez","Delantero"));
        return listJugadores;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Jugador jugador=datosJugadores.get(position);
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, jugador.getNombre());
        startActivity(intent);
    }
}
