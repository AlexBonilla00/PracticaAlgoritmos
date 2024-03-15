package array1;

import java.util.Scanner;

public class array_Raro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Crear un array de 100 enteros para guardar los números aleatorios
int[] numeros = new int[100];

// Generar 100 números aleatorios del 0 al 20 y guardarlos en el array
for (int i = 0; i < 100; i++) {
  numeros[i] = (int) (Math.random() * 21);
}

// Mostrar los números por pantalla separados por espacios
System.out.println("Los números generados son:");
for (int i = 0; i < 100; i++) {
  System.out.print(numeros[i] + " ");
}
System.out.println();

// Pedir al usuario dos valores
System.out.println("Por favor, introduce dos valores:");
System.out.print("Valor 1: ");
int valor1 = sc.nextInt();
System.out.print("Valor 2: ");
int valor2 = sc.nextInt();

// Cerrar el objeto Scanner
sc.close();

// Cambiar todas las ocurrencias del primer valor por el segundo en el array
for (int i = 0; i < 100; i++) {
  if (numeros[i] == valor1) {
    numeros[i] = valor2;
  }
}

// Mostrar los números por pantalla separados por espacios
// Los números que se han cambiado se deben mostrar de un color diferente
// Para ello, usamos los códigos de escape ANSI
// Puedes consultar más códigos de color en el primer enlace
System.out.println("Los números modificados son:");
for (int i = 0; i < 100; i++) {
  if (numeros[i] == valor2) {
    // Usamos el color rojo para los números cambiados
    System.out.print("\u001B[31m" + numeros[i] + "\u001B[0m" + " ");
  } else {
    // Usamos el color blanco para los números originales
    System.out.print("\u001B[37m" + numeros[i] + "\u001B[0m" + " ");
  }
}
System.out.println();

} }