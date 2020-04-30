package supermercado;

public class Producto implements Comprable{

	private String nombre;
	private Double precioBase;
	private boolean esPrecioCuidado = false;
	
	public Producto(String nombre,double precioBase,boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public Producto(String nombre,double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	@Override
	public Double getPrecio() {
		
		return this.precioBase;
	}
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void aumentarPrecio(double aumento) {
		this.precioBase += aumento;
	}


}
