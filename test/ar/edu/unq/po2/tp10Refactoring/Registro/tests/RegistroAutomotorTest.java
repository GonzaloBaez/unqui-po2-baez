package ar.edu.unq.po2.tp10Refactoring.Registro.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import ar.edu.unq.po2.tp10Refactoring.Registro.src.RegistroAutomotor;
import ar.edu.unq.po2.tp10Refactoring.Registro.src.Vehiculo;

public class RegistroAutomotorTest {
	
	@Test
	public void testVehiculosQueDebenRealizarVtv() {
		RegistroAutomotor registroAutomotor = new RegistroAutomotor();
		Vehiculo vehiculoPolicial = new Vehiculo(true, LocalDate.of(2018, 1, 1), "Buenos Aires");
		Vehiculo vehiculoReciente = new Vehiculo(false, LocalDate.of(2018, 1, 1), "BuenosAires");
		Vehiculo vehiculoLaPlata = new Vehiculo(false, LocalDate.of(2018, 1, 1), "La Plata");
		Vehiculo vechiculoCumpleVtv = new Vehiculo(false, LocalDate.of(2018, 1, 1), "Buenos Aires");
		
		
		assertFalse("Vehiculos policiales no realizan vtv", registroAutomotor.debeRealizarVtv(vehiculoPolicial, LocalDate.of(2019, 10, 10)));
		assertFalse("Vehiculos con antiguedad menor a un anio no realizan vtv", registroAutomotor.debeRealizarVtv(vehiculoReciente, LocalDate.of(2018, 11, 10)));
		assertFalse("Vehiculos no radicados en Buenos Aires no realizan vtv", registroAutomotor.debeRealizarVtv(vehiculoLaPlata, LocalDate.of(2019, 10, 10)));
		assertTrue(registroAutomotor.debeRealizarVtv(vechiculoCumpleVtv, LocalDate.of(2019, 10, 10)));
	}
}
