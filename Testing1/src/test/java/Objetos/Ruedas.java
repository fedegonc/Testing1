package Objetos;

public class Ruedas {
    private int presion;

    public Ruedas() {
        this.presion = 0;
    }

    public void calibrar() {
        presion = 39;
        System.out.println("Las ruedas se han calibrado a 39 PSI.");
    }

    public int getPresion() {
        return presion;
    }
}