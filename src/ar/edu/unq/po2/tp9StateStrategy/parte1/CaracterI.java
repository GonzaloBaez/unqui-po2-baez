package ar.edu.unq.po2.tp9StateStrategy.parte1;

public class CaracterI extends CaracterATransformar{

	@Override
	public boolean hayQueCambiarElCaracter(char caracter) {
		// TODO Auto-generated method stub
		return caracter=='i';
	}

	@Override
	public char caracterSiguiente() {
		// TODO Auto-generated method stub
		return 'o';
	}

	@Override
	public char caracterAnterior() {
		// TODO Auto-generated method stub
		return 'e';
	}

}
