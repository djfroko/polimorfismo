package com.company.Biblioteca;

public class Productos {

    String fechaPublicacion;
    String nombre;

    public Productos (String fechaPublicacion, String nombre){

    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
