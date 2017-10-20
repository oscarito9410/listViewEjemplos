package com.oscar_hola_mundo.seleccionmexicana;

import android.support.annotation.DrawableRes;

import java.io.Serializable;

/**
 * Created by oemy9 on 19/10/2017.
 */

public class Jugador  implements Serializable{
    @DrawableRes
    private int imagen;
    private String nombre;
    private String posicion;

    public Jugador(int imagen, String nombre, String posicion) {
        this.imagen = imagen;
        this.nombre=nombre;
        this.posicion=posicion;
    }

    @DrawableRes
    public int getImagen() {
        return imagen;
    }
    public void setImagen(@DrawableRes int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
