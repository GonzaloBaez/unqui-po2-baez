package ar.edu.unq.po2.tp9StateStrategy.parte1;

public abstract class CaracterATransformar {

	public char cambiarSiguienteSiEsCaracter(char caracter) {
		char caracterACambiar=caracter;
		if(this.hayQueCambiarElCaracter(caracterACambiar)) {
			caracterACambiar = this.caracterSiguiente();
		}
		return caracterACambiar;
	}
	

	public char cambiarAnteriorSiEsCaracter(char caracter) {
		char caracterACambiar=caracter;
		if(this.hayQueCambiarElCaracter(caracterACambiar)) {
			caracterACambiar = this.caracterAnterior();
		}
		return caracterACambiar;
	}

	public abstract boolean hayQueCambiarElCaracter(char caracter);
	public abstract char caracterSiguiente();
	public abstract char caracterAnterior();
}
