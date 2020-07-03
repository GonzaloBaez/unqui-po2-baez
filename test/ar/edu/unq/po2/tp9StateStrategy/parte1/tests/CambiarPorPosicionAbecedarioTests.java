package ar.edu.unq.po2.tp9StateStrategy.parte1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9StateStrategy.parte1.CambiarPorPosicionDeAbecedario;
import ar.edu.unq.po2.tp9StateStrategy.parte1.IFormaDeEncriptado;

class CambiarPorPosicionAbecedarioTests {

	IFormaDeEncriptado cambiarPorPosicionDeAbecedario;
	
	@BeforeEach
	void setUp() {
		cambiarPorPosicionDeAbecedario= new CambiarPorPosicionDeAbecedario();
	}
	
	@Test
	void test() {
		//encriptacion
		assertEquals("8,15,12,1,0,2,21,5,14,0,4,9,1",cambiarPorPosicionDeAbecedario.encriptar("hola buen dia"));
				
		//desencriptacion
		assertEquals("hola buen dia",cambiarPorPosicionDeAbecedario.desencriptar(cambiarPorPosicionDeAbecedario.encriptar("hola buen dia")));

	}

}
