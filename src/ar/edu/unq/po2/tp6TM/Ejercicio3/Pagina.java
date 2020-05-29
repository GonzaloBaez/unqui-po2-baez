package ar.edu.unq.po2.tp6TM.Ejercicio3;

import java.util.List;
import java.util.Map;

public class Pagina implements WikipediaPage{
	
	private String titulo;
	private List<WikipediaPage> links;
	private Map<String,WikipediaPage> infobox;
	@Override
	public String getTitle() {
		
		return titulo;
	}
	@Override
	public List<WikipediaPage> getLinks() {
		
		return links;
	}
	@Override
	public Map<String, WikipediaPage> getInfobox() {
		
		return infobox;
	}
	
	
}
