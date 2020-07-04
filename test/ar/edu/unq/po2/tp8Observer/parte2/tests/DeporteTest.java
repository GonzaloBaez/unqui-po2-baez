package ar.edu.unq.po2.tp8Observer.parte2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8Observer.parte2.Deporte;
import ar.edu.unq.po2.tp8Observer.parte2.Partido;
import ar.edu.unq.po2.tp8Observer.parte2.Servidor;

import static org.mockito.Mockito.*;

class DeporteTest {

	Deporte futbol;
	Partido partido1;
	Partido partido2;
	Servidor servidorDeFutbolYTenis;
	Servidor servidorDeTenisYPingPong;
	Servidor servidorDeFutbol;
	
	
	@BeforeEach
	void setUp() {
		futbol = new Deporte();
		partido1 = mock(Partido.class);
		partido2 = mock(Partido.class);
		servidorDeFutbolYTenis = mock(Servidor.class);
		servidorDeTenisYPingPong = mock(Servidor.class);
		servidorDeFutbol = mock(Servidor.class);
	}
	@Test
	void seAgregarUnNuevoObservador() {
		futbol.agregarObservador(servidorDeFutbolYTenis);
		assertEquals(1,futbol.getObservadores().size());
	}
	@Test
	void seAgregaYSeEliminaUnObservador() {
		futbol.agregarObservador(servidorDeFutbolYTenis);
		assertEquals(1,futbol.getObservadores().size());
		futbol.removerObservador(servidorDeFutbolYTenis);
		assertEquals(0,futbol.getObservadores().size());
	}
	@Test
	void seAgregaUnNuevoPartidoYSeAvisaALosObservadores() {
		futbol.agregarObservador(servidorDeFutbolYTenis);
		futbol.agregarObservador(servidorDeFutbol);
		futbol.nuevoPartido(partido1);
		verify(servidorDeFutbolYTenis).update();
		verify(servidorDeFutbol).update();
		assertEquals(1,futbol.getPartidos().size());
	}
	@Test 
	void seObtieneElUltimoPartidoAgregado() {
		futbol.agregarObservador(servidorDeFutbolYTenis);
		futbol.agregarObservador(servidorDeFutbol);
		futbol.nuevoPartido(partido1);
		futbol.nuevoPartido(partido2);
		assertEquals(partido2,futbol.ultimoPartido());
	
	}

}
