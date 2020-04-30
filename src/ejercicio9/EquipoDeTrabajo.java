package ejercicio9;
import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	public String nombre;
	public ArrayList<Persona> integrantes = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombreEquipo) {
		this.nombre = nombreEquipo;
	}
	
	public String getNombreEquipo() {
		return(nombre);
	}
	
	public int getPromedioDeEdadIntegrantes() {
		int sumaDeEdades = 0;	
		for(Persona integrante:integrantes) {
			
			sumaDeEdades += integrante.getEdad();
			
		}
		return(sumaDeEdades/integrantes.size());
	}
	public void agregarIntegrante(Persona integrante) {
		integrantes.add(integrante);
	}
}
