package ar.edu.unq.po2.tp9StateStrategy.parte1.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ar.edu.unq.po2.tp9StateStrategy.parte1.CaracterE;

public class CaracterETest {

CaracterE caracterE;
	
	@BeforeEach
	void setUp() {
		caracterE= new CaracterE();
	}
	@Test
	void recibeLetraEYHayQueCambiarla() {
		assertTrue(caracterE.hayQueCambiarElCaracter('e'));
	}
	@Test
	void recibeLetraUYNoHayQueCambiarla() {
		assertFalse(caracterE.hayQueCambiarElCaracter('u')); 
	}
	@Test
	void retornaLetraSiguienteDeE() {
		assertEquals('i',caracterE.caracterSiguiente());
	}
	@Test
	void retornaLaLetraSiguienteDeESiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('i',caracterE.cambiarSiguienteSiEsCaracter('e'));
	}
	@Test
	void retornaLaLetraSiguienteDeASiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('a',caracterE.cambiarSiguienteSiEsCaracter('a'));
	}
	@Test
	void retornaLetraAnteriorDeE(){
		assertEquals('a',caracterE.caracterAnterior());
	}
	@Test
	void retornaLaLetraAnteriorDeESiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('a',caracterE.cambiarAnteriorSiEsCaracter('e'));
	}
	@Test
	void retornaLaLetraAnteriorDeHSiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('h',caracterE.cambiarAnteriorSiEsCaracter('h'));
	}
}
