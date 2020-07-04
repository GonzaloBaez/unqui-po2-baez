package ar.edu.unq.po2.tp8Observer.parte2;

import java.util.ArrayList;

public class Deporte implements DeporteObservado{

	private ArrayList<ObservadorDeporte> observadores = new ArrayList<ObservadorDeporte>();
	private ArrayList<Partido> partidos = new ArrayList<Partido>();
	
	public void nuevoPartido(Partido partidoNuevo) {
		this.partidos.add(partidoNuevo);
		this.notificar();
	}
	
	public ArrayList<Partido> getPartidos() {
		return this.partidos;
	}
	
	public Partido ultimoPartido() {
		Partido ultimoPartido = null;
		if(!getPartidos().isEmpty()) {
			int posicionDeUltimoPartido = getPartidos().size()-1;
			ultimoPartido = getPartidos().get(posicionDeUltimoPartido);
		}	
		
		return ultimoPartido;
	}
	@Override
	public void agregarObservador(ObservadorDeporte nuevoObservador) {
		this.observadores.add(nuevoObservador);
		
	}

	@Override
	public void removerObservador(ObservadorDeporte nuevoObservador) {
		this.observadores.remove(nuevoObservador);
		
	}

	@Override
	public void notificar() {
		for(ObservadorDeporte observador:this.observadores) {
			observador.update();
		}
		
	}

	public  ArrayList<ObservadorDeporte> getObservadores() {
		
		return this.observadores;
	}

}
