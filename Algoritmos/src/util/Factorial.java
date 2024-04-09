package util;

public class Factorial {
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