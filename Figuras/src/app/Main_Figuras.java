package app;
import modelo.Circulo;
import modelo.Triangulo;
import modelo.Rectangulo;
public class Main_Figuras {
	public static void main(String[] args) {
		
		Circulo c1 = new  Circulo(3,3);
	    double area1 = c1.calcularArea();
	    double perimetro1= c1.calcularPerimetro();
	    System.out.println("El area del circulo 1 es: "+ area1);
	    System.out.println("El perimetro del circulo 1 es: "+ perimetro1);
	}
}
