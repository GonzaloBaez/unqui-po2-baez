package ar.edu.unq.po2.tp7TDD.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7TDD.parte1.PokerStatus;

public class Parte1Tests {
	
	PokerStatus cartasEnMano;
	
	@BeforeEach
	
	void setUp() {
		cartasEnMano = new PokerStatus();
	}
	
	@Test
	void cuatroPrimerasCartasIgualesEnSuValor() {
		assertTrue(cartasEnMano.verificar("JP","JD","JT","JC","10P"));
	}
	
	@Test
	void cuatroUltimasCartasIgualesEnSuValor() {
		assertTrue(cartasEnMano.verificar("KP","10D","10T","10C","10P"));
	}
	
	@Test
	void dosPrimerasCartasIgualesUnaDiferenteYDosUltimasIgualesEnSuValor() {
		assertTrue(cartasEnMano.verificar("QC","QD","2P","QT","QP"));
	}
	
	@Test
	void todasCartasDistintasEnSuValor(){
		assertFalse(cartasEnMano.verificar("AP","2D","7D","3T","9P"));
	}
	
	@Test
	void dosCartasIgualesYTodasDistintasEnSuValor() {
		assertFalse(cartasEnMano.verificar("AP","AD","8D","KT","QP"));
	}
}
