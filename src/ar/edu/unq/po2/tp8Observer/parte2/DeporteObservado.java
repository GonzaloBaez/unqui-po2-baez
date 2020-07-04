package ar.edu.unq.po2.tp8Observer.parte2;

public interface DeporteObservado {

	public void agregarObservador(ObservadorDeporte nuevoObservador);
	public void removerObservador(ObservadorDeporte nuevoObservador);
	public void notificar();
}
