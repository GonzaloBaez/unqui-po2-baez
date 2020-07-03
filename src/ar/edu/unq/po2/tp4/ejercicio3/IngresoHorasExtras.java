package ar.edu.unq.po2.tp4.ejercicio3;

public class IngresoHorasExtras implements Ingreso{
	
	private String mesPercepcion;
	private String concepto;
	private int montoPercibido;
	private int horasExtrasRealizadas;

	public IngresoHorasExtras(String mesPercepcion, String concepto, int montoPercibido, int horasExtrasRealizadas) {
		super();
		this.mesPercepcion = mesPercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
		this.horasExtrasRealizadas = horasExtrasRealizadas;
	}
	
	
	@Override
	public int getMontoPercibido() {
		// TODO Auto-generated method stub
		return montoPercibido;
	}

	@Override
	public int getMontoImponibleAlIngreso() {
		// TODO Auto-generated method stub
		return 0;
	}

}
