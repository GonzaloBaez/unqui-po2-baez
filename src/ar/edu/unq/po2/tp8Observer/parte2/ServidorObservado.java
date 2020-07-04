package ar.edu.unq.po2.tp8Observer.parte2;

public interface ServidorObservado {

	public void agregarObservador(ObservadorServidor observador);
	public void removerObservador(ObservadorServidor observador);
	public void notificar(Partido partido);
}
