package ar.edu.unq.po2.tp6TM.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class LinkEnComun extends Filtro{

	@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage pagina, List<WikipediaPage> listaDePaginas) {
		List<WikipediaPage> paginasSimilares = new ArrayList<WikipediaPage>();
		for(WikipediaPage link:pagina.getLinks()) {
			for(WikipediaPage paginaDeWikipedia:listaDePaginas) {
				if(pagina != paginaDeWikipedia && paginaDeWikipedia.getLinks().contains(link)) {
					paginasSimilares.add(paginaDeWikipedia);
				}
			}
		}
		return paginasSimilares;
	}

	
}
