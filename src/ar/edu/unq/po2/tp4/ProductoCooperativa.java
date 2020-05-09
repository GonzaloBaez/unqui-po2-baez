package ar.edu.unq.po2.tp4;

public class ProductoCooperativa extends Producto{

	public ProductoCooperativa(Double precio, int stock) {
		super(precio, stock);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getMonto() {
		
		return this.getPrecioBase() * 0.9d;
	}
	
}
