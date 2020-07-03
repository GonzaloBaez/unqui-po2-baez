package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboDeSueldo {

	private String nomEmpleado;
	private String direccion;
	private LocalDate fechaEmision;
	private int sueldoBruto;
	private int sueldoNeto;
	
	public ReciboDeSueldo(String nomEmpleado, String direccion, LocalDate fechaEmision, int sueldoBruto,
			int sueldoNeto) {
		super();
		this.nomEmpleado = nomEmpleado;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
	}

	public String getNomEmpleado() {
		return nomEmpleado;
	}

	public String getDireccion() {
		return direccion;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public int getSueldoBruto() {
		return sueldoBruto;
	}

	public int getSueldoNeto() {
		return sueldoNeto;
	}
	
	
}
