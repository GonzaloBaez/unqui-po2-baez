package ar.edu.unq.po2.tp8Composite.parte1;

public class Soja implements Cultivo{
	//leaf o hoja
	private int ganancia = 500;

	@Override
	public int gananciaAnual() {
		
		return this.ganancia;
	}

	@Override
	public void agregarCultivo(Cultivo cultivo) {}

	@Override
	public void removerCultivo(Cultivo cultivo) {}
	
	
}
