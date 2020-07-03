package ar.edu.unq.po2.tp8Observer.parte1.tests;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8Observer.parte1.Investigador;
import ar.edu.unq.po2.tp8Observer.parte1.Sistema;

class Publicaciones {

	Sistema sistema;
	Investigador investigador1;
	Investigador investigador2;
	Investigador investigador3;
	Investigador investigador4;
	Investigador investigador5;
	Investigador investigador6;
	
	@BeforeEach
	void setUp() {
		sistema = new Sistema();
		investigador1 = new Investigador(sistema);
		investigador2 = new Investigador(sistema);
		investigador3 = new Investigador(sistema);
		investigador4 = new Investigador(sistema);
		investigador5 = new Investigador(sistema);
		investigador6 = new Investigador(sistema);
	} 
	@Test
	void investigadorUnoSeSuscribeAArticulosDeSmalltalk() {
		ArrayList<String> palabrasClavesArticuloPython = new ArrayList<String>();
		ArrayList<String> palabrasClavesArticuloSmalltalk = new ArrayList<String>();
		palabrasClavesArticuloPython.add("python");
		palabrasClavesArticuloPython.add("investigador2");
		palabrasClavesArticuloPython.add("investigador3");
		palabrasClavesArticuloPython.add("universidad");
		palabrasClavesArticuloPython.add("articulo");
		palabrasClavesArticuloPython.add("quilmes");
		palabrasClavesArticuloSmalltalk.add("investigador2");
		palabrasClavesArticuloSmalltalk.add("smalltalk");
		palabrasClavesArticuloSmalltalk.add("universidad");
		palabrasClavesArticuloSmalltalk.add("articulo");
		palabrasClavesArticuloSmalltalk.add("quilmes");
		investigador1.suscribirse("smalltalk");
		investigador1.suscribirse("wollok");
		investigador2.cargarArticulo("introduccion a Python","investigador2 e investigador3", "universidad", "articulo", "quilmes",palabrasClavesArticuloPython);
		investigador2.cargarArticulo("introduccion a smalltalk","investigador2", "universidad", "articulo", "quilmes",palabrasClavesArticuloSmalltalk);
		assertEquals(1,sistema.getObservadores().size());
	}

}
