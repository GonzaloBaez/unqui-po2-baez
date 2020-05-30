package ar.edu.unq.po2.tp7TDD.parte3;

import java.util.ArrayList;


public class PokerStatus {

	String jugadaActual="nada";
	
	
	public void setJugadaActual(String jugadaActual) {
		this.jugadaActual = jugadaActual;
	}


	public String verificar(String primeraCarta,String segundaCarta, String terceraCarta,String cuartaCarta,String quintaCarta) {
		ArrayList<String> cartasEnMano = new ArrayList<String>();
		cartasEnMano.add(primeraCarta);
		cartasEnMano.add(segundaCarta);
		cartasEnMano.add(terceraCarta);
		cartasEnMano.add(cuartaCarta);
		cartasEnMano.add(quintaCarta);
		if(this.esPoker(cartasEnMano)) {
			this.setJugadaActual("poker");
		}else if(this.esColor(cartasEnMano)) {
			this.setJugadaActual("color");
		}else if(this.esTrio(cartasEnMano)){
			this.setJugadaActual("trio");
		}
		return this.getJugadaActual();
	}
	
	private String getJugadaActual() {
		
		return this.jugadaActual;
	}
	
	public boolean esPoker(ArrayList<String> cartasEnMano) {
		int cantidadCartasIguales = 1;
		for(String carta:cartasEnMano) {
			for(String cartaAverificar:cartasEnMano) {
				if(	cartasEnMano.indexOf(carta)!= cartasEnMano.indexOf(cartaAverificar)&& 
					cartaAverificar.charAt(0)==carta.charAt(0)) {
					cantidadCartasIguales += 1;
				}
			}
			if(cantidadCartasIguales == 4) { return cantidadCartasIguales == 4;}
			cantidadCartasIguales = 1;
		}
		
		return cantidadCartasIguales == 4;
	}
	
	public boolean esColor(ArrayList<String> cartasEnMano) {
		int cantidadCartasIguales = 1;
		String primeraCarta = cartasEnMano.get(0);
		char paloDeCarta= primeraCarta.charAt(primeraCarta.length()-1);
		for(String carta:cartasEnMano) {
			if(paloDeCarta == carta.charAt(primeraCarta.length()-1)) {
				cantidadCartasIguales +=1;
			}
		}
		return cantidadCartasIguales>=5;
	}
	
	public boolean esTrio(ArrayList<String> cartasEnMano) {
		int cantidadCartasIguales = 1;
		for(String carta:cartasEnMano) {
			for(String cartaAverificar:cartasEnMano) {
				if(	cartasEnMano.indexOf(carta)!= cartasEnMano.indexOf(cartaAverificar)&& 
					cartaAverificar.charAt(0)==carta.charAt(0)) {
					cantidadCartasIguales += 1;
				}
			}
			if(cantidadCartasIguales == 3) { return cantidadCartasIguales == 3;}
			cantidadCartasIguales = 1;
		}
		return cantidadCartasIguales == 3;
	}
}


