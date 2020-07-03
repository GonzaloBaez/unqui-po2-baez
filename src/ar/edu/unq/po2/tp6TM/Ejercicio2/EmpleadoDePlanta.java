package ar.edu.unq.po2.tp6TM.Ejercicio2;

public class EmpleadoDePlanta extends Empleado{

	

	public EmpleadoDePlanta(int cantHijos, boolean esCasado, int horasTrabajadas) {
		super(cantHijos, esCasado, horasTrabajadas);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int pagaPorHijo() {
		return this.getCantHijos()*150;
	}

	@Override
	protected int pagaPorHora() {
		return 0;
	}

	@Override
	protected int sueldoBasico() {
		return 3000;
	}

}
