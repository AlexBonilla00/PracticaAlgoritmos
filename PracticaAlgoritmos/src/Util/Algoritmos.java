package Util;

public class Algoritmos {
 	/**
     * Calcula el numero de fibonacci de un numero.
     *
     * @param numero el numero para calcular su fibonacci.
     * @return el número en fibonacci.
     */
    public static int fibonacci(int numero) {
        if (numero <= 1) {
            return numero;
        }
        else {
        	return fibonacci(numero - 1) + fibonacci(numero - 2); 
        }
       
    }
}
