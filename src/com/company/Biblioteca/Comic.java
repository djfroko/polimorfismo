package com.company.Biblioteca;

public class Comic extends Productos {

    public String numeroComic;
    public String coleccion;

    public Comic(String fechaPublicacion, String nombre) {
        super(fechaPublicacion, nombre);
    }

    public String getNumeroComic() {
        return numeroComic;
    }

    public void setNumeroComic(String numeroComic) {
        this.numeroComic = numeroComic;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }
}

