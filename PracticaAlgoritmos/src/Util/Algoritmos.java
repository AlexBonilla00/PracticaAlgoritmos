package Util;

public class Algoritmos {
	/**
     * Calcula el número de fibonacci de un número dado.
     *
     * @param numero el número entero para calcular su fibonacci.
     * @return el número de fibonacci de {@code numero}.
     */
    public static int fibonacci(int numero) {
        if (numero <= 1) {
            return numero;
        }
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }

    /**
     * Calcula el factorial de un número dado.
     *
     * @param numero es el numero entero para calcular su factorial.
     * @return el factorial de {@code numero}.
     */
    public static int factorial(int numero) {
        if (numero <= 1) {
            return 1;
        }
        return numero * factorial(numero - 1);
    }

    /**
     * Verifica si un número dado es primo.
     *
     * @param numero es el número entero a verificar.
     * @return {@code true} si {@code numero} es primo, {@code false} en caso contrario.
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
	
	
	

