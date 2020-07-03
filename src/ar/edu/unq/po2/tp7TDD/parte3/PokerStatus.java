package ar.edu.unq.po2.tp7TDD.parte3;

import java.util.ArrayList;


public class PokerStatus {

	String jugadaActual="nada";
	
	
	public void setJugadaActual(String jugadaActual) {
		this.jugadaActual = jugadaActual;
	}


	public String verificar(Carta primeraCarta,Carta segundaCarta, Carta terceraCarta,Carta cuartaCarta,Carta quintaCarta) {
		ArrayList<Carta> cartasEnMano = new ArrayList<Carta>();
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
	
	public boolean esPoker(ArrayList<Carta> cartasEnMano) {
		int cantidadCartasIguales = 1;
		for(Carta carta:cartasEnMano) {
			for(Carta cartaAverificar:cartasEnMano) {
				if(	cartasEnMano.indexOf(carta)!= cartasEnMano.indexOf(cartaAverificar)&& 
					cartaAverificar.getValor()==carta.getValor()) {
					cantidadCartasIguales += 1;
				}
			}
			if(cantidadCartasIguales == 4) { return cantidadCartasIguales == 4;}
			cantidadCartasIguales = 1;
		}
		
		return cantidadCartasIguales == 4;
	}
	
	public boolean esColor(ArrayList<Carta> cartasEnMano) {
		int cantidadCartasIguales = 1;
		Carta primeraCarta = cartasEnMano.get(0);
		for(Carta carta:cartasEnMano) {
			if(primeraCarta.esDelMismoPalo(carta)) {
				cantidadCartasIguales +=1;
			}
		}
		return cantidadCartasIguales>=5;
	}
	
	public boolean esTrio(ArrayList<Carta> cartasEnMano) {
		int cantidadCartasIguales = 1;
		for(Carta carta:cartasEnMano) {
			for(Carta cartaAverificar:cartasEnMano) {
				if(	cartasEnMano.indexOf(carta)!= cartasEnMano.indexOf(cartaAverificar)&& 
					cartaAverificar.getValor()==carta.getValor()) {
					cantidadCartasIguales += 1;
				}
			}
			if(cantidadCartasIguales == 3) { return cantidadCartasIguales == 3;}
			cantidadCartasIguales = 1;
		}
		return cantidadCartasIguales == 3;
	}
}


