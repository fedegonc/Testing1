package Scripts;


import Objetos.Auto;
import Objetos.Panel;
import Objetos.Ruedas;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class PruebaIntegracion {

    @Test
    public void test() {
        Auto auto = new Auto("Sedan");
        int valorAire = 39;

        auto.encender();

        Ruedas ruedas = auto.getRuedas();
        Panel panel = auto.getPanel();


        ruedas.calibrar();

        panel.mostrarInformacion();
        assertEquals(valorAire, ruedas.getPresion());

        auto.apagar();
    }

    @Test
    public void test2() {
        Auto auto = new Auto("Sedan");
        String valorAire = "39";

        auto.encender();

        Ruedas ruedas = auto.getRuedas();
        Panel panel = auto.getPanel();


        ruedas.calibrar();

        panel.mostrarInformacion();
        assertEquals(valorAire, ruedas.getPresion());

        auto.apagar();
    }
}
