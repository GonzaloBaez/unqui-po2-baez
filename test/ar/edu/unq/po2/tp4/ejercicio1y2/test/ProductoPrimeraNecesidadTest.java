package ar.edu.unq.po2.tp4.ejercicio1y2.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ejercicio1y2.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad pan;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false,10);
		pan = new ProductoPrimeraNecesidad("pan",50d,false,50);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}
	@Test
	
	public void testCalcularDescuento() {
		assertEquals(new Double(25),pan.getPrecio());
	}
}
