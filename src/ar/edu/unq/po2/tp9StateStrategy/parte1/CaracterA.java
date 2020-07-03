package ar.edu.unq.po2.tp9StateStrategy.parte1;

public class CaracterA extends CaracterATransformar{

	@Override
	public boolean hayQueCambiarElCaracter(char caracter) {
		
		return caracter == 'a';
	}

	@Override
	public char caracterSiguiente() {
		
		return 'e';
	}

	@Override
	public char caracterAnterior() {
		
		return 'u';
	}

}
