package unq;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // preguntar
	
	private LocalDate ahora = LocalDate.now();
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	public Persona() {
		super();
	}
	public void setNombre(String nombrePersona) {
		nombre=nombrePersona;
	}
	
	public void setFechaDeNacimiento(LocalDate fechaNac) {
		fechaDeNacimiento=fechaNac;
	}
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int getEdad() {
		Period periodo = Period.between(fechaDeNacimiento, ahora);
		return periodo.getYears();
	}
	
	public boolean menorQue(Persona otraPersona) {
		
		return (this.getEdad()<otraPersona.getEdad());
	}
	
	public Persona Persona(String nombre,LocalDate fechaDeNac) { //preguntar
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setFechaDeNacimiento(fechaDeNac);
		return persona;
	}

}
