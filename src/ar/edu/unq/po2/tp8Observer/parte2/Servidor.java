package ar.edu.unq.po2.tp8Observer.parte2;

import java.util.ArrayList;


public class Servidor implements ObservadorDeporte,ServidorObservado{

	private ArrayList<Deporte> deportesSuscriptos = new ArrayList<Deporte>();
	private ArrayList<Partido> partidosDeInteres = new ArrayList<Partido>();
	private ArrayList<ObservadorServidor> observadores = new ArrayList<ObservadorServidor>();
	
	public void suscribirseADeporte(Deporte deporte) {
		deporte.agregarObservador(this);
		this.deportesSuscriptos.add(deporte);
	}
	
	@Override
	public void notificar(Partido partido) {
		for(ObservadorServidor observador:this.observadores) {
			observador.update(partido);
		}
	}
	
	@Override
	public void agregarObservador(ObservadorServidor observador) {
		this.observadores.add(observador);
	}
	
	@Override	
	public void removerObservador(ObservadorServidor observador) {
		this.observadores.remove(observador);
	}
	
	@Override
	public void update() {
		this.agregarNuevoPartido();
		this.notificar(ultimoPartido());
		
	}

	private Partido ultimoPartido() {
		int posicionDeUltimoPartido = getPartidosDeInteres().size()-1;
		return getPartidosDeInteres().get(posicionDeUltimoPartido);
	}

	private void agregarNuevoPartido() {
		for(Deporte deporte:this.deportesSuscriptos) {
			Partido ultimoPartidoDeporte = deporte.ultimoPartido();
			if(ultimoPartidoDeporte !=null) {
				this.agregarPartidoSiEsNuevo(ultimoPartidoDeporte);
			}
		}
	}
	private void agregarPartidoSiEsNuevo(Partido partido) {
		if(!this.partidosDeInteres.contains(partido)) {
			this.partidosDeInteres.add(partido);
		}
		
	}

	public ArrayList<ObservadorServidor> getObservadores() {

		return this.observadores;
	}

	public ArrayList<Deporte> getDeportesSuscriptos() {
		
		return this.deportesSuscriptos;
	}

	public void desuscribirseADeporte(Deporte deporte) {
		deporte.removerObservador(this);
		this.deportesSuscriptos.remove(deporte);
	}

	public ArrayList<Partido> getPartidosDeInteres() {
		
		return this.partidosDeInteres;
	}

}
