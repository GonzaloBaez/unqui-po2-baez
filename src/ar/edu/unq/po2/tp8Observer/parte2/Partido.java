package ar.edu.unq.po2.tp8Observer.parte2;

import java.util.ArrayList;
import java.util.List;

public class Partido {

	private Deporte deporte;
	private String resultado;
	private List<String> contrincantes = new ArrayList<String>();
	
	public Deporte getDeporte() {
		return deporte;
	}
	public String getResultado() {
		return resultado;
	}
	public Partido(Deporte deporte, String resultado, List<String> contrincantes) {
		super();
		this.deporte = deporte;
		this.resultado = resultado;
		this.contrincantes = contrincantes;
	}
	public List<String> getContrincantes() {
		return contrincantes;
	}
	
	
	
}
