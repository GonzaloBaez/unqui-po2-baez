package ar.edu.unq.po2.tp9StateStrategy.parte1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ar.edu.unq.po2.tp9StateStrategy.parte1.CaracterI;

class CaracterITest {
CaracterI caracterI;
	
	@BeforeEach
	void setUp() {
		caracterI= new CaracterI();
	}
	@Test
	void recibeLetraIYHayQueCambiarla() {
		assertTrue(caracterI.hayQueCambiarElCaracter('i'));
	}
	@Test
	void recibeLetraAYNoHayQueCambiarla() {
		assertFalse(caracterI.hayQueCambiarElCaracter('a')); 
	}
	@Test
	void retornaLetraSiguienteDeI() {
		assertEquals('o',caracterI.caracterSiguiente());
	}
	@Test
	void retornaLaLetraSiguienteDeISiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('o',caracterI.cambiarSiguienteSiEsCaracter('i'));
	}
	@Test
	void retornaLaLetraSiguienteDePSiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('p',caracterI.cambiarSiguienteSiEsCaracter('p'));
	}
	@Test
	void retornaLetraAnteriorDeI(){
		assertEquals('e',caracterI.caracterAnterior());
	}
	@Test
	void retornaLaLetraAnteriorDeISiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('e',caracterI.cambiarAnteriorSiEsCaracter('i'));
	}
	@Test
	void retornaLaLetraAnteriorDeHSiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('h',caracterI.cambiarAnteriorSiEsCaracter('h'));
	}

}
