package array1;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int contpos = 0, contnegativo= 0,contceros = 0;
        int numeros [] = new int[10];
        
        System.out.println("Introduce tus numeros");
        for(int i = 0; i<numeros.length;i++){
         numeros [i]= sc.nextInt();
         
        }
        for (int i = 0; i<numeros.length;i++){
        if (numeros[i]<0){
             contnegativo++;  
        }
        if (numeros[i]==0){
            contceros++;
        }
        if (numeros[i]>0){
            contpos++;
        }
        System.out.print(numeros [i]+",");
    }
        System.out.println(""); 
        System.out.println("El onteo negativos es: "+contnegativo);
        System.out.println("El onteo positivos es: "+contpos);
        System.out.println("El onteo ceros es: "+contceros);
        
    }
}