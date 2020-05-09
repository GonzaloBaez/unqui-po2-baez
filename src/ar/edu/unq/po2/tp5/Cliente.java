package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class Cliente {
	
	private String nombre;
	private ArrayList<Registrables> carro = new ArrayList<Registrables>();
	
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void agregarProductoAlCarro(Registrables producto) {
		if(producto.puedeAgregarse()) {
		carro.add(producto);
		producto.reducirCantidad();
		}
	}
	
	public String adquirirProductos(Caja caja) {
		return "El precio total es " + caja.registrarProductos(this.carro);
	}
}
