package ar.edu.unq.po2.tp9StateStrategy.parte3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9StateStrategy.parte3.Mp3;
import ar.edu.unq.po2.tp9StateStrategy.parte3.Song;
import static org.mockito.Mockito.*;

class ReproductorMp3Test {

	Mp3 reproductorMp3;
	Song cancion;
	@BeforeEach
	void setUp() {
		cancion = mock(Song.class);
		reproductorMp3 = new Mp3();
		reproductorMp3.setCancionSeleccionada(cancion);
	}
	@Test
	void presionoPlay(){
		assertEquals("reproduciendo cancion",reproductorMp3.play());
		verify(cancion).play();
	}
	@Test
	void presionoPausa() {
		assertEquals("estas en modo seleccion, no se puede pausar",reproductorMp3.pause());
	}
	@Test
	void presionoStop() {
		assertEquals(null,reproductorMp3.stop());
	}
	@Test
	void presionoPlayDosVeces() {
		assertEquals("reproduciendo cancion",reproductorMp3.play());
		assertEquals("ya se esta reproduciendo la cancion",reproductorMp3.play());
	}
	@Test
	void presionoPlayYDespuesPausa() {
		assertEquals("reproduciendo cancion",reproductorMp3.play());
		verify(cancion).play();
		assertEquals("cancion pausada",reproductorMp3.pause());
		verify(cancion).pause();
	}
	@Test
	void presionoPlayYDespuesStop() {
		assertEquals("reproduciendo cancion",reproductorMp3.play());
		verify(cancion).play();
		assertEquals("Cancion detenida, seleccione una cancion",reproductorMp3.stop());
		verify(cancion).stop();
	}
	@Test 
	void presionoPlayPausaYPlay(){
		assertEquals("reproduciendo cancion",reproductorMp3.play());
		verify(cancion).play();
		assertEquals("cancion pausada",reproductorMp3.pause());
		verify(cancion).pause();
		assertEquals("Estas en modo pausa, presionar pause para seguir reproduciendo la cancion",reproductorMp3.play());
	}
	@Test
	void presionoPlayPausaYPausa() {
		assertEquals("reproduciendo cancion",reproductorMp3.play());
		assertEquals("cancion pausada",reproductorMp3.pause());
		verify(cancion).pause();
		assertEquals("reproduciendo cancion",reproductorMp3.pause());
		verify(cancion,times(2)).play();
	}
	void presionoPlayPausaYStop() {
		assertEquals("reproduciendo cancion",reproductorMp3.play());
		verify(cancion).play();
		assertEquals("cancion pausada",reproductorMp3.pause());
		verify(cancion).pause();
		assertEquals("Cancion detenida, seleccione una cancion",reproductorMp3.stop());
		verify(cancion).stop();
	}
}
