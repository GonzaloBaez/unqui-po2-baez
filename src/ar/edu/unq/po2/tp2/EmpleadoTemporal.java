package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado{

	private LocalDate fechaFin;
	private int horasExtras;
	
	public EmpleadoTemporal(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico, LocalDate fechaFin, int horasExtras) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.fechaFin = fechaFin;
		this.horasExtras = horasExtras;
	}

	
	@Override
	public int sueldoNeto() {

		return this.sueldoBruto() - this.retenciones();
	}

	@Override
	public int sueldoBruto() {
		
		return this.getSueldoBasico() + this.horasExtras();
	}

	@Override
	public int retenciones() {
		
		return this.obraSocial() + this.aporteJubilatorio();
	}

	@Override
	public int aporteJubilatorio() {
		
		return (this.sueldoBruto() * 10/100) + (this.getHorasExtras() * 5);
	}

	@Override
	public int obraSocial() {
		int valor = this.sueldoBruto() * 10/100;
		if(this.getEdad()>50) {
			valor += 25; 
		}
		return valor;
	}


	public LocalDate getFechaFin() {
		return fechaFin;
	}


	public int getHorasExtras() {
		return horasExtras;
	}
	
	public int horasExtras() {
		return 0;
	}

}
