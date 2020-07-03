package ar.edu.unq.po2.tp9StateStrategy.parte1;

public class EncriptadorNaive {

	private IFormaDeEncriptado formaDeEncriptado;

	public void cambiarFormaDeEncriptado(IFormaDeEncriptado nuevaFormaDeEncriptado) {
		this.formaDeEncriptado = nuevaFormaDeEncriptado;
		
	}

	public String encriptar(String texto) {
		
		return this.formaDeEncriptado.encriptar(texto);
	}

	public String desencriptar(String texto) {
		
		return this.formaDeEncriptado.desencriptar(texto);
	}

}
