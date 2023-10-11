package desarrollo.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    void suma() {
        assertEquals(5,calculadora.suma(2,3));
        System.out.println("\nLa suma funciona correctamente");
    }

    @Test
    void resta() {
        assertEquals(2,calculadora.resta(5,3));
        System.out.println("\nLa resta funciona correctamente");
    }

    @Test
    void multiplicacion() {
        assertEquals(9,calculadora.multiplicacion(3,3));
        System.out.println("\nLa multiplicación funciona correctamente");
    }

    @Test
    void division() {
        assertEquals(1,calculadora.division(5,5));
        System.out.println("\nLa división funciona correctamente");
    }

    @Test
    public void testDividirPorCero(){
        try {
            calculadora.division(5,0);
            System.out.println("\n Entré a dividir por cero\n");
            fail("\nSe esperaba un IllegalArgumentException.");
        }catch (IllegalArgumentException e) {
            System.out.println("\nIntenté dividir por cero");
        }

        System.out.println("\nLa división por cero funciona correctamente\n");
    }
}