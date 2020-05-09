package ar.edu.unq.po2.tp4;

public class ProductoEmpresa extends Producto{

	public ProductoEmpresa(Double precio, int stock) {
		super(precio, stock);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Double getMonto() {
		return this.getPrecioBase();
	}
}
