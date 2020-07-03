package ar.edu.unq.po2.tp9StateStrategy.parte3;

public class SeleccionDeCanciones implements EstadoMp3 {

	private Mp3 reproductor;
	@Override
	public String play() {
		EstadoMp3 nuevoEstado = new Reproduciendo();
		this.reproductor.setEstado(nuevoEstado);
		nuevoEstado.setReproductor(this.reproductor);
		this.reproductor.getCancionSeleccionada().play();
		return "reproduciendo cancion";
	}

	@Override
	public String pause() {
		try {
			throw new RuntimeException("estas en modo seleccion, no se puede pausar");
		} catch (RuntimeException e) {
			return e.getMessage();
		}
	}

	@Override
	public String stop() {
		return null;
	}
	
	public void setReproductor(Mp3 mp3) {
		this.reproductor = mp3;
	}
	
}
