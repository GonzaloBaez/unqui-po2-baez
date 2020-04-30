package ar.edu.unq.po2.pruebas;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.Counter;


class CounterTestCase {
	private Counter counter;
	
	/**
	 * Crea un escenario de test basico, que consiste en un contador
	 * con 10 enteros
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception{
		// se crea el contador
		counter = new Counter();
		// Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	/**
	 * Verifica la cantidad de pares
	 */
	@Test
	public void testEvenNumbers() {
		// Gettin the even occurrences
		int amount = counter.getEvenOcurrences();
		int impares = counter.getUnevenOcurrences();
		int multiplosDe2 = counter.multiplosDe(2);
		
		// I check the amount is the expected one
		//String a="abc";
		//a.length();
		
		assertEquals(amount,1);
		assertEquals(impares,9);
		assertEquals(multiplosDe2,1);
	}

}
