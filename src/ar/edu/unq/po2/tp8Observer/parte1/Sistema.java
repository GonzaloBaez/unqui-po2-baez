package ar.edu.unq.po2.tp8Observer.parte1;

import java.util.ArrayList;
import java.util.List;

public class Sistema extends Observado{

	List<ArticuloCientifico> articulosDelSistema = new ArrayList<ArticuloCientifico>();
	
	
	public void agregarArticulo(ArticuloCientifico articuloNuevo) {
		articulosDelSistema.add(articuloNuevo);
		this.notify(articuloNuevo);
		
	}
}
