
package com.karen.barcojsp.model;


public class DeVapor {
    private int id;
    private String capacidad;
    private String tamaño;

    public DeVapor(int id, String capacidad, String tamaño) {
        this.id = id;
        this.capacidad = capacidad;
        this.tamaño = tamaño;
    }

    public DeVapor() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
