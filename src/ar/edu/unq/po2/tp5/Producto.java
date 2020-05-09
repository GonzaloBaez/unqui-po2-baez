package ar.edu.unq.po2.tp5;

public abstract class Producto implements Registrables{
	private Double precio;
	private int stock;
	
	public Producto(Double precio, int stock) {
		super();
		this.precio = precio;
		this.stock = stock;
	}
	
	public abstract Double getMonto();
	
	public void reducirCantidad() {
		if(this.hayStock()) {
			this.stock-=1;
		}
	}
	public Boolean hayStock() {
		return this.stock>0;
	}
	public Double getPrecioBase() {
		return this.precio;
	}
	public int getStock() {return this.stock;}
	
	public void registrarse() {}
	
	public boolean puedeAgregarse() {
		return this.hayStock();
	}
	
}
