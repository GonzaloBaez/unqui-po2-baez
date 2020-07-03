package ar.edu.unq.po2.tp9StateStrategy.parte1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9StateStrategy.parte1.CaracterA;

class CaracterATest {

	CaracterA caracterA;
	
	@BeforeEach
	void setUp() {
		caracterA = new CaracterA();
	}
	@Test
	void recibeLetraAYHayQueCambiarla() {
		assertTrue(caracterA.hayQueCambiarElCaracter('a'));
	}
	@Test
	void recibeLetraUYNoHayQueCambiarla() {
		assertFalse(caracterA.hayQueCambiarElCaracter('u')); 
	}
	@Test
	void retornaLetraSiguienteDeA() {
		assertEquals('e',caracterA.caracterSiguiente());
	}
	@Test
	void retornaLaLetraSiguienteDeASiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('e',caracterA.cambiarSiguienteSiEsCaracter('a'));
	}
	@Test
	void retornaLaLetraSiguienteDeESiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('e',caracterA.cambiarSiguienteSiEsCaracter('e'));
	}
	@Test
	void retornaLetraAnteriorDeA(){
		assertEquals('u',caracterA.caracterAnterior());
	}
	@Test
	void retornaLaLetraAnteriorDeASiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('u',caracterA.cambiarAnteriorSiEsCaracter('a'));
	}
	@Test
	void retornaLaLetraAnteriorDeHSiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('h',caracterA.cambiarAnteriorSiEsCaracter('h'));
	}

}
