package ar.edu.unq.po2.tp6TM.Ejercicio2;

public class EmpleadoPasante extends Empleado{

	

	public EmpleadoPasante(int cantHijos, boolean esCasado, int horasTrabajadas) {
		super(cantHijos, esCasado, horasTrabajadas);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int pagaPorHijo() {
		return 0;
	}

	@Override
	protected int pagaPorHora() {
		return this.getHorasTrabajadas() * 40;
	}

	@Override
	protected int sueldoBasico() {
		return 0;
	}

}
