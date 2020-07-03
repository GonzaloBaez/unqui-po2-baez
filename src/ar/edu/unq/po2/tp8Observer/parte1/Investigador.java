package ar.edu.unq.po2.tp8Observer.parte1;

import java.util.ArrayList;
import java.util.List;

import sun.tools.tree.ThisExpression;

public class Investigador implements Observador{

	private Sistema sistema;
	private List<String> temasDeInteres = new ArrayList<String>();
	
	public Investigador(Sistema sistema) {
		this.sistema = sistema;
	}
	public void cargarArticulo(String titulo,String autores,String filiaciones,String tipo,String lugarPublicado,ArrayList<String> palabrasClaves) {
		ArticuloCientifico articuloNuevo = new ArticuloCientifico(titulo,autores,filiaciones,tipo,lugarPublicado,palabrasClaves);
		this.sistema.agregarArticulo(articuloNuevo);
	}
	public void suscribirse(String nuevoTema) {
		this.sistema.suscribir(this);
		this.agregarTemaDeInteres(nuevoTema);
	}
	
	public void desuscribirse() {
		this.sistema.desuscribir(this);
	}
	
	public Sistema getSistema() {
		return this.sistema;
	}
	
	public List<String> getTemasDeInteres(){
		return this.temasDeInteres;
	}
	@Override
	public void update(ArticuloCientifico articulo) {
		if(this.esTemaDeInteresParaInvestigador(articulo.getPalabrasClaves())) {
			System.out.println("Se agrego un nuevo articulo de tu interes");
		}	
	}
	
	private boolean esTemaDeInteresParaInvestigador(List<String> palabrasClavesArticulo) {
		int temasQueSonDeInteres = 0;
		for(String palabraClave:palabrasClavesArticulo) {
			if(this.getTemasDeInteres().contains(palabraClave)) {
				temasQueSonDeInteres++;
			}
		}
		return temasQueSonDeInteres>=1;
	}
	
	private void agregarTemaDeInteres(String nuevoInteres) {
		this.temasDeInteres.add(nuevoInteres);
	}

}
