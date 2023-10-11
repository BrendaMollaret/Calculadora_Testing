package desarrollo.calculadora;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    void suma() {
        assertEquals(5,calculadora.suma(2,3));
        System.out.println("La suma funciona correctamente");
    }

    @Test
    void resta() {
        assertEquals(2,calculadora.resta(5,3));
        System.out.println("La resta funciona correctamente");
    }

    @Test
    void multiplicacion() {
        assertEquals(9,calculadora.multiplicacion(3,3));
        System.out.println("La multiplicación funciona correctamente");
    }

    @Test
    void division() {
        assertEquals(1,calculadora.division(5,5));
        System.out.println("La división funciona correctamente");
    }

    @Test
    public void testDividirPorCero(){
        try {
            calculadora.division(5,0);
            System.out.println("\n Entré a dividir por cero\n");
            fail("\nSe esperaba un IllegalArgumentException.");
        }catch (IllegalArgumentException e) {
            System.out.println("Intenté dividir por cero");
        }

        System.out.println("La división por cero funciona correctamente");
    }


    /*

    También se podria hacer de esta manera
    @Test
    public void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            calculadora.division(5,0);
        });
        System.out.println("Division por cero");
    }

    */

    //---------------------------------------------------------
    //Anotaciones para determinados pedazos de codigos que querramos correr antes,
    // despues de nuestros test

    @BeforeEach
    public void beforeEach() {
        System.out.println("@beforeEach");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("@afterEach\n");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("\n@beforeAll\n");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("@afterAll\n");
    }
}