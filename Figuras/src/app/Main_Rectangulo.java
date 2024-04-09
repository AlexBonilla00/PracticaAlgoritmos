package app;

import modelo.Rectangulo;

public class Main_Rectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new  Rectangulo(4,4);
		Rectangulo r2 = new  Rectangulo(2,3);
	    double area1 = r1.area();
	    double perimetro2= r2.perimetro();
	    System.out.println("El area del rectangulo 1 es: "+ area1);
	    System.out.println("El perimetro del rectangulo 2 es: "+ perimetro2);
	}

}
