package ar.edu.unq.po2.tp9StateStrategy.parte1;



public class CambiarPorVocalSiguiente implements IFormaDeEncriptado{

	TransformadorDeCaracteres transformadorDeCaracteres;
	
	public CambiarPorVocalSiguiente(TransformadorDeCaracteres transformadorDeCaracteres) {
		this.transformadorDeCaracteres = transformadorDeCaracteres; 
	}
	@Override
	public String encriptar(String texto) {
		char[] textoAEncriptar = texto.toCharArray();
		char[] textoEncriptado = new char[textoAEncriptar.length];
		for(int i = 0; i<textoAEncriptar.length; i++) {
			textoEncriptado[i]=this.transformadorDeCaracteres.convertirCaracterSiguiente(textoAEncriptar[i]);
		}
		String textoCodificado = new String(textoEncriptado);
		return textoCodificado;
	}

	@Override
	public String desencriptar(String texto) {
		char[] textoADesencriptar = texto.toCharArray();
		char[] textoDesencriptado = new char[textoADesencriptar.length];
		for(int i = 0; i<textoADesencriptar.length; i++) {
			textoDesencriptado[i]=this.transformadorDeCaracteres.convertirCaracterAnterior(textoADesencriptar[i]);
		}
		String textoCodificado = new String(textoDesencriptado);
		return textoCodificado;
	}

}
