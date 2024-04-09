package util;

public abstract class Algoritmos {
	/**
	 * Devuelve el sumatorio del numero especificado
	 * 
	 * @param numero  el numero del que queremos calcular el sumatorio
	 * @return	el sumatorio del numero especificado
	 */
 public static int sumatorio(int numero) {
      int Sumatorio = 0;
      int Contador = numero;

      while (Contador != 0) {
          Sumatorio = Sumatorio + Contador;
          Contador--;
      }
	 return Sumatorio;
 }
}
