package ar.edu.unq.po2.tp6TM.Ejercicio2;

public abstract class Empleado {

	private int cantHijos;
	private boolean esCasado;
	private int horasTrabajadas;
	public Empleado(int cantHijos, boolean esCasado, int horasTrabajadas) {
		super();
		this.cantHijos = cantHijos;
		this.esCasado = esCasado;
		this.horasTrabajadas = horasTrabajadas;
	}
	public int getHorasTrabajadas() {
		return this.horasTrabajadas;
	}
	public int getCantHijos() {
		return cantHijos;
	}
	public boolean getEsCasado() {
		return esCasado;
	}
	
	public double sueldoBruto() {
		return this.sueldoBasico() + this.pagaPorHora() + this.pagaPorHijo();
	}
	
	public double sueldo() {
		return this.sueldoBruto() - this.aportes();
	}
	public double aportes() {
		return this.sueldoBruto() * 0.13; 
	}
	protected abstract int pagaPorHijo();
	protected abstract int pagaPorHora();
	protected abstract int sueldoBasico();
}
