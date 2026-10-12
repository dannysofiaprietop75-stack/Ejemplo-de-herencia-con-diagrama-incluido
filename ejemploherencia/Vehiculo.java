package com.mycompany.ejemploherencia;
public class Vehiculo {
    // Atributos protegidos para que las subclases puedan acceder a ellos
    protected String marca;
    protected String modelo;

    // Constructor de la superclase
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método general
    public void arrancar() {
        System.out.println("El vehículo está encendiendo...");
    }
}
