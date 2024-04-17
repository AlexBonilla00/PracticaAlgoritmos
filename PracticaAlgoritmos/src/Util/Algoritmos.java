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
    
    /**
     * Calcula el factorial de un numero.
     *
     * @param n El numero del cual se calculará el factorial.
     * @return El factorial del numero n.
     */
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    /**
     * Verifica si el numero es primo o no, en true o false.
     *
     * @param numero  numero entero a verificar.
     * @return true si no es primo  y false si es primo .
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
