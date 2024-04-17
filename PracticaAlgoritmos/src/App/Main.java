package App;

import java.util.Random;

import Util.Algoritmos;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] resultadoFi= new int[5];
        int[] resultadoFa = new int[5];
        boolean[] resultadoP = new boolean[5];
        Random random = new Random();
        
        
        for (int i = 0; i < 5; i++) {
            numeros[i] = random.nextInt(10) + 1;
            resultadoFi[i] = Algoritmos.fibonacci(numeros[i]);
            resultadoFa[i] = Algoritmos.factorial(numeros[i]);
            resultadoP[i] = Algoritmos.esPrimo(numeros[i]);
            System.out.println(numeros[i]); 
        }

    }
}

