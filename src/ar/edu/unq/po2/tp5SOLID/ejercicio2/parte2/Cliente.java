package ar.edu.unq.po2.tp5SOLID.ejercicio2.parte2;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private int sueldoNetoMensual;
	private ArrayList<Propiedad> propiedades = new ArrayList<Propiedad>();
	
	public Cliente(String nombre, String apellido, String direccion, int edad, int sueldoNetoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public int getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public int sueldoAnual() {
		return this.sueldoNetoMensual * 12;
	}
	
	public int getEdad() {
		return edad;
	}

	public void solicitarCreditoPersonal(Sistema sistema, int cantidad, int plazo) {
		sistema.agregarNuevaSolicitudPersonal(cantidad, this, plazo);
	}
	
	public void solicitarCreditoHipotecario(Sistema sistema,int cantidad,Propiedad propiedad,int plazo) {
		sistema.agregarNuevaSolicitudHipotecario(cantidad, this, propiedad, plazo);
	}
}
