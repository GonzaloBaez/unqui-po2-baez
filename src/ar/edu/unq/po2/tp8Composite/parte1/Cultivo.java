package ar.edu.unq.po2.tp8Composite.parte1;

public interface Cultivo {
	// component
	public int gananciaAnual(); // operation
	public void agregarCultivo(Cultivo cultivo); //add
	public void removerCultivo(Cultivo cultivo); //remove
	
	// obtener hijo segun la posicion del composite o el total?
}
