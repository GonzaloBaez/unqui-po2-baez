package ar.edu.unq.po2.tp5SOLID.ejercicio2.parte1;

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

	public void solicitarCreditoPersonal(Banco banco, int cantidad, int plazo) {
		banco.nuevaSolicitudPersonal(cantidad, this, plazo);
	}
	
	public void solicitarCreditoHipotecario(Banco banco,int cantidad,Propiedad propiedad,int plazo) {
		banco.nuevaSolicitudHipotecaria(cantidad, this, propiedad, plazo);
	}
}
