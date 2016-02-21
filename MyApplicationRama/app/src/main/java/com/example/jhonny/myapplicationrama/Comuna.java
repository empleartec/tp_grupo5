package com.example.jhonny.myapplicationrama;

/**
 * Created by Rodrigo on 27/01/2016.
 */
public class Comuna {
    private  String nombreDeComuna;
    private int imagen;

    public Comuna(String nombreDeComuna,int imagen) {
        this.setNombreDeComuna(nombreDeComuna);
        this.setImagen(imagen);
    }

    public String getNombreDeComuna() {
        return nombreDeComuna;
    }

    public void setNombreDeComuna(String nombreDeComuna) {
        this.nombreDeComuna = nombreDeComuna;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
