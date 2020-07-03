package ar.edu.unq.po2.tp9StateStrategy.parte1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9StateStrategy.parte1.CaracterA;
import ar.edu.unq.po2.tp9StateStrategy.parte1.CaracterATransformar;
import ar.edu.unq.po2.tp9StateStrategy.parte1.CaracterE;
import ar.edu.unq.po2.tp9StateStrategy.parte1.CaracterI;
import ar.edu.unq.po2.tp9StateStrategy.parte1.CaracterO;
import ar.edu.unq.po2.tp9StateStrategy.parte1.CaracterU;
import ar.edu.unq.po2.tp9StateStrategy.parte1.TransformadorDeCaracteres;

import static org.mockito.Mockito.*;

class TranformadorDeCaracteresTest {
	
	TransformadorDeCaracteres transformador;
	CaracterATransformar caracterA;
	CaracterATransformar caracterE;
	CaracterATransformar caracterI;
	CaracterATransformar caracterO;
	CaracterATransformar caracterU;
	
	@BeforeEach
	void setUp() {
		transformador = new TransformadorDeCaracteres();
		caracterA = mock(CaracterA.class);
		caracterE = mock(CaracterE.class);
		caracterI = mock(CaracterI.class);
		caracterO = mock(CaracterO.class);
		caracterU = mock(CaracterU.class);
		
		transformador.agregarCaracter(caracterA);
		transformador.agregarCaracter(caracterE);
		transformador.agregarCaracter(caracterI);
		transformador.agregarCaracter(caracterO);
		transformador.agregarCaracter(caracterU);
		//vocales
		when(caracterA.cambiarSiguienteSiEsCaracter('a')).thenReturn('e');
		when(caracterA.cambiarSiguienteSiEsCaracter('e')).thenReturn('e');
		when(caracterA.cambiarSiguienteSiEsCaracter('i')).thenReturn('i');
		when(caracterA.cambiarSiguienteSiEsCaracter('o')).thenReturn('o');
		when(caracterA.cambiarSiguienteSiEsCaracter('u')).thenReturn('u');
		
		
		when(caracterE.cambiarSiguienteSiEsCaracter('e')).thenReturn('i');
		when(caracterE.cambiarSiguienteSiEsCaracter('a')).thenReturn('a');
		when(caracterE.cambiarSiguienteSiEsCaracter('i')).thenReturn('i');
		when(caracterE.cambiarSiguienteSiEsCaracter('o')).thenReturn('o');
		when(caracterE.cambiarSiguienteSiEsCaracter('u')).thenReturn('u');
		
		when(caracterI.cambiarSiguienteSiEsCaracter('i')).thenReturn('o');
		when(caracterI.cambiarSiguienteSiEsCaracter('a')).thenReturn('a');
		when(caracterI.cambiarSiguienteSiEsCaracter('e')).thenReturn('e');
		when(caracterI.cambiarSiguienteSiEsCaracter('o')).thenReturn('o');
		when(caracterI.cambiarSiguienteSiEsCaracter('u')).thenReturn('u');
		
		when(caracterO.cambiarSiguienteSiEsCaracter('o')).thenReturn('u');
		when(caracterO.cambiarSiguienteSiEsCaracter('a')).thenReturn('a');
		when(caracterO.cambiarSiguienteSiEsCaracter('e')).thenReturn('e');
		when(caracterO.cambiarSiguienteSiEsCaracter('i')).thenReturn('i');
		when(caracterO.cambiarSiguienteSiEsCaracter('u')).thenReturn('u');
		
		when(caracterU.cambiarSiguienteSiEsCaracter('u')).thenReturn('a');
		when(caracterU.cambiarSiguienteSiEsCaracter('a')).thenReturn('a');
		when(caracterU.cambiarSiguienteSiEsCaracter('e')).thenReturn('e');
		when(caracterU.cambiarSiguienteSiEsCaracter('i')).thenReturn('i');
		when(caracterU.cambiarSiguienteSiEsCaracter('o')).thenReturn('o');
		//consonante
		when(caracterA.cambiarSiguienteSiEsCaracter('t')).thenReturn('t');
		when(caracterE.cambiarSiguienteSiEsCaracter('t')).thenReturn('t');
		when(caracterI.cambiarSiguienteSiEsCaracter('t')).thenReturn('t');
		when(caracterO.cambiarSiguienteSiEsCaracter('t')).thenReturn('t');
		when(caracterU.cambiarSiguienteSiEsCaracter('t')).thenReturn('t');
		//espacio
		when(caracterA.cambiarSiguienteSiEsCaracter(' ')).thenReturn(' ');
		when(caracterE.cambiarSiguienteSiEsCaracter(' ')).thenReturn(' ');
		when(caracterI.cambiarSiguienteSiEsCaracter(' ')).thenReturn(' ');
		when(caracterO.cambiarSiguienteSiEsCaracter(' ')).thenReturn(' ');
		when(caracterU.cambiarSiguienteSiEsCaracter(' ')).thenReturn(' ');
		//vocales
		when(caracterA.cambiarAnteriorSiEsCaracter('a')).thenReturn('u');
		when(caracterA.cambiarAnteriorSiEsCaracter('e')).thenReturn('e');
		when(caracterA.cambiarAnteriorSiEsCaracter('i')).thenReturn('i');
		when(caracterA.cambiarAnteriorSiEsCaracter('o')).thenReturn('o');
		when(caracterA.cambiarAnteriorSiEsCaracter('u')).thenReturn('u');
		
		when(caracterE.cambiarAnteriorSiEsCaracter('e')).thenReturn('a');
		when(caracterE.cambiarAnteriorSiEsCaracter('a')).thenReturn('a');
		when(caracterE.cambiarAnteriorSiEsCaracter('i')).thenReturn('i');
		when(caracterE.cambiarAnteriorSiEsCaracter('o')).thenReturn('o');
		when(caracterE.cambiarAnteriorSiEsCaracter('u')).thenReturn('u');
		
		when(caracterI.cambiarAnteriorSiEsCaracter('i')).thenReturn('e');
		when(caracterI.cambiarAnteriorSiEsCaracter('a')).thenReturn('a');
		when(caracterI.cambiarAnteriorSiEsCaracter('e')).thenReturn('e');
		when(caracterI.cambiarAnteriorSiEsCaracter('o')).thenReturn('o');
		when(caracterI.cambiarAnteriorSiEsCaracter('u')).thenReturn('u');
		
		when(caracterO.cambiarAnteriorSiEsCaracter('o')).thenReturn('i');
		when(caracterO.cambiarAnteriorSiEsCaracter('a')).thenReturn('a');
		when(caracterO.cambiarAnteriorSiEsCaracter('e')).thenReturn('e');
		when(caracterO.cambiarAnteriorSiEsCaracter('i')).thenReturn('i');
		when(caracterO.cambiarAnteriorSiEsCaracter('u')).thenReturn('u');
		
		when(caracterU.cambiarAnteriorSiEsCaracter('u')).thenReturn('o');
		when(caracterU.cambiarAnteriorSiEsCaracter('a')).thenReturn('a');
		when(caracterU.cambiarAnteriorSiEsCaracter('e')).thenReturn('e');
		when(caracterU.cambiarAnteriorSiEsCaracter('i')).thenReturn('i');
		when(caracterU.cambiarAnteriorSiEsCaracter('o')).thenReturn('o');
		
		//consonante
		when(caracterA.cambiarAnteriorSiEsCaracter('t')).thenReturn('t');
		when(caracterE.cambiarAnteriorSiEsCaracter('t')).thenReturn('t');
		when(caracterI.cambiarAnteriorSiEsCaracter('t')).thenReturn('t');
		when(caracterO.cambiarAnteriorSiEsCaracter('t')).thenReturn('t');
		when(caracterU.cambiarAnteriorSiEsCaracter('t')).thenReturn('t');
		// espacio
		when(caracterA.cambiarAnteriorSiEsCaracter(' ')).thenReturn(' ');
		when(caracterE.cambiarAnteriorSiEsCaracter(' ')).thenReturn(' ');
		when(caracterI.cambiarAnteriorSiEsCaracter(' ')).thenReturn(' ');
		when(caracterO.cambiarAnteriorSiEsCaracter(' ')).thenReturn(' ');
		when(caracterU.cambiarAnteriorSiEsCaracter(' ')).thenReturn(' ');
	}
	@Test
	void siguienteYAnteriorDeLetraA() {
		assertEquals('e',transformador.convertirCaracterSiguiente('a'));
		assertEquals('u',transformador.convertirCaracterAnterior('a'));
	}
	@Test
	void siguienteYAnteriorDeLetraE() {
		assertEquals('i',transformador.convertirCaracterSiguiente('e'));
		assertEquals('a',transformador.convertirCaracterAnterior('e'));
	}
	@Test
	void siguienteYAnteriorDeLetraI() {
		assertEquals('o',transformador.convertirCaracterSiguiente('i'));
		assertEquals('e',transformador.convertirCaracterAnterior('i'));
	}
	@Test
	void siguienteYAnteriorDeLetraO() {
		assertEquals('u',transformador.convertirCaracterSiguiente('o'));
		assertEquals('i',transformador.convertirCaracterAnterior('o'));
	}
	@Test
	void siguienteYAnteriorDeLetraU() {
		assertEquals('a',transformador.convertirCaracterSiguiente('u'));
		assertEquals('o',transformador.convertirCaracterAnterior('u'));
	}
	@Test
	void siguienteYAnteriorDeLetraT() {
		assertEquals('t',transformador.convertirCaracterSiguiente('t'));
		assertEquals('t',transformador.convertirCaracterAnterior('t'));
	}
	@Test
	void siguienteyAnteriorDeEspacio() {
		assertEquals(' ',transformador.convertirCaracterSiguiente(' '));
		assertEquals(' ',transformador.convertirCaracterAnterior(' '));
	}
}
