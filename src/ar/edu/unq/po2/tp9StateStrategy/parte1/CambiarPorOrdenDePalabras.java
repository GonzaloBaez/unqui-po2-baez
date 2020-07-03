package ar.edu.unq.po2.tp9StateStrategy.parte1;

import java.util.Arrays;

public class CambiarPorOrdenDePalabras implements IFormaDeEncriptado{

	@Override
	public String encriptar(String texto) {
		String string = texto;
		String[] partes = string.split(" ");
		String[] textoCodificado = new String[partes.length];
		for(int i = 0; i<partes.length; i++) {
			textoCodificado[(partes.length-1)-i] = partes[i];
		}

		return String.join(" ", Arrays.asList(textoCodificado));
	}

	@Override
	public String desencriptar(String string) {
		
		return this.encriptar(string);
	}

}
