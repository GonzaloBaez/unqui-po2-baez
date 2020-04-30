package ar.edu.unq.po2.pruebas;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import unq.Multioperador;

public class MultioperadorTest {
	/** crea un esceneario donde a dinstintas ArrayList se le aplican diferentes
	 * operaciones con Multioperador
	 */
	private ArrayList<Integer> lista1;
	private ArrayList<Integer> lista2;
	private ArrayList<Integer> lista3;
	private ArrayList<Integer> lista4;
	
	Multioperador multioperador;
	
	@BeforeEach
	public void setUp() throws Exception {
		/**
		 * se crean las listas a utilizar con multioperador
		 */
		 lista1 = new ArrayList <Integer>();
		 lista2 = new ArrayList <Integer>();
		 lista3 = new ArrayList <Integer>();
		 lista4 = new ArrayList <Integer>();
		 multioperador = new Multioperador();
		
		
		/**
		 * se agrega los numeros 2,8,5,10 a la lista 1 la cual se va a sumar
		 */
		lista1.add(2); lista1.add(8); lista1.add(5); lista1.add(10);
		/**
		 * se agrega los numeros 50,5,3,2,20,15 a la lista 2 la cual se va a restar
		 */
		lista2.add(50); lista2.add(5); lista2.add(3); lista2.add(2);
		lista2.add(20); lista2.add(15);
		/**
		 * se agrega los numeros 2,4,10,2,2 a la lista 3 la cual se va a multiplicar
		 */
		lista3.add(2); lista3.add(3); lista3.add(10); lista3.add(2);
		lista3.add(2);
		/**
		 * se agrega los numeros 1000,2,10,2,5 a la lista 4 la cual se va a dividir
		 */
		lista4.add(1000); lista4.add(2); lista4.add(10); lista4.add(2);
		lista4.add(5);
		
	}
	/**
	 * se suman todos los numeros de la lista 1
	 */
	@Test
	public void testSumaLista1() {
		assertEquals(25,multioperador.sumar(lista1));
	}
	@Test
	public void testRestaLista2() {
		assertEquals(5,multioperador.resta(lista2));
	}
	
	@Test
	public void testMultiplicacionLista3() {
		assertEquals(240,multioperador.multiplicacion(lista3));
	}
	@Test
	public void testdivisionLista4() {
		assertEquals(5,multioperador.division(lista4));
	}
}
