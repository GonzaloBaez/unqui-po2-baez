package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado{

	private int cantidadDeHijos;
	private int antiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico,int cantidadDeHijos,int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;
	}

	public int getAntiguedad() {
		return this.antiguedad;
	}
	
	public int getCantDeHijos() {
		return this.cantidadDeHijos;
	}
	@Override
	public int sueldoNeto() {
	
		return this.sueldoBruto() - this.retenciones();
	}

	@Override
	public int sueldoBruto() {
		
		return this.getSueldoBasico() + this.asignacionPorHijo() + this.asignacionPorConyuge() +this.valorAntiguedad();
	}

	@Override
	public int retenciones() {
		return this.obraSocial() + this.aporteJubilatorio();
	}

	@Override
	public int aporteJubilatorio() {

		return this.sueldoBruto() * 15/100;
	}

	@Override
	public int obraSocial() {
		
		return (this.sueldoBruto() * 10/100) + (this.cantidadDeHijos * 10);
	}
	
	public int valorAntiguedad() {
		return this.getAntiguedad() * 50;
	}
	public int asignacionPorHijo() {
		return this.getCantDeHijos() * 150;
	}

	public int asignacionPorConyuge() {
		int valorSiEstaCasado = 0;
		if(this.esCasado()) {
			valorSiEstaCasado += 100;
		}
		return valorSiEstaCasado;
	}
}
