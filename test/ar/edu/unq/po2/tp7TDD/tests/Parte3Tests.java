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
	PokerStatus cartasEnMano;
	
	@BeforeEach
	void setUp() {
		cartasEnMano = new PokerStatus();
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
		/* Carta7 = A diamante, 
		 * carta10 = J diamante*/
		assertTrue(carta7.esDelMismoPalo(carta10));
	}
	@Test
	void noEsDelMismoPalo() {
		/* carta5 = Q trebol, 
		 * carta8 = A pica*/
		assertFalse(carta5.esDelMismoPalo(carta8));
	}
	@Test
	void esDeValorSuperior() {
		/* carta3 = K trebol, 
		 * carta5 = Q trebol*/ 
		assertTrue(carta3.esSuperior(carta5));
		/* carta6 = A trebol, 
		 * carta2 = 5 trebol*/
		assertTrue(carta6.esSuperior(carta2));
		/* carta4 = 10 trebol, 
		 * carta1 = 1 trebol*/
		assertTrue(carta4.esSuperior(carta1));
		
	}
	@Test
	void noEsDeValorSuperior(){
		/* carta10 = J diamante, 
		 * carta5 = Q trebol*/ 
		assertFalse(carta10.esSuperior(carta5));
		/* carta1 = 1 trebol, 
		 * carta8 = A pica*/
		assertFalse(carta1.esSuperior(carta8));
		/* carta5 = Q trebol, 
		 * carta3 = K trebol*/
		assertFalse(carta5.esSuperior(carta3));
	}
	
	@Test
	void verificarQueEsJugadaPoker() {
		/* carta6 = A trebol, 
		 * carta7 = A diamante, 
		 * carta8 = A pica, 
		 * carta9 = A corazon, 
		 * carta10 = J diamante*/
		assertEquals("poker",cartasEnMano.verificar(carta6,carta7,carta8,carta9,carta10));
	}

	@Test 
	void verificarQueEsJugadaTrio() {
		/* carta7 = A diamante, 
		 * carta8 =  A pica, 
		 * carta9 = A corazon, 
		 * carta1 = 1 trebol, 
		 * carta3 = K trebol*/
		assertEquals("trio",cartasEnMano.verificar(carta7,carta8,carta9,carta1,carta3));
	}
	
	@Test
	void verificarQueEsJugadaColor(){
		/* carta2 = 5 trebol, 
		 * carta3 = K trebol, 
		 * carta4 = 10 trebol, 
		 * carta5 = Q trebol, 
		 * carta6 = A trebol*/
		assertEquals("color",cartasEnMano.verificar(carta2,carta3,carta4,carta5,carta6));
	}
	
	@Test
	void verficiarQueNoTieneJugada() {
		/* carta8 =  A pica, 
		 * carta9 = A corazon, 
		 * carta1 = 1 trebol, 
		 * carta10 = J diamante, 
		 * carta4 = 10 trebol */
		assertEquals("nada",cartasEnMano.verificar(carta8,carta9,carta1,carta10,carta4));
	}
}
