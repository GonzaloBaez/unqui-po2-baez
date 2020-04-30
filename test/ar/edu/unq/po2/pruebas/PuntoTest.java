package ar.edu.unq.po2.pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Punto;

public class PuntoTest {
	@Test
	public void testConstructor(){
		Punto punto = new Punto(-7,17);
		assertEquals(7,punto.getX());
		assertEquals(17,punto.getY());
	}
	
	@BeforeEach  //crea antes de ejecutar todo
	public void setUp() {}
}
