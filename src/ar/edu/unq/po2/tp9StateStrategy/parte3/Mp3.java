package ar.edu.unq.po2.tp9StateStrategy.parte3;

public class Mp3 {

	private EstadoMp3 estado;
	private Song cancionSeleccionada;
	
	public Mp3() {
		setEstado(new SeleccionDeCanciones());
		this.estado.setReproductor(this);
	}
	public Song getCancionSeleccionada() {
		return cancionSeleccionada;
	}
	public void setCancionSeleccionada(Song cancionSeleccionada) {
		this.cancionSeleccionada = cancionSeleccionada;
	}
	public String play() {
		return estado.play();
	}
	public String pause() {
		return estado.pause();
		
	}
	public String stop() {
		return estado.stop();
		
	}
	
	public void setEstado(EstadoMp3 estadoNuevo) {
		this.estado = estadoNuevo;
	}
}
