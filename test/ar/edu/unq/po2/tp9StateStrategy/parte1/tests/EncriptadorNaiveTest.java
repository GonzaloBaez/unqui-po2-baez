package ar.edu.unq.po2.tp9StateStrategy.parte1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import ar.edu.unq.po2.tp9StateStrategy.parte1.CambiarPorOrdenDePalabras;
import ar.edu.unq.po2.tp9StateStrategy.parte1.CambiarPorPosicionDeAbecedario;
import ar.edu.unq.po2.tp9StateStrategy.parte1.CambiarPorVocalSiguiente;
import ar.edu.unq.po2.tp9StateStrategy.parte1.EncriptadorNaive;
import ar.edu.unq.po2.tp9StateStrategy.parte1.IFormaDeEncriptado;

class EncriptadorNaiveTest {

	IFormaDeEncriptado cambiarPorPosicionDeAbecedario;
	IFormaDeEncriptado cambiarPorVocal;
	IFormaDeEncriptado cambiarOrdenDePalabras;
	EncriptadorNaive encriptadorNaive;
	
	@BeforeEach
	void setUp() {
		cambiarPorPosicionDeAbecedario = mock(CambiarPorPosicionDeAbecedario.class);
		cambiarPorVocal = mock(CambiarPorVocalSiguiente.class);
		cambiarOrdenDePalabras = mock(CambiarPorOrdenDePalabras.class);
		encriptadorNaive = new EncriptadorNaive();
	}
	
	@Test
	void encriptacionPorOrdenDePalabras() {
		when(cambiarOrdenDePalabras.encriptar("hola buen dia")).thenReturn("buen dia hola");
		encriptadorNaive.cambiarFormaDeEncriptado(cambiarOrdenDePalabras);
		assertEquals("buen dia hola",encriptadorNaive.encriptar("hola buen dia"));
		verify(cambiarOrdenDePalabras).encriptar("hola buen dia");		
	}
	
	@Test
	void encriptarYDesencriptarPorOrdenDePalabras() {
		//Encriptacion
		when(cambiarOrdenDePalabras.encriptar("texto privado a encriptar")).thenReturn("encriptar a privado texto");
		encriptadorNaive.cambiarFormaDeEncriptado(cambiarOrdenDePalabras);
		assertEquals("encriptar a privado texto",encriptadorNaive.encriptar("texto privado a encriptar"));
		verify(cambiarOrdenDePalabras).encriptar("texto privado a encriptar");
		
		//desencriptar lo encriptado
		when(cambiarOrdenDePalabras.desencriptar("encriptar a privado texto")).thenReturn("texto privado a encriptar");
		assertEquals("texto privado a encriptar",encriptadorNaive.desencriptar(encriptadorNaive.encriptar("texto privado a encriptar")));
		verify(cambiarOrdenDePalabras).desencriptar("encriptar a privado texto");
	}
	
	@Test
	void encriptacionYDesencriptacionPorVocal() {
		//encriptacion
		when(cambiarPorVocal.encriptar("hola buen dia")).thenReturn("hule bain doe");
		encriptadorNaive.cambiarFormaDeEncriptado(cambiarPorVocal);
		assertEquals("hule bain doe",encriptadorNaive.encriptar("hola buen dia"));
		verify(cambiarPorVocal).encriptar("hola buen dia");	
		
		//desencriptacion
		when(cambiarPorVocal.desencriptar("hule bain doe")).thenReturn("hola buen dia");
		assertEquals("hola buen dia",encriptadorNaive.desencriptar(encriptadorNaive.encriptar("hola buen dia")));
		verify(cambiarPorVocal).desencriptar("hule bain doe");
	}
	
	@Test
	void encriptacionYDesencriptacionPorPosicionDeAbecedario() {
		when(cambiarPorPosicionDeAbecedario.encriptar("hola buen dia")).thenReturn("8,15,12,1,0,2,21,5,14,0,4,9,1");
		encriptadorNaive.cambiarFormaDeEncriptado(cambiarPorPosicionDeAbecedario);
		assertEquals("8,15,12,1,0,2,21,5,14,0,4,9,1",encriptadorNaive.encriptar("hola buen dia"));
		verify(cambiarPorPosicionDeAbecedario).encriptar("hola buen dia");	
		
		//desencriptacion
		when(cambiarPorPosicionDeAbecedario.desencriptar("8,15,12,1,0,2,21,5,14,0,4,9,1")).thenReturn("hola buen dia");
		assertEquals("hola buen dia",encriptadorNaive.desencriptar(encriptadorNaive.encriptar("hola buen dia")));
		verify(cambiarPorPosicionDeAbecedario).desencriptar("8,15,12,1,0,2,21,5,14,0,4,9,1");
	}
}
