package ar.edu.unq.po2.tp8Observer.parte1;

import java.util.ArrayList;
import java.util.List;

public abstract class Observado {

	private List<Observador> observadores = new ArrayList<>();

	public void suscribir(Observador observador) {
		if(!observadores.contains(observador))
		observadores.add(observador);
	}
	public void desuscribir(Observador observador) {
		observadores.remove(observador);
	}
	public void notify(ArticuloCientifico articulo) {
		for(Observador observador:observadores) {
			observador.update(articulo);
		}
	}
	public List<Observador> getObservadores(){
		return this.observadores;
	}

}
