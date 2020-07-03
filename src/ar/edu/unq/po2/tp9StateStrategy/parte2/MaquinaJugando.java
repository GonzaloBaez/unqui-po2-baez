package ar.edu.unq.po2.tp9StateStrategy.parte2;

public class MaquinaJugando implements EstadoMaquina {

	private MaquinaDeVideojuegos maquina;
	@Override
	public String agregarMoneda() {
		return "Espere a terminar el juego";	
	}

	@Override
	public String presionarBotonInicio() {
		return "ya esta en juego";
	}

	@Override
	public void setMaquinaDeVideojuegos(MaquinaDeVideojuegos maquina) {
		this.maquina = maquina;

	}

	@Override
	public String terminarJuego() {
		MaquinaEncendida maquinaEncendida = new MaquinaEncendida();
		maquinaEncendida.setMaquinaDeVideojuegos(this.maquina);
		this.maquina.setEstado(maquinaEncendida);
		return "juego terminado, ingrese 1 moneda para jugar solo, ingrese 2 para jugar con un amigo";
	}

}
