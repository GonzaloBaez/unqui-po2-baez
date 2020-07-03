package ar.edu.unq.po2.tp9StateStrategy.parte1;

public class CaracterU extends CaracterATransformar{

	@Override
	public boolean hayQueCambiarElCaracter(char caracter) {
		// TODO Auto-generated method stub
		return caracter=='u';
	}

	@Override
	public char caracterSiguiente() {
		// TODO Auto-generated method stub
		return 'a';
	}

	@Override
	public char caracterAnterior() {
		// TODO Auto-generated method stub
		return 'o';
	}

}
