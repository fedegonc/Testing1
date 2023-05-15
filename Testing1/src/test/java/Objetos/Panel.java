package Objetos;

public class Panel {
    private String marca;
    private Ruedas ruedas;

    public Panel() {
        this.marca = "Tesla";
        this.ruedas = new Ruedas();
    }

    public void mostrarInformacion() {
        System.out.println("Marca del panel: " + marca);
    }

    public Object mostrarPresionRuedas() {
        int presion = ruedas.getPresion();
        System.out.println("Presión de las ruedas: " + presion + " PSI");
        return null;
    }
}