package ar.edu.unq.po2.tp10Refactoring.Registro.src;

import java.time.LocalDate;

public class Vehiculo {
	private Boolean esVehiculoPolicial;
	private LocalDate fechaFabricacion;	
	private String ciudadRadicacion; 
	
	public Vehiculo(Boolean esVehiculoPolicial, LocalDate fechaFabricacion, String ciudadRadicacion) {
		this.esVehiculoPolicial = esVehiculoPolicial;
		this.fechaFabricacion = fechaFabricacion;
		this.ciudadRadicacion = ciudadRadicacion;
	}

	public Boolean esVehiculoPolicial() {
		return esVehiculoPolicial;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public String ciudadRadicacion() {
		return ciudadRadicacion;
	}
	
	public boolean NoesVehiculoPolicial() {
		return !this.esVehiculoPolicial();
	}
	
	public boolean vehiculoTieneMasDeUnAnioDeAntiguedad(LocalDate fecha) {
		
		return fecha.minusYears(1).isAfter(this.getFechaFabricacion());
	}
	
	public boolean estaRadicadoEn(String ciudad) {
		return this.ciudadRadicacion().equalsIgnoreCase("Buenos Aires");
	}
}
