package array1;

import java.util.Scanner;

public class Array4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int array []= new int[10];
        System.out.println("Introduce los numeros de tu array");
        for (int i = 0; i < array.length; i++) {
            array [i]= sc.nextInt();
        }
        int valorMax=array[0],valorMin=array[0], posicionPos=0;
        for (int i = 0; i < array.length; i++) {
           
             if (array[i]>valorMax){
               
        }
            if(array[i]<valorMin){
                valorMin= array[i];
            }
    System.out.println(valorMin);
            System.out.println(valorMax);
        }
        }
        
    }
