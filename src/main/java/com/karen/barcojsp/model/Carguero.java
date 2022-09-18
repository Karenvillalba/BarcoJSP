
package com.karen.barcojsp.model;


public class Carguero {
    
    private int id;
    private String caracteristicas;
    private String capacidad;
    private String tamaño;

    public Carguero(int id, String caracteristicas, String capacidad, String tamaño) {
        this.id = id;
        this.caracteristicas = caracteristicas;
        this.capacidad = capacidad;
        this.tamaño = tamaño;
    }

    public Carguero() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    
    
}
