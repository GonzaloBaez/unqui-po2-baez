package ar.edu.unq.po2.tp8Observer.parte2.tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8Observer.parte2.AplicacionMovil;
import ar.edu.unq.po2.tp8Observer.parte2.Deporte;
import ar.edu.unq.po2.tp8Observer.parte2.Partido;
import ar.edu.unq.po2.tp8Observer.parte2.Servidor;

class ServidorTest {

	Deporte futbol;
	Deporte tenis;
	Deporte pingPong;
	Servidor servidorDeTenisYPingPong;
	Partido partidoDeFutbol;
	Partido partidoDeTenis;
	Partido partidoDePinPong;
	AplicacionMovil aplicacionPinPong;
	
	@BeforeEach
	void setUp() {
		servidorDeTenisYPingPong = new Servidor();
		futbol = mock(Deporte.class);
		tenis = mock(Deporte.class);
		pingPong = mock(Deporte.class);
		partidoDeFutbol = mock(Partido.class);
		partidoDeTenis = mock(Partido.class);
		partidoDePinPong = mock(Partido.class);
		aplicacionPinPong = mock(AplicacionMovil.class);
	}
	@Test
	void servidorSeSuscribeAFutbolYPingPong() {
		servidorDeTenisYPingPong.suscribirseADeporte(pingPong);
		servidorDeTenisYPingPong.suscribirseADeporte(tenis);
		verify(pingPong).agregarObservador(servidorDeTenisYPingPong);
		verify(tenis).agregarObservador(servidorDeTenisYPingPong);
		assertTrue(servidorDeTenisYPingPong.getDeportesSuscriptos().contains(tenis));
		assertTrue(servidorDeTenisYPingPong.getDeportesSuscriptos().contains(pingPong));
		assertFalse(servidorDeTenisYPingPong.getDeportesSuscriptos().contains(futbol));
		
		when(pingPong.ultimoPartido()).thenReturn(partidoDePinPong);
		//when(tenis.ultimoPartido()).thenReturn(partidoDeTenis);
		
	}
	@Test
	void servidorSeDesuscribeDeFutbol() {
		servidorDeTenisYPingPong.suscribirseADeporte(pingPong);
		servidorDeTenisYPingPong.suscribirseADeporte(tenis);
		servidorDeTenisYPingPong.suscribirseADeporte(futbol);
		verify(pingPong).agregarObservador(servidorDeTenisYPingPong);
		verify(tenis).agregarObservador(servidorDeTenisYPingPong);
		verify(futbol).agregarObservador(servidorDeTenisYPingPong);
		assertTrue(servidorDeTenisYPingPong.getDeportesSuscriptos().contains(tenis));
		assertTrue(servidorDeTenisYPingPong.getDeportesSuscriptos().contains(pingPong));
		assertTrue(servidorDeTenisYPingPong.getDeportesSuscriptos().contains(futbol));
		
		servidorDeTenisYPingPong.desuscribirseADeporte(futbol);
		verify(futbol).removerObservador(servidorDeTenisYPingPong);
		assertTrue(servidorDeTenisYPingPong.getDeportesSuscriptos().contains(tenis));
		assertTrue(servidorDeTenisYPingPong.getDeportesSuscriptos().contains(pingPong));
		assertFalse(servidorDeTenisYPingPong.getDeportesSuscriptos().contains(futbol));
	}
	@Test
	void seAgregaUnaAppMovilAObservadoresDelServidor() {
		servidorDeTenisYPingPong.agregarObservador(aplicacionPinPong);
		assertEquals(1,servidorDeTenisYPingPong.getObservadores().size());
	}
	@Test
	void quitarAppMovilDeObservadores() {
		servidorDeTenisYPingPong.agregarObservador(aplicacionPinPong);
		assertEquals(1,servidorDeTenisYPingPong.getObservadores().size());
		servidorDeTenisYPingPong.removerObservador(aplicacionPinPong);
		assertEquals(0,servidorDeTenisYPingPong.getObservadores().size());
	}
	@Test
	void nuevoPartidoDePingPongYTenis() {
		servidorDeTenisYPingPong.suscribirseADeporte(tenis);
		servidorDeTenisYPingPong.suscribirseADeporte(pingPong);
		when(pingPong.ultimoPartido()).thenReturn(partidoDePinPong);
		when(tenis.ultimoPartido()).thenReturn(null);
		servidorDeTenisYPingPong.update();
		assertTrue(servidorDeTenisYPingPong.getPartidosDeInteres().contains(partidoDePinPong));
		
		when(tenis.ultimoPartido()).thenReturn(partidoDeTenis);
		servidorDeTenisYPingPong.update();
		
		assertTrue(servidorDeTenisYPingPong.getPartidosDeInteres().contains(partidoDePinPong));
		assertTrue(servidorDeTenisYPingPong.getPartidosDeInteres().contains(partidoDeTenis));
		assertEquals(2,servidorDeTenisYPingPong.getPartidosDeInteres().size());
		verify(pingPong,times(2)).ultimoPartido();
		verify(tenis,times(2)).ultimoPartido();
		
	}
	@Test
	void seAgregaUnNuevoPartidoYSeNotificaALaAppMovil() {
		when(pingPong.ultimoPartido()).thenReturn(partidoDePinPong);
		when(tenis.ultimoPartido()).thenReturn(null);
		servidorDeTenisYPingPong.suscribirseADeporte(tenis);
		servidorDeTenisYPingPong.suscribirseADeporte(pingPong);
		
		servidorDeTenisYPingPong.agregarObservador(aplicacionPinPong);
		
		servidorDeTenisYPingPong.update();
		
		verify(aplicacionPinPong).update(partidoDePinPong);
		
	}
}
