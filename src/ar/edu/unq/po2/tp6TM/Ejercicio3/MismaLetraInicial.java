package ar.edu.unq.po2.tp6TM.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class MismaLetraInicial extends Filtro{


	@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage pagina, List<WikipediaPage> listaDePaginas) {
		char primeraLetraPagina = pagina.getTitle().charAt(0);
		List<WikipediaPage> paginasSimilares =  new ArrayList<WikipediaPage>();
		for (WikipediaPage paginaDeWikipedia:listaDePaginas){
			if( pagina.getTitle() != paginaDeWikipedia.getTitle() && paginaDeWikipedia.getTitle().charAt(0) == primeraLetraPagina) {
				paginasSimilares.add(paginaDeWikipedia);
			}
		}
		return paginasSimilares;
	}

}
