package ar.edu.unq.po2.tp7TDD.tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7TDD.parte3.Carta;
import ar.edu.unq.po2.tp7TDD.parte3.PokerStatus;
import ar.edu.unq.po2.tp7TDD.parte3.Valor;


class Parte4Tests {
	
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
		//SUT
		cartasEnMano = new PokerStatus();
		//DOC
		carta1 = mock(Carta.class);//new Carta(Valor.UNO,"Trebol");
		carta2 = mock(Carta.class);//new Carta(Valor.CINCO,"Trebol");
		carta3 = mock(Carta.class);//new Carta(Valor.K,"Trebol");
		carta4 = mock(Carta.class);//new Carta(Valor.DIEZ,"Trebol");
		carta5 = mock(Carta.class);//new Carta(Valor.Q,"Trebol");
		carta6 = mock(Carta.class); //new Carta(Valor.A,"Trebol");
		carta7 = mock(Carta.class);//new Carta(Valor.A,"Diamante");
		carta8 = mock(Carta.class);//new Carta(Valor.A,"Pica");
		carta9 = mock(Carta.class);//new Carta(Valor.A,"Corazon");
		carta10 = mock(Carta.class);//new Carta(Valor.J,"Diamante");
		//When
		
		//getValor
		when(carta1.getValor()).thenReturn(Valor.UNO);
		when(carta2.getValor()).thenReturn(Valor.CINCO);
		when(carta3.getValor()).thenReturn(Valor.K);
		when(carta4.getValor()).thenReturn(Valor.DIEZ);
		when(carta5.getValor()).thenReturn(Valor.Q);
		when(carta6.getValor()).thenReturn(Valor.A);
		when(carta7.getValor()).thenReturn(Valor.A);
		when(carta8.getValor()).thenReturn(Valor.A);
		when(carta9.getValor()).thenReturn(Valor.A);
		when(carta10.getValor()).thenReturn(Valor.J);
		// getPalo
		when(carta1.getPalo()).thenReturn("Trebol");
		when(carta2.getPalo()).thenReturn("Trebol");
		when(carta3.getPalo()).thenReturn("Trebol");
		when(carta4.getPalo()).thenReturn("Trebol");
		when(carta5.getPalo()).thenReturn("Trebol");
		when(carta6.getPalo()).thenReturn("Trebol");
		when(carta7.getPalo()).thenReturn("Diamante");
		when(carta8.getPalo()).thenReturn("Pica");
		when(carta9.getPalo()).thenReturn("Corazon");
		when(carta10.getPalo()).thenReturn("Diamante");
		//esDelMismoPalo
		when(carta2.esDelMismoPalo(carta3)).thenReturn(true);
		when(carta2.esDelMismoPalo(carta4)).thenReturn(true);
		when(carta2.esDelMismoPalo(carta5)).thenReturn(true);
		when(carta2.esDelMismoPalo(carta6)).thenReturn(true);
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
