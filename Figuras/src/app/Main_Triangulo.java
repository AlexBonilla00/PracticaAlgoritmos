package app;
import modelo.Triangulo;
public class Main_Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo t1 = new  Triangulo(3.14,5.12);
		Triangulo t2 = new  Triangulo(2.55,4.99);
	    double area1 = t1.calcularArea();
	    System.out.println("El area del triangulo 1 es: "+ area1);

	}

}

