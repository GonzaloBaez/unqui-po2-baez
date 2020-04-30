package unq;

import java.util.ArrayList;

public class Counter {
	ArrayList<Integer> numeros = new ArrayList<Integer>();

	public void addNumber(int numero) {
		// agrega un numero a la lista
		numeros.add(numero);
	}

	public int getEvenOcurrences() {
		// cuenta cuantos pares hay en la lista
		int pares = 0;
		for (int numero:numeros) {
			if(numero%2 == 0) {
				pares++;
			}
		}
		return pares;
	}
	
	public int getUnevenOcurrences(){
		int impares= 0;
		for(int numero:numeros) {
			if(numero==1 || numero%2 == 1) {
				impares++;
			}
		}
		return impares;
	}
	
	public int multiplosDe(int a) {
		int multiplos = 0;
		for(int numero:numeros) {
			if(numero%a==0) {
				multiplos++;
			}
		}
		return multiplos;
	}
}
