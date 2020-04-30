package supermercado;

public class ProductoPrimeraNecesidad implements Comprable{
	
	private String nombre;
	private Double precioBase;
	private boolean esPrecioCuidado = false;
	private int descuento;
	
	public ProductoPrimeraNecesidad(String nombre,double precioBase,boolean esPrecioCuidado, int descuento) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.esPrecioCuidado = esPrecioCuidado;
		this.descuento=descuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre,double precioBase,int descuento) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.descuento = descuento;
	}
	@Override
	public Double getPrecio() {
		Double multiplicador = ((100d-this.descuento)/100d);
		return this.precioBase * multiplicador;
	}
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public String getNombre() {
		return this.nombre;
	}


}
