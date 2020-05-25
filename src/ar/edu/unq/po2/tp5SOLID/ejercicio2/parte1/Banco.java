package ar.edu.unq.po2.tp5SOLID.ejercicio2.parte1;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<SolicitudDeCredito> solicitudes = new ArrayList<SolicitudDeCredito>();
	
	public void nuevaSolicitudPersonal(int monto,Cliente cliente, int plazo) {
		CreditoPersonal nuevoCredito = new CreditoPersonal(cliente, monto, plazo);
		this.solicitudes.add(nuevoCredito);
		this.clientes.add(cliente);
	}
	
	public void nuevaSolicitudHipotecaria(int monto,Cliente cliente, Propiedad propiedad, int plazo) {
		CreditoHipotecario nuevoCredito = new CreditoHipotecario(cliente, monto, plazo, propiedad);
		this.solicitudes.add(nuevoCredito);
		this.clientes.add(cliente);
	}
	
	public boolean comprobarSolicitud(SolicitudDeCredito solicitud) {
		return solicitud.esAceptable();
	}
}
