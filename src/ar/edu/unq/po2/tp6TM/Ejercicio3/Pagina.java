package ar.edu.unq.po2.tp6TM.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Pagina implements WikipediaPage{
	
	private String titulo;
	private List<WikipediaPage> links = new ArrayList<WikipediaPage>();
	private Map<String,WikipediaPage> infobox;
	
	
	public Pagina(String titulo) {
		super();
		this.titulo = titulo;
	}
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
	
	public void agregarLink(WikipediaPage pagina) {
		links.add(pagina);
	}
	
	public void agregarInfobox(WikipediaPage pagina) {
		infobox.put(pagina.getTitle(), pagina);
	}
	
	
}
