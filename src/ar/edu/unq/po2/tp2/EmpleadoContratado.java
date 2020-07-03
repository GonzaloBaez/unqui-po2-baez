package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado{

	private int numeroContrato;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico, String medioDePago, int numeroContrato) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.medioDePago = medioDePago;
		this.numeroContrato = numeroContrato;
	}

	
	@Override
	public int sueldoNeto() {

		return this.sueldoBruto() - 50;
	}

	@Override
	public int sueldoBruto() {
		
		return this.getSueldoBasico();
	}

	@Override
	public int retenciones() {
		return 0;
	}

	@Override
	public int aporteJubilatorio() {
		return 0;
	}

	@Override
	public int obraSocial() {
		return 0;
	}


	public int getNumeroContrato() {
		return numeroContrato;
	}


	public String getMedioDePago() {
		return medioDePago;
	}

}
