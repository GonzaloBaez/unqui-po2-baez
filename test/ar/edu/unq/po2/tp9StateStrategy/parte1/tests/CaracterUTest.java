package ar.edu.unq.po2.tp9StateStrategy.parte1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9StateStrategy.parte1.CaracterU;

class CaracterUTest {

CaracterU caracterU;
	
	@BeforeEach
	void setUp() {
		caracterU= new CaracterU();
	}
	@Test
	void recibeLetraUYHayQueCambiarla() {
		assertTrue(caracterU.hayQueCambiarElCaracter('u'));
	}
	@Test
	void recibeLetraIYNoHayQueCambiarla() {
		assertFalse(caracterU.hayQueCambiarElCaracter('i')); 
	}
	@Test
	void retornaLetraSiguienteDeO() {
		assertEquals('a',caracterU.caracterSiguiente());
	}
	@Test
	void retornaLaLetraSiguienteDeUSiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('a',caracterU.cambiarSiguienteSiEsCaracter('u'));
	}
	@Test
	void retornaLaLetraSiguienteDePSiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('p',caracterU.cambiarSiguienteSiEsCaracter('p'));
	}
	@Test
	void retornaLetraAnteriorDeU(){
		assertEquals('o',caracterU.caracterAnterior());
	}
	@Test
	void retornaLaLetraAnteriorDeUSiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('o',caracterU.cambiarAnteriorSiEsCaracter('u'));
	}
	@Test
	void retornaLaLetraAnteriorDeHSiHayQueCambiarSinoRetornaLaMismaLetra() {
		assertEquals('l',caracterU.cambiarAnteriorSiEsCaracter('l'));
	}


}
