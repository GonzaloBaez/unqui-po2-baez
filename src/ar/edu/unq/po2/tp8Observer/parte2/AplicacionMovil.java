package ar.edu.unq.po2.tp8Observer.parte2;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil implements ObservadorServidor{

	public ArrayList<Partido> partidosDeInteres = new ArrayList<Partido>();
	public ArrayList<Deporte> deportesSuscritos = new ArrayList<Deporte>();
	public ArrayList<String> contrincantesSuscritos = new ArrayList<String>();
	
	public ArrayList<Partido> getPartidosDeInteres() {
		return partidosDeInteres;
	}

	public ArrayList<Deporte> getDeportesSuscritos() {
		return deportesSuscritos;
	}

	public ArrayList<String> getContrincantesSuscritos() {
		return contrincantesSuscritos;
	}

	public void suscribirseAServidor(Servidor servidor) {
		servidor.agregarObservador(this);
	}
	public void desuscribirseAServidor(Servidor servidor) {
		servidor.removerObservador(this);
	}
	
	public void agregarDeporteDeInteres(Deporte deporte) {
		this.deportesSuscritos.add(deporte);
	}
	public void quitarDeporteDeInteres(Deporte deporte) {
		this.deportesSuscritos.remove(deporte);
	}
	
	public void agregarContrincanteDeInteres(String contrincante) {
		this.contrincantesSuscritos.add(contrincante);
	}
	
	public void quitarContrincanteDeInteres(String contrincante) {
		this.contrincantesSuscritos.remove(contrincante);
	}
	
	public boolean partidoEsDeInteres(Partido partido) {
		return false;
	}
	
	public boolean deporteEsDeInteres(Deporte deporte) {
		return this.deportesSuscritos.contains(deporte);
	}
	
	private boolean contrincantesSonDeInteres(List<String> contrincantes) {
		boolean esDeInteres = false;
		for(String contrincante:contrincantes) {
			esDeInteres = esDeInteres || contrincanteEsDeInteres(contrincante);
		}
		return esDeInteres;
	}
	
	private boolean contrincanteEsDeInteres(String contrincante) {
		return this.contrincantesSuscritos.contains(contrincante);
	}
	private void agregarPartidoSiEsDeInteres(Partido partido) {
		Deporte deporteDePartido = partido.getDeporte();
		List<String> contrincantes = partido.getContrincantes();
		
		if(deporteEsDeInteres(deporteDePartido) || contrincantesSonDeInteres(contrincantes)) {
			this.partidosDeInteres.add(partido);
		}
	}
	@Override
	public void update(Partido partido) {
		this.agregarPartidoSiEsDeInteres(partido);
		
	}

	
}
