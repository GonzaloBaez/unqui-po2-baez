package ar.edu.unq.po2.tp9StateStrategy.parte1;

public class CaracterO extends CaracterATransformar{

	@Override
	public boolean hayQueCambiarElCaracter(char caracter) {
		// TODO Auto-generated method stub
		return caracter=='o';
	}

	@Override
	public char caracterSiguiente() {
		// TODO Auto-generated method stub
		return 'u';
	}

	@Override
	public char caracterAnterior() {
		// TODO Auto-generated method stub
		return 'i';
	}

}
