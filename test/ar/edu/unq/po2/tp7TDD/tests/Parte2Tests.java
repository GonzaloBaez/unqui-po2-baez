package ar.edu.unq.po2.tp7TDD.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7TDD.parte2.PokerStatus;

class Parte2Tests {

	PokerStatus cartasEnMano;

	@BeforeEach
	void setUp() {
		cartasEnMano = new PokerStatus();
	}
	
	@Test
	void verificarQueEsJugadaPoker() {
		assertEquals("poker",cartasEnMano.verificar("2T", "3D","2P", "2D", "2C"));
	}

	@Test 
	void verificarQueEsJugadaTrio() {
		assertEquals("trio",cartasEnMano.verificar("2T", "3D","2P", "JD", "2C"));
	}
	
	@Test
	void verificarQueEsJugadaColor(){
		assertEquals("color",cartasEnMano.verificar("KT", "3T","7T", "JT", "2T"));
	}
	
	@Test
	void verficiarQueNoTieneJugada() {
		assertEquals("nada",cartasEnMano.verificar("3T", "7T","QD", "JP", "10C"));
	}
}
