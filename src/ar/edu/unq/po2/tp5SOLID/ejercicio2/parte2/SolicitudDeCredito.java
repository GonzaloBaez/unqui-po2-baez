package ar.edu.unq.po2.tp5SOLID.ejercicio2.parte2;

public abstract class SolicitudDeCredito {

	private Cliente clienteSolicitador;
	private int montoSolicitado;
	private int plazo;
	
	public SolicitudDeCredito(Cliente clienteSolicitador, int montoSolicitado, int plazo) {
		super();
		this.clienteSolicitador = clienteSolicitador;
		this.montoSolicitado = montoSolicitado;
		this.plazo = plazo;
	}
	
	public int montoCuotaMensual() {
		return montoSolicitado/plazo;
	}
	
	public Cliente getClienteSolicitador() {
		return this.clienteSolicitador;
	}

	public int getPlazo() {
		return plazo;
	}

	public int getMontoSolicitado() {
		return this.montoSolicitado;
	}

	public abstract boolean esAceptable();
}
