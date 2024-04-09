package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import modelo.Rectangulo;

class TestRectangulo {

	static Rectangulo r1;
	static Rectangulo r2;
	
	@BeforeAll
	static void setup() {
		r1 = new Rectangulo();
		r2 = new Rectangulo(2,3);
	}
	
	
	@Test
	void areaRectangulo1() {
		double areaEsperada = 1;
		double areaObtenida =r1.area();
		assertEquals(areaEsperada, areaObtenida);
	}
		@Test
		void areaRectangulo2() {
		double area2Esperada = 6;
		double area2Obtenida =r2.area();
		assertEquals(area2Esperada, area2Obtenida);
		}
		@Test
		void perimetroRectangulo1() {
		double perimetro1Esperado = 4;
		double perimetro1Obtenida =r1.perimetro();
		assertEquals(perimetro1Esperado, perimetro1Obtenida);
		}
		@Test
		void perimetroRectangulo2() {
		double perimetro2Esperado = 10;
		double perimetro2Obtenida =r2.perimetro();
		assertEquals(perimetro2Esperado, perimetro2Obtenida);
	}
	static Rectangulo r3;
	static Rectangulo r4;

}
