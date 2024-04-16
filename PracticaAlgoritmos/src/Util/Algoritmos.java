package Util;

public abstract class  Algoritmos {
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

}
	

