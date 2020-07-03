package ar.edu.unq.po2.tp9StateStrategy.parte2;

public class Maquina1Moneda implements EstadoMaquina{

	private MaquinaDeVideojuegos maquina;
	
	@Override
	public String agregarMoneda() {
		Maquina2Monedas maquina2Monedas = new Maquina2Monedas();
		maquina2Monedas.setMaquinaDeVideojuegos(this.maquina);
		this.maquina.setEstado(maquina2Monedas);
		return "Presione para jugar con un amigo"; 
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
