package ar.edu.unq.po2.tp9StateStrategy.parte1;


import java.util.ArrayList;
import java.util.List;

public class TransformadorDeCaracteres {

	List <CaracterATransformar> caracteresATransformar = new ArrayList<CaracterATransformar>();
	
	public char convertirCaracterSiguiente(char a) {
		char caracterConvertido = a;
		for(CaracterATransformar caracterATransformar:caracteresATransformar) {	
			if(caracterConvertido==a)	
			caracterConvertido = caracterATransformar.cambiarSiguienteSiEsCaracter(a);
		}
		return caracterConvertido;
	}

	public char convertirCaracterAnterior(char c) {
		char caracterConvertido = c;
		for(CaracterATransformar caracterATransformar:caracteresATransformar) {	
			if(caracterConvertido==c)	
			caracterConvertido = caracterATransformar.cambiarAnteriorSiEsCaracter(c);
		}
		return caracterConvertido;
	}
	
	public void agregarCaracter(CaracterATransformar caracterNuevo) {
		caracteresATransformar.add(caracterNuevo);
	}
	
	public void quitarCaracter(CaracterATransformar caracterNuevo) {
		caracteresATransformar.remove(caracterNuevo);
	}
}
