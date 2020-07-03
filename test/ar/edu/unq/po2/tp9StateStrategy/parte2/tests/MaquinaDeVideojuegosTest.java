package ar.edu.unq.po2.tp9StateStrategy.parte2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9StateStrategy.parte2.MaquinaDeVideojuegos;

class MaquinaDeVideojuegosTest {

	MaquinaDeVideojuegos marioBross;
	
	@BeforeEach
	void setUp() {
		marioBross = new MaquinaDeVideojuegos();
	}
	
	@Test
	void presionoBotonDeInicioSePrendeLaMaquina() {
		assertEquals("Maquina encendida, ingrese 1 moneda para jugar solo, ingrese 2 para jugar con un amigo",marioBross.presionarBotonInicio());
	
	}

	@Test
	void sePrendeLaMaquinaYSeVuelveApretarElBotonDeInicio() {
		assertEquals("Maquina encendida, ingrese 1 moneda para jugar solo, ingrese 2 para jugar con un amigo",marioBross.presionarBotonInicio());
		assertEquals("No se han ingresado monedas",marioBross.presionarBotonInicio());
		
	}
	@Test 
	void sePrendeLaMaquinaSeIngresaUnaMonedaYSeApretaElBotonDeInicio(){
	
		assertEquals("Maquina encendida, ingrese 1 moneda para jugar solo, ingrese 2 para jugar con un amigo",marioBross.presionarBotonInicio());
		
		assertEquals("Presione Inicio para jugar, o agregue otra moneda para jugar con un amigo",marioBross.agregarMoneda());
		
		assertEquals("Jugando...",marioBross.presionarBotonInicio());
		
	
	}
	@Test
	void sePrendeLaMaquinaSeIngresanDosMonedasYSeApretaElBotonDeInicio() {
	
		assertEquals("Maquina encendida, ingrese 1 moneda para jugar solo, ingrese 2 para jugar con un amigo",marioBross.presionarBotonInicio());
		
		assertEquals("Presione Inicio para jugar, o agregue otra moneda para jugar con un amigo",marioBross.agregarMoneda());
		
		assertEquals("Presione para jugar con un amigo",marioBross.agregarMoneda());
		
		assertEquals("Jugando...",marioBross.presionarBotonInicio());
		
		
	}
	@Test
	void sePrendeLaMaquinaYSeIntentaAgregar3monedas() {
	
		assertEquals("Maquina encendida, ingrese 1 moneda para jugar solo, ingrese 2 para jugar con un amigo",marioBross.presionarBotonInicio());
		
		assertEquals("Presione Inicio para jugar, o agregue otra moneda para jugar con un amigo",marioBross.agregarMoneda());
		
		assertEquals("Presione para jugar con un amigo",marioBross.agregarMoneda());
		
		assertEquals("Se agrego el maximo de monedas",marioBross.agregarMoneda());
	
	
	}
	@Test
	void seTerminaElJuegoYSePuedeVolverAAgregarMonedas() {
	
		assertEquals("Maquina encendida, ingrese 1 moneda para jugar solo, ingrese 2 para jugar con un amigo",marioBross.presionarBotonInicio());
		
		assertEquals("Presione Inicio para jugar, o agregue otra moneda para jugar con un amigo",marioBross.agregarMoneda());
		
		assertEquals("Presione para jugar con un amigo",marioBross.agregarMoneda());
	
		assertEquals("Jugando...",marioBross.presionarBotonInicio());
		
		assertEquals("juego terminado, ingrese 1 moneda para jugar solo, ingrese 2 para jugar con un amigo",marioBross.terminarJuego());
		
		
	}
}
