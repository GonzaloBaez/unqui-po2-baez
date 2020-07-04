package ar.edu.unq.po2.tp8Observer.parte2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8Observer.parte2.Deporte;
import ar.edu.unq.po2.tp8Observer.parte2.Partido;
import static org.mockito.Mockito.*;

import java.util.List;

class PartidoTest {

	Partido partido;
	Deporte futbol;
	@BeforeEach
	void setUp() {
		futbol = mock(Deporte.class);
		partido = new Partido(futbol,"2-1",List.of("river","boca"));
	}
	@Test
	void testDeGetters() {
		assertEquals(futbol,partido.getDeporte());
		assertEquals("2-1",partido.getResultado());
		assertEquals(List.of("river","boca"),partido.getContrincantes());
	}

}
