package ar.edu.unq.po2.tp10Refactoring.Registro.src;

import java.time.LocalDate;

public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {
		// vehiculos policiales no realizan vtv, ya que tienen otro tipo de control
		// sólo realizan vtv los vehículos con más de 1 anio de antiguedad y radicados
		// en 'Buenos Aires'
		return (vehiculo.NoesVehiculoPolicial() && vehiculo.vehiculoTieneMasDeUnAnioDeAntiguedad(fecha)
				&& vehiculo.estaRadicadoEn("Buenos Aires"));

	}
	
	// existe feature envy (envidia de atributos) dentro del metodo, se extra primero en un metodo y despues mover el comportamiento a la clase
	// vehiculo
}
