package TestFactorial;
import util.Factorial;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFactorial {
	/**
	 * Prueba de factorial del numero 4
	 */
	@Test
	void testFactorial() {
	int factorialEsperado=23;
	int factorialObtenido = Factorial.factorial(4);
	assertEquals(factorialEsperado,factorialObtenido);	
	}

}
