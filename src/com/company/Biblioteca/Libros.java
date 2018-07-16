package com.company.Biblioteca;

public class Libros extends Productos {

    public String edicion;
    public String isbn;
    public String autor;

    public Libros(String fechaPublicacion, String nombre) {
        super(fechaPublicacion, nombre);
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

