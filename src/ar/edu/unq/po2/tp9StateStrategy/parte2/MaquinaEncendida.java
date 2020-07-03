package ar.edu.unq.po2.tp9StateStrategy.parte2;

public class MaquinaEncendida implements EstadoMaquina{

	private MaquinaDeVideojuegos maquina;
	@Override
	public String agregarMoneda() {
		Maquina1Moneda maquinaConUnaMoneda = new Maquina1Moneda();
		maquinaConUnaMoneda.setMaquinaDeVideojuegos(this.maquina);
		this.maquina.setEstado(maquinaConUnaMoneda);
		return "Presione Inicio para jugar, o agregue otra moneda para jugar con un amigo";
		
	}

	@Override
	public String presionarBotonInicio() {
		return "No se han ingresado monedas";
	}

	@Override
	public void setMaquinaDeVideojuegos(MaquinaDeVideojuegos maquina) {
		this.maquina = maquina;
		
	}

	@Override
	public String terminarJuego() {
		return null;
		// TODO Auto-generated method stub
		
	}

}
