package ar.edu.unq.po2.pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicio9.EquipoDeTrabajo;
import ejercicio9.Persona;

class EquipoDeTrabajoTest {

	EquipoDeTrabajo equipo1 = new EquipoDeTrabajo("programadores java");
	
	Persona persona1 = new Persona("kevin","stanley",24);
	Persona persona2 = new Persona("gabriel","moreyra",20);
	Persona persona3 = new Persona("gonzalo","baez",20);
	Persona persona4 = new Persona("lautaro","dellagiovanna",15);
	Persona persona5 = new Persona("alberto","molina",13);
	

	
	@Test
	public void comprobarPromedio(){
	equipo1.agregarIntegrante(persona1);
	equipo1.agregarIntegrante(persona2);
	equipo1.agregarIntegrante(persona3);
	equipo1.agregarIntegrante(persona4);
	equipo1.agregarIntegrante(persona5);
	
	System.out.printf("El promedio es %d", equipo1.getPromedioDeEdadIntegrantes());
	}
}
