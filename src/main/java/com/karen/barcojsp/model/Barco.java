package com.karen.barcojsp.model;

public class Barco {

    private static void alarma() {
        Barco b = new Barco(1, "La Perla Negra", "2013", "Madera Cafe", "Carguero", 1980);
      //  b = new Barco(2, "Barco 2", "Placa", "Color", "Velero", 2009);
        //b = new Barco(3, "Barco 3", "Placa", "Color", "DeVapor", 1930);
        Carguero c = new Carguero();
        DeVapor d = new DeVapor();
        Velero v = new Velero();

        System.out.println("****** BARCO A HABILITADO PARA EL PUERTO ACTUAL ****");

        System.out.println("Id: " + b.getId());
        System.out.println("Nombre: " + b.getNombre());
        System.out.println("Placa: " + b.getPlaca());
        System.out.println("Color: " + b.getColor());
        System.out.println("Tipo: " + b.getTipo());
        System.out.println("Año: " + b.getAño());

        if (b.getTipo().equals("Velero")) {
            v = new Velero(3, "Botavara, Mástil, Orza, Son algunas de las Partes un BARCO VELERO", "9 / 11 pasajeros", "4.6 metros");
            System.out.println("Caracteristicas: " + v.getCaracteristicas());
            System.out.println("Capacidad: " + v.getCapacidad());
            System.out.println("Tamaño: " + v.getTamaño());
        } else if (b.getTipo().equals("DeVapor")) {
            d = new DeVapor(2, "26 Pasajeros", "50 metros");
            System.out.println("Capacidad: " + d.getCapacidad());
            System.out.println("Tamaño: " + d.getTamaño());
        } else if (b.getTipo().equals("Carguero")) {
            c = new Carguero(1, "Aleta, Amura,Costado, Quilla, Son algunas de las Partes un BARCO VELERO", "20 a 40 personas", "350 metros");
            System.out.println("Caracteristicas: " + c.getCaracteristicas());
            System.out.println("Capacidad: " + c.getCapacidad());
            System.out.println("Tamaño: " + c.getTamaño());
        }

    }
    private int id;
    private String nombre;
    private String placa;
    private String color;
    private String tipo;
    private int año;

    public static void main(String[] args) {

        alarma();
    }

    public Barco(int id, String nombre, String placa, String color, String tipo, int año) {
        this.id = id;
        this.nombre = nombre;
        this.placa = placa;
        this.color = color;
        this.tipo = tipo;
        this.año = año;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

}
