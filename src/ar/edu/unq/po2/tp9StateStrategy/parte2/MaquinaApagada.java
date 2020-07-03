package ar.edu.unq.po2.tp9StateStrategy.parte2;

public class MaquinaApagada implements EstadoMaquina{

	private MaquinaDeVideojuegos maquina;
	@Override
	public String agregarMoneda() {
		return null;
		
	}

	@Override
	public String presionarBotonInicio() {
		MaquinaEncendida maquinaEncendida = new MaquinaEncendida();
		maquinaEncendida.setMaquinaDeVideojuegos(this.maquina);
		this.maquina.setEstado(maquinaEncendida);
		return "Maquina encendida, ingrese 1 moneda para jugar solo, ingrese 2 para jugar con un amigo";
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
