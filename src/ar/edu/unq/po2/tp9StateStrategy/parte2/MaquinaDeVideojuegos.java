package ar.edu.unq.po2.tp9StateStrategy.parte2;

public class MaquinaDeVideojuegos {

	private EstadoMaquina estado;
	
	public MaquinaDeVideojuegos() {
		super();
		this.estado = new MaquinaApagada();
		this.estado.setMaquinaDeVideojuegos(this);
	}
	public String agregarMoneda() {
		return this.estado.agregarMoneda();
	}
	public String presionarBotonInicio() {
		return this.estado.presionarBotonInicio();
	}
	
	public void setEstado(EstadoMaquina estadoNuevo) {
		this.estado = estadoNuevo;
	}
	public String terminarJuego() {
		return this.estado.terminarJuego();
		
	}
}
