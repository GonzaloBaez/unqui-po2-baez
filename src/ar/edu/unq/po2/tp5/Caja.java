package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class Caja {
	private int numeroCaja;
	
	public Double registrarProductos(ArrayList<Registrables> productosCliente) {
		Double montoTotal = 0d;
		for (Registrables producto:productosCliente) {
			montoTotal += producto.getMonto();
			producto.registrarse();
		}
		return montoTotal;
	}

	public Caja(int numeroCaja) {
		super();
		this.numeroCaja = numeroCaja;
	}
}
