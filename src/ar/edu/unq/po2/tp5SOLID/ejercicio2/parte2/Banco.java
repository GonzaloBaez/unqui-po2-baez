package ar.edu.unq.po2.tp5SOLID.ejercicio2.parte2;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<SolicitudDeCredito> solicitudes = new ArrayList<SolicitudDeCredito>();
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public ArrayList<SolicitudDeCredito> getSolicitudes() {
		return solicitudes;
	}
	
	

}
