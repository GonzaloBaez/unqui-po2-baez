package ar.edu.unq.po2.tp9StateStrategy.parte3;

public class Reproduciendo implements EstadoMp3 {

	private Mp3 reproductor;
	@Override
	public String play() {
		try {
			throw new RuntimeException("ya se esta reproduciendo la cancion");
		} catch (RuntimeException e) {
			return e.getMessage();
		}
	}

	@Override
	public String pause() {
		EstadoMp3 nuevoEstado = new Pausado();
		this.reproductor.setEstado(nuevoEstado);
		nuevoEstado.setReproductor(this.reproductor);
		this.reproductor.getCancionSeleccionada().pause();
		return "cancion pausada";	
	}

	@Override
	public String stop() {
		EstadoMp3 nuevoEstado = new SeleccionDeCanciones();
		this.reproductor.setEstado(nuevoEstado);
		nuevoEstado.setReproductor(this.reproductor);
		this.reproductor.getCancionSeleccionada().stop();
		return "Cancion detenida, seleccione una cancion";	
	}

	@Override
	public void setReproductor(Mp3 mp3) {
		this.reproductor = mp3;
		
	}

}
