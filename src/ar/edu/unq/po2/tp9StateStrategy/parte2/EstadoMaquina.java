package ar.edu.unq.po2.tp9StateStrategy.parte2;

public interface EstadoMaquina {

	public String agregarMoneda();
	public String presionarBotonInicio();
	public void setMaquinaDeVideojuegos(MaquinaDeVideojuegos maquina);
	public String terminarJuego();
}
