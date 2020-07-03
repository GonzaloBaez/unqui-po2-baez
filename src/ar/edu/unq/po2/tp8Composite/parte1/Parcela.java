package ar.edu.unq.po2.tp8Composite.parte1;

import java.util.ArrayList;

public class Parcela implements Cultivo{
	//Composite
	private ArrayList<Cultivo> cultivos = new ArrayList<Cultivo>();
	
	@Override
	public int gananciaAnual() {
		int precioActual = 0;
		for(Cultivo cultivo:this.cultivos) {
			precioActual+= (cultivo.gananciaAnual()/cultivos.size());
		}
		return precioActual;
	}

	@Override
	public void agregarCultivo(Cultivo cultivo) {
		cultivos.add(cultivo);
	}

	@Override
	public void removerCultivo(Cultivo cultivo) {
		cultivos.remove(cultivo);
	}

}
