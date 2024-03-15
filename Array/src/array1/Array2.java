package array1;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
       //Hacemos el Scanner
        Scanner sc = new Scanner(System.in);
        //Variables
       int mediaPos=0, mediaNeg=0,Pos=0, Neg=0,sumaPos=0, sumaNeg=0;
        //Array de 10 numeros
       int numeros[] = new int [10];
        
        System.out.println("Introduce los numeros");
       //bucle for para rellenar array + conteo pos,neg y suma de los pos y los neg.
       for(int i=0; i<numeros.length;i++){
            numeros[i] = sc.nextInt();
            
            if(numeros[i]>0){
               sumaPos+=numeros[i];
               Pos++;
            }
             if(numeros[i]<0){
               sumaNeg+=numeros[i];
               Neg++;
        }
             //media positivos y negativos
      
         }mediaNeg =sumaNeg/Neg;
         mediaPos = sumaPos/Pos;
              //imprimir por pantalla
         System.out.println("media negativos: "+mediaNeg);
         System.out.println("media positivos: "+mediaPos);
}}