package ar.edu.unq.po2.tp9StateStrategy.parte1;

import java.util.ArrayList;
import java.util.List;

public class CambiarPorPosicionDeAbecedario implements IFormaDeEncriptado{

	List<Character> abecedario = List.of(' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
	@Override
	public String encriptar(String texto) {
		char[] partes = texto.toCharArray();
		String textoCodificado = "";
		for(int i = 0; i<partes.length; i++) {
			Integer numero = abecedario.indexOf(partes[i]);
			textoCodificado = textoCodificado + (numero);
			textoCodificado = this.agregarComaSiNoEsUltimo(i,partes.length-1,textoCodificado);
		}

		return textoCodificado;
	}
 
	private String agregarComaSiNoEsUltimo(int posicion,int ultimaPosicion,String textoCodificado) {
		if(posicion!=(ultimaPosicion)) {
			textoCodificado = textoCodificado + ",";
		}
		return textoCodificado;
	}
	
	@Override
	public String desencriptar(String texto) {
		String[] partes = texto.split(",");
		String textoCodificado = "";
		for(int i = 0; i<partes.length; i++) {
			char numero = abecedario.get(Integer.parseInt(partes[i]));
			textoCodificado = textoCodificado + (numero);
			
		}

		return textoCodificado;
	}

}
