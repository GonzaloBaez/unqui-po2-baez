package ar.edu.unq.po2.tp9StateStrategy.parte1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9StateStrategy.parte1.CambiarPorVocalSiguiente;
import ar.edu.unq.po2.tp9StateStrategy.parte1.IFormaDeEncriptado;
import ar.edu.unq.po2.tp9StateStrategy.parte1.TransformadorDeCaracteres;
import static org.mockito.Mockito.*;

class CambiarPorVocalSiguienteTests {

	IFormaDeEncriptado cambiarPorVocalSiguiente;
	TransformadorDeCaracteres transformadorDeCaracteres;
	
	@BeforeEach
	void setUp() {
		transformadorDeCaracteres = mock(TransformadorDeCaracteres.class);
		cambiarPorVocalSiguiente = new CambiarPorVocalSiguiente(transformadorDeCaracteres);
		when(transformadorDeCaracteres.convertirCaracterSiguiente('a')).thenReturn('e');
		when(transformadorDeCaracteres.convertirCaracterSiguiente('e')).thenReturn('i');
		when(transformadorDeCaracteres.convertirCaracterSiguiente('i')).thenReturn('o');
		when(transformadorDeCaracteres.convertirCaracterSiguiente('o')).thenReturn('u');
		when(transformadorDeCaracteres.convertirCaracterSiguiente('u')).thenReturn('a');
		when(transformadorDeCaracteres.convertirCaracterSiguiente('h')).thenReturn('h');
		when(transformadorDeCaracteres.convertirCaracterSiguiente('l')).thenReturn('l');
		when(transformadorDeCaracteres.convertirCaracterSiguiente('b')).thenReturn('b');
		when(transformadorDeCaracteres.convertirCaracterSiguiente('n')).thenReturn('n');
		when(transformadorDeCaracteres.convertirCaracterSiguiente('d')).thenReturn('d');
		when(transformadorDeCaracteres.convertirCaracterSiguiente(' ')).thenReturn(' ');
		
		when(transformadorDeCaracteres.convertirCaracterAnterior('a')).thenReturn('u');
		when(transformadorDeCaracteres.convertirCaracterAnterior('e')).thenReturn('a');
		when(transformadorDeCaracteres.convertirCaracterAnterior('i')).thenReturn('e');
		when(transformadorDeCaracteres.convertirCaracterAnterior('o')).thenReturn('i');
		when(transformadorDeCaracteres.convertirCaracterAnterior('u')).thenReturn('o');
		when(transformadorDeCaracteres.convertirCaracterAnterior('h')).thenReturn('h');
		when(transformadorDeCaracteres.convertirCaracterAnterior('l')).thenReturn('l');
		when(transformadorDeCaracteres.convertirCaracterAnterior('b')).thenReturn('b');
		when(transformadorDeCaracteres.convertirCaracterAnterior('n')).thenReturn('n');
		when(transformadorDeCaracteres.convertirCaracterAnterior('d')).thenReturn('d');
		when(transformadorDeCaracteres.convertirCaracterAnterior(' ')).thenReturn(' ');
	}
	
	@Test
	void test() {
		//encriptacion
		assertEquals("hule bain doe",cambiarPorVocalSiguiente.encriptar("hola buen dia"));
		
		//assertEquals("hule bain doe","hola buen dia".toCharArray()); como se ve un string convertido a array
				
		//desencriptacion
		assertEquals("hola buen dia",cambiarPorVocalSiguiente.desencriptar(cambiarPorVocalSiguiente.encriptar("hola buen dia")));

	}
}
