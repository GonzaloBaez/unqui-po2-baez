package ar.edu.unq.po2.tp4;

public class Gas implements Agencia{

	@Override
	public void registrarPago(Factura factura) {
		System.out.println("se pago una factura de gas");
		
	}

}
