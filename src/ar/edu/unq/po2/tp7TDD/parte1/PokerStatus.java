package ar.edu.unq.po2.tp7TDD.parte1;

import java.util.ArrayList;


public class PokerStatus {

	public boolean verificar(String primeraCarta,String segundaCarta, String terceraCarta,String cuartaCarta,String quintaCarta) {
		ArrayList<String> cartasEnMano = new ArrayList<String>();
		cartasEnMano.add(primeraCarta);
		cartasEnMano.add(segundaCarta);
		cartasEnMano.add(terceraCarta);
		cartasEnMano.add(cuartaCarta);
		cartasEnMano.add(quintaCarta);
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
	
	
}
