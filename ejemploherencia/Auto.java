package com.mycompany.ejemploherencia;

public class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void arrancar() {
        System.out.println("El auto " + marca + " " + modelo + " arranca con botón de encendido.");
    }
} 
