package ar.edu.unq.po2.tp8Observer.parte2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sun.tools.javac.util.List;

import ar.edu.unq.po2.tp8Observer.parte2.AplicacionMovil;
import ar.edu.unq.po2.tp8Observer.parte2.Deporte;
import ar.edu.unq.po2.tp8Observer.parte2.Partido;
import ar.edu.unq.po2.tp8Observer.parte2.Servidor;
import static org.mockito.Mockito.*;

class AplicacionMovilTest {

	AplicacionMovil aplicacion;
	Partido partidoTenis;
	Partido partidoFutbol;
	Deporte tenis;
	Deporte futbol;
	Deporte pingPong;
	Servidor servidorTenisYPingPong;
	Servidor servidorFutbol;
	
	@BeforeEach
	void setUp() {
		aplicacion = new AplicacionMovil();
		partidoTenis = mock(Partido.class);
		partidoFutbol = mock(Partido.class);
		tenis = mock(Deporte.class);
		futbol = mock(Deporte.class);
		pingPong = mock(Deporte.class); 
		servidorTenisYPingPong = mock(Servidor.class);
	    servidorFutbol = mock(Servidor.class);
		
	}
	@Test
	void suscribirseAServidorDeTenisYPingPong() {
		aplicacion.suscribirseAServidor(servidorTenisYPingPong);
		verify(servidorTenisYPingPong).agregarObservador(aplicacion);
	}
	@Test
	void desuscribirseDelServidorDeFutbol() {
		aplicacion.suscribirseAServidor(servidorTenisYPingPong);
		aplicacion.suscribirseAServidor(servidorFutbol);
		aplicacion.desuscribirseAServidor(servidorFutbol);
		verify(servidorFutbol).removerObservador(aplicacion);
	}
	
	@Test
	void nuevoPartidoDeDeporteDeInteres() {
		when(partidoTenis.getDeporte()).thenReturn(tenis);
		when(partidoTenis.getContrincantes()).thenReturn(List.of("roberto","ricardo"));
		
		
		
		aplicacion.suscribirseAServidor(servidorTenisYPingPong);
		aplicacion.agregarDeporteDeInteres(tenis);
		aplicacion.agregarDeporteDeInteres(pingPong);
		aplicacion.agregarContrincanteDeInteres("pepito");
		aplicacion.update(partidoTenis);
		
		verify(partidoTenis).getContrincantes();
		verify(partidoTenis).getDeporte();
		
		
		assertTrue(aplicacion.getDeportesSuscritos().contains(tenis));
		assertTrue(aplicacion.getDeportesSuscritos().contains(pingPong));
		
		assertTrue(aplicacion.getContrincantesSuscritos().contains("pepito"));
		
		assertTrue(aplicacion.getPartidosDeInteres().contains(partidoTenis));
		
	}
}
