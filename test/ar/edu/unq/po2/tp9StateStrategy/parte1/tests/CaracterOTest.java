package ar.edu.unq.po2.tp9StateStrategy.parte1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9StateStrategy.parte1.CaracterO;

class CaracterOTest {

CaracterO caracterO;
	
	@BeforeEach
	void setUp() {
		caracterO= new CaracterO();
	}
	@Test
	void recibeLetraOYHayQueCambiarla() {
		assertTrue(caracterO.hayQueCambiarElCaracter('o'));
	}
	@Test
	void recibeLetraAYNoHayQueCambiarla() {
		assertFalse(caracterO.hayQueCambiarElCaracter('a')); 
	}
	@Test
	void retornaLetraSiguienteDeO() {
		assertEquals('u',caracterO.caracterSiguiente());
	}
	@Test
	void retornaLaLetraSiguienteDeOSiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('u',caracterO.cambiarSiguienteSiEsCaracter('o'));
	}
	@Test
	void retornaLaLetraSiguienteDePSiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('p',caracterO.cambiarSiguienteSiEsCaracter('p'));
	}
	@Test
	void retornaLetraAnteriorDeO(){
		assertEquals('i',caracterO.caracterAnterior());
	}
	@Test
	void retornaLaLetraAnteriorDeOSiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('i',caracterO.cambiarAnteriorSiEsCaracter('o'));
	}
	@Test
	void retornaLaLetraAnteriorDeHSiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('h',caracterO.cambiarAnteriorSiEsCaracter('h'));
	}

}
