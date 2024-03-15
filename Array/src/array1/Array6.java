package array1;

import java.util.Random;

public class Array6 {

    public static void main(String[] args) {
    // Importar la clase Random para generar números aleatorios

    // Crear un objeto de la clase Random
    Random r = new Random();
    
    // Crear un array de 4 filas por 5 columnas
    int[][] array = new int[4][5];
    
    // Recorrer el array y asignarle números aleatorios entre 0 y 9
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        array[i][j] = r.nextInt(10); // Generar un número entre 0 y 9
      }
    }
    
    // Mostrar el array por pantalla
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(array[i][j] + " "); // Imprimir el elemento del array
      }
      System.out.println(); // Cambiar de línea
    }
  } 
      
}