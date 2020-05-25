package ar.edu.unq.po2.tp5SOLID.ejercicio2.parte2;

public class Sistema {

	private Banco banco;
	
	public void agregarCliente(Cliente cliente) {
		this.banco.getClientes().add(cliente);
	}
	
	public void agregarNuevaSolicitudPersonal(int monto,Cliente cliente, int plazo) {
		this.agregarCliente(cliente);
		CreditoPersonal nuevoCredito = new CreditoPersonal(cliente, monto, plazo);
		this.banco.getSolicitudes().add(nuevoCredito);
	}
	
	public void agregarNuevaSolicitudHipotecario(int monto,Cliente cliente,Propiedad propiedad, int plazo) {
		this.agregarCliente(cliente);
		CreditoHipotecario nuevoCredito = new CreditoHipotecario(cliente, monto,plazo, propiedad);
		this.banco.getSolicitudes().add(nuevoCredito);
	}
	
	public int montoTotalADesembolsar() {
		int montoTemporal = 0;
	
		for(SolicitudDeCredito solicitud:banco.getSolicitudes()){
			if(solicitud.esAceptable()) {
				montoTemporal += solicitud.getMontoSolicitado();
			}
		}
		return montoTemporal;
	}
}
