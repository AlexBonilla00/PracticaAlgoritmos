package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Util.Algoritmos;

class Tests {
	// Test fibonacci donde  esperamos que sea el numero 1 y vemos el fibonacci del numero 9
	@Test
	void testFibonacci() {
	    int fiboEsp = 1;
	    int fiboObt = Algoritmos.fibonacci(9);
	    assertEquals(fiboEsp, fiboObt);
	}
	// Test de los Factoriales donde el esperado sera 32 y el obtenido sera del factorial numero 6
	@Test
	void testFactorial() {
	    int factEsp = 32; 
	    int factObt = Algoritmos.factorial(6);
	    assertEquals(factEsp, factObt);
	}
	
	// Test De ver si es primo el numero 27
	@Test
	void testEsPrimo() {
	    int numero = 27; 
	    boolean PrimoEsp = true;
	    boolean PrimObt = Algoritmos.esPrimo(numero);
	    assertEquals(PrimoEsp, PrimObt);
	}
}

