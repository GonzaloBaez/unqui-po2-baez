package ar.edu.unq.po2.tp7TDD.parte3;

public class Carta {

	Valor valor;
	String palo;
	
	public Carta(Valor valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public Valor getValor(){
		
		return this.valor;
	}
	
	public String getPalo(){
		return this.palo;
	}

	public boolean esDelMismoPalo(Carta carta) {
		
		return this.getPalo().equals(carta.getPalo());
	}

	public boolean esSuperior(Carta carta) {
		
		return this.getValor().ordinal()>carta.getValor().ordinal();
	}

}
