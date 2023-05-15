package Objetos;

import java.util.Scanner;

public class Auto {
    private String modelo;
    private Panel panel;
    private Ruedas ruedas;
    private boolean encendido;

    public Auto(String modelo) {
        this.modelo = modelo;
        this.panel = new Panel();
        this.ruedas = new Ruedas();
        this.encendido = false;
    }


    public void encender() {
        encendido = true;
        System.out.println("El auto " + modelo + " se ha encendido.");
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El auto " + modelo + " se ha apagado.");
        } else {
            System.out.println("El auto " + modelo + " ya está apagado.");
        }
    }


    public Panel getPanel() {
        return panel;
    }

    public Ruedas getRuedas() {
        return ruedas;
    }
}