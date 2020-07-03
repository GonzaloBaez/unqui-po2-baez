package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {

	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaDeNacimiento;
	private int sueldoBasico;
	
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	public int getEdad() {
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(this.fechaDeNacimiento, ahora);
		
		return periodo.getYears();
	}
	
	public boolean esCasado() {
		return this.estadoCivil == "Casado";
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getDireccion() {
		return this.direccion;
	}
	
	public abstract int sueldoNeto();
	public abstract int sueldoBruto();
	public abstract int retenciones();
	public abstract int aporteJubilatorio();
	public abstract int obraSocial();

	public int getSueldoBasico() {
		return sueldoBasico;
	}
	
}
