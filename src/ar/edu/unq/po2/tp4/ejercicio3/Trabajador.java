package ar.edu.unq.po2.tp4.ejercicio3;

import java.util.ArrayList;

public class Trabajador {
	private ArrayList<Ingreso> ingresosAnuales = new ArrayList<Ingreso>();
	
	public int getTotalPercibido() {
		int total=0;
		for(Ingreso ingreso:ingresosAnuales) {
			total += ingreso.getMontoPercibido();
		}
		return total;
	}
	
	public int getMontoImponible() {
		int total=0;
		for(Ingreso ingreso:ingresosAnuales) {
			total += ingreso.getMontoImponibleAlIngreso();
		}
		return total;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02d;
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresosAnuales.add(ingreso);
	}

}
