package ar.edu.unq.po2.tp9StateStrategy.parte2;

public class Maquina2Monedas implements EstadoMaquina{

	private MaquinaDeVideojuegos maquina;
	
	@Override
	public String agregarMoneda() {
		return "Se agrego el maximo de monedas";
		
	}

	@Override
	public String presionarBotonInicio() {
		MaquinaJugando maquinaJugando = new MaquinaJugando();
		maquinaJugando.setMaquinaDeVideojuegos(this.maquina);
		this.maquina.setEstado(maquinaJugando);
		return "Jugando...";
		
	}

	@Override
	public void setMaquinaDeVideojuegos(MaquinaDeVideojuegos maquina) {
		this.maquina = maquina;
		
	}

	@Override
	public String terminarJuego() {
		return null;
		
	}

}
