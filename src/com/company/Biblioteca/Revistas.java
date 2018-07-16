package com.company.Biblioteca;

public class Revistas extends Productos{

    public String numeros;
    public String periodicidad;

    public Revistas(String fechaPublicacion, String nombre) {
        super(fechaPublicacion, nombre);
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
}


