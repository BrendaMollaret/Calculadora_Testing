package desarrollo.calculadora;

public class Calculadora {

    public int suma (int var1, int var2) {
        int resultadoSuma = var1 + var2;
        return  resultadoSuma;
    }

    public int resta(int var1, int var2) {
        int resultadoResta = var1 - var2;
        return resultadoResta;
    }

    public int multiplicacion(int var1, int var2) {
        int resultadoMultiplicacion = var1 * var2;
        return resultadoMultiplicacion;
    }

    public int division(int var1, int var2){
        if (var2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        } else {
            int resultadoDivision = (var1 / var2);
            return resultadoDivision;
        }
    }




}
