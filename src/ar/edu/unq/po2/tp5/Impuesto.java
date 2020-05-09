package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura{
	private Double tasaServicio;
	
	
	
	public Impuesto(Double tasaServicio, Agencia agencia) {
		super();
		this.tasaServicio = tasaServicio;
		this.agenciaRecaudadora = agencia;
	}

	@Override
	public Double getMonto() {
		return tasaServicio;
	}

	@Override
	public void registrarse() {
		agenciaRecaudadora.registrarPago(this);
		
	}
}
