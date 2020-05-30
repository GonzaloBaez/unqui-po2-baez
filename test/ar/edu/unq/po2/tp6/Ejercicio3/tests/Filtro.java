package ar.edu.unq.po2.tp6.Ejercicio3.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6TM.Ejercicio3.LinkEnComun;
import ar.edu.unq.po2.tp6TM.Ejercicio3.MismaLetraInicial;
import ar.edu.unq.po2.tp6TM.Ejercicio3.Pagina;
import ar.edu.unq.po2.tp6TM.Ejercicio3.PropiedadEnComun;
import ar.edu.unq.po2.tp6TM.Ejercicio3.WikipediaPage;


class Filtro {

	
	Pagina laPlata;
	Pagina lugano;
	Pagina quilmes;
	Pagina solano;
	Pagina ciudadDeLosNinios;
	Pagina macDonalds;
	MismaLetraInicial mismaLetraInicial;
	LinkEnComun linkEnComun;
	PropiedadEnComun propiedadEnComun;
	List<WikipediaPage> paginasDeWikipedia;
	
	@BeforeEach
	void SetUp() {
		laPlata = new Pagina("la plata");
		lugano = new Pagina("lugano");
		quilmes = new Pagina("quilmes");
		solano = new Pagina("solano");
		ciudadDeLosNinios = new Pagina("ciudad de los ninios");
		macDonalds = new Pagina("ciudad de los ninios");
		
		mismaLetraInicial = new MismaLetraInicial();
		linkEnComun = new LinkEnComun();
		propiedadEnComun = new PropiedadEnComun();
		
		paginasDeWikipedia = new ArrayList<WikipediaPage>();
		paginasDeWikipedia.add(laPlata);
		paginasDeWikipedia.add(quilmes);
		paginasDeWikipedia.add(solano);
		paginasDeWikipedia.add(ciudadDeLosNinios);
		paginasDeWikipedia.add(lugano);
		paginasDeWikipedia.add(macDonalds);
		
		
	}
	@Test
	void filtroDeMismaLetraInicialConPaginaLaPlata() {
		
		assertEquals(mismaLetraInicial.getSimilarPages(laPlata, paginasDeWikipedia).size(),1);
		assertEquals(mismaLetraInicial.getSimilarPages(laPlata, paginasDeWikipedia).get(0),lugano);
	}
	
	@Test
	void filtroDeLinkEnComunConPaginaQuilmes() {
		laPlata.agregarLink(macDonalds);
		laPlata.agregarLink(ciudadDeLosNinios);
		quilmes.agregarLink(macDonalds);
		quilmes.agregarLink(solano);
		solano.agregarLink(macDonalds);
		solano.agregarLink(quilmes);
		lugano.agregarLink(macDonalds);
		ciudadDeLosNinios.agregarLink(laPlata);
		
		assertEquals(linkEnComun.getSimilarPages(quilmes, paginasDeWikipedia).size(),3);
		assertTrue(linkEnComun.getSimilarPages(quilmes, paginasDeWikipedia).contains(laPlata));
		assertTrue(linkEnComun.getSimilarPages(quilmes, paginasDeWikipedia).contains(solano));
		assertTrue(linkEnComun.getSimilarPages(quilmes, paginasDeWikipedia).contains(lugano));
		assertFalse(linkEnComun.getSimilarPages(quilmes, paginasDeWikipedia).contains(ciudadDeLosNinios));
	}
	
	

}
