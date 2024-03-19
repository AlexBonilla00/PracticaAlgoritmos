package app;
	import modelo.Circulo;
public class Main_Circulo {

		public static void main(String[] args) {
			Circulo c1 = new  Circulo(4.24,4.12);
			Circulo c2 = new  Circulo(2.22,3.62);
		    double area1 = c1.calcularArea();
		    double perimetro2= c2.calcularPerimetro();
		    System.out.println("El area del circulo 1 es: "+ area1);
		    System.out.println("El perimetro del circulo 2 es: "+ perimetro2);
		}

	}
