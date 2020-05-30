package ar.edu.unq.po2.tp7TDD.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7TDD.parte3.Carta;
import ar.edu.unq.po2.tp7TDD.parte3.PokerStatus;
import ar.edu.unq.po2.tp7TDD.parte3.Valor;

class Parte3Tests {
	
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;
	Carta carta6;
	Carta carta7;
	Carta carta8;
	Carta carta9;
	Carta carta10;
	PokerStatus manoDeCartas;
	
	@BeforeEach
	void setUp() {
		carta1 = new Carta(Valor.UNO,"Trebol");
		carta2 = new Carta(Valor.CINCO,"Trebol");
		carta3 = new Carta(Valor.K,"Trebol");
		carta4 = new Carta(Valor.DIEZ,"Trebol");
		carta5 = new Carta(Valor.Q,"Trebol");
		carta6 = new Carta(Valor.A,"Trebol");
		carta7 = new Carta(Valor.A,"Diamante");
		carta8 = new Carta(Valor.A,"Pica");
		carta9 = new Carta(Valor.A,"Corazon");
		carta10 = new Carta(Valor.J,"Diamante");
		
	}
	@Test
	void pruebaDeConstructorDeCarta() {
		assertEquals(carta1.getValor(),Valor.UNO);
		assertEquals(carta1.getPalo(),"Trebol");
	}
	
	@Test
	void esDelMismoPalo() {
		assertTrue(carta7.esDelMismoPalo(carta10));
	}
	@Test
	void noEsDelMismoPalo() {
		assertFalse(carta5.esDelMismoPalo(carta8));
	}
	@Test
	void esDeValorSuperior() {
		assertTrue(carta3.esSuperior(carta5));
		assertTrue(carta6.esSuperior(carta2));
		assertTrue(carta4.esSuperior(carta1));
		
	}
	@Test
	void noEsDeValorSuperior(){
		assertFalse(carta10.esSuperior(carta5));
		assertFalse(carta1.esSuperior(carta8));
		assertFalse(carta5.esSuperior(carta3));
	}
}
