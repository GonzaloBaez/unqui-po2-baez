package unq;

import java.util.ArrayList;

public class Multioperador {
	
	public int sumar(ArrayList<Integer> lista) {
		int resultado=0;
		for(int numero:lista) {
			resultado+=numero;
		}
		return resultado;
	}
	
	public int resta(ArrayList<Integer> lista) {
		int resultado = lista.get(0);
		lista.remove(0);
		for(int numero:lista) {
			resultado-=numero;
		}
		return resultado;
	}
	
	public int multiplicacion(ArrayList<Integer> lista) {
		int resultado=1;
		for (int numero:lista) {
			resultado=resultado*numero;
		}
		return resultado;
	}
	
	public int division(ArrayList<Integer> lista) {
		int resultado = lista.get(0);
		lista.remove(0);
		for(int numero:lista){
			resultado= resultado / numero;
		}
		return resultado;
	}
}

