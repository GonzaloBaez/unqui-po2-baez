package ar.edu.unq.po2.tp9StateStrategy.parte1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9StateStrategy.parte1.CambiarPorOrdenDePalabras;
import ar.edu.unq.po2.tp9StateStrategy.parte1.IFormaDeEncriptado;

class CambiarPorOrdenDePalabrasTests {

	IFormaDeEncriptado cambiarPorOrdenDePalabras;
	
	@BeforeEach
	void setUp() {
		cambiarPorOrdenDePalabras = new CambiarPorOrdenDePalabras();
	}
	@Test
	void encriptarYDesencriptar() {
		//encriptacion
		assertEquals("encriptar a privado texto",cambiarPorOrdenDePalabras.encriptar("texto privado a encriptar"));
		
		//desencriptacion
		assertEquals("texto privado a encriptar",cambiarPorOrdenDePalabras.desencriptar(cambiarPorOrdenDePalabras.encriptar("texto privado a encriptar")));
	}

}
