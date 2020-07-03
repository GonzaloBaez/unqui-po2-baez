package ar.edu.unq.po2.tp9StateStrategy.parte3;

public class Pausado implements EstadoMp3 {

	private Mp3 reproductor;
	@Override
	public String play() {
		try {
			throw new RuntimeException("Estas en modo pausa, presionar pause para seguir reproduciendo la cancion");
		} catch (RuntimeException e) {
			return e.getMessage();
		}
	}

	@Override
	public String pause() {
		this.reproductor.getCancionSeleccionada().play();
		EstadoMp3 nuevoEstado = new Reproduciendo();
		this.reproductor.setEstado(nuevoEstado);
		nuevoEstado.setReproductor(this.reproductor);
		return "reproduciendo cancion";
	}

	@Override
	public String stop() {
		EstadoMp3 nuevoEstado = new SeleccionDeCanciones();
		this.reproductor.setEstado(nuevoEstado);
		nuevoEstado.setReproductor(this.reproductor);
		this.reproductor.getCancionSeleccionada().stop();//mensaje stop a song
		return "Cancion detenida, seleccione una cancion";	
	}

	@Override
	public void setReproductor(Mp3 mp3) {
		this.reproductor = mp3;
	}

}
