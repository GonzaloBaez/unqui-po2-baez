package ar.edu.unq.po2.tp4;

public class Servicio extends Factura{

	private Double costoPorUnidad;
	private Double cantidadConsumida;
	
	
	
	public Servicio(Double costoPorUnidad, Double cantidadConsumida, Agencia agencia) {
		super();
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadConsumida = cantidadConsumida;
		this.agenciaRecaudadora = agencia;
	}

	@Override
	public Double getMonto() {
		return this.costoPorUnidad * this.cantidadConsumida;
	}

	@Override
	public void registrarse() {
		agenciaRecaudadora.registrarPago(this);
		
	}
	
	
}
