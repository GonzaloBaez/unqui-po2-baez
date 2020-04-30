package supermercado;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Comprable> productos = new ArrayList<Comprable>();
	
	
	public Supermercado(String string, String string2) {
		this.nombre = string;
		this.direccion = string2;
		
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	
	public void agregarProducto(Comprable producto) {
		productos.add(producto);
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public Double getPrecioTotal() {
		Double sumaTotal = 0d;
		for(Comprable producto:productos) {
			sumaTotal += producto.getPrecio();
		}
		return sumaTotal;
	}

}
