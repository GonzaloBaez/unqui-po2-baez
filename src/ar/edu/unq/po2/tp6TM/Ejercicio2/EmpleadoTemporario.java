package ar.edu.unq.po2.tp6TM.Ejercicio2;

public class EmpleadoTemporario extends Empleado{

	

	public EmpleadoTemporario(int cantHijos, boolean esCasado, int horasTrabajadas) {
		super(cantHijos, esCasado, horasTrabajadas);
		
	}

	@Override
	protected int pagaPorHijo() {
		int paga = 0;
		if(this.getEsCasado()|| this.getCantHijos()>0) {
			paga += 100;
		}
		return paga;
	}

	@Override
	protected int pagaPorHora() {
		
		return 5 * this.getHorasTrabajadas();
	}

	@Override
	protected int sueldoBasico() {
		
		return 1000;
	}

}
