package ar.edu.unq.po2.tp5;

public abstract class Factura implements Registrables{
	
	protected Agencia agenciaRecaudadora;
	private int cantidad=1;
	
	public abstract Double getMonto();
	
	public abstract void registrarse();
	
	public void reducirCantidad() {
		this.cantidad-=1;
	}
	public boolean puedeAgregarse() {
		return this.getCantidad()>0;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
}
