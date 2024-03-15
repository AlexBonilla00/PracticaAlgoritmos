package array1;

import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de personas");
        int num = sc.nextInt();
        double media_altura=0,contAltura=0;
        double personas [] = new double [num];
        for (int i = 0; i<personas.length;i++){
            personas [i]= sc.nextDouble();
            media_altura+=personas[i];
        }
        media_altura= media_altura/2;
    }

}