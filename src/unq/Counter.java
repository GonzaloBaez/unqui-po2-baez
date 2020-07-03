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
			if(this.esPar(numero)) {
				pares++;
			}
		}
		return pares;
	}
	
	public int getUnevenOcurrences(){
		int impares= 0;
		for(int numero:numeros) {
			if(numero==1 || this.noEsPar(numero)) {
				impares++;
			}
		}
		return impares;
	}
	
	public int multiplosDe(int a) {
		int multiplos = 0;
		for(int numero:numeros) {
			if(this.esMultiploDe(numero, a)) {
				multiplos++;
			}
		}
		return multiplos;
	}
	
	public boolean esPar(int numero) {
		return numero%2 == 0;
	}
	
	public boolean noEsPar(int numero) {
		return !this.esPar(numero);
	}
	
	public boolean esMultiploDe(int numeroPosibleMultiplo,int numero) {
		return numeroPosibleMultiplo%numero==0;
	}
}
