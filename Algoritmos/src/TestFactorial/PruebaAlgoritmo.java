package TestFactorial;
import util.Algoritmos;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Probar test de sumatorio de 4
 */
class PruebaAlgoritmo {

  static Algoritmos Sumatorio;
	@Test
	void SumatorioPrueba() {
		int sumaEsperada=10;
		int sumaObtenida=Algoritmos.sumatorio(4);
		assertEquals(sumaEsperada,sumaObtenida);
		
	}

}
