package ar.edu.unq.po2.tp8Observer.parte1;

import java.util.ArrayList;
import java.util.List;

public class ArticuloCientifico {

	private String titulo;
	private String autores;
	private String filiaciones;
	private String tipo;
	private String lugarPublicado;
	private List<String> palabrasClaves= new ArrayList<String>();
	
	public ArticuloCientifico(String titulo, String autores,String filiaciones, String tipo,
			String lugarPublicado, List<String> palabrasClaves) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.filiaciones = filiaciones;
		this.tipo = tipo;
		this.lugarPublicado = lugarPublicado;
		this.palabrasClaves = palabrasClaves;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutores() {
		return autores;
	}

	public String getFiliaciones() {
		return filiaciones;
	}

	public String getTipo() {
		return tipo;
	}

	public String getLugarPublicado() {
		return lugarPublicado;
	}

	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}
}
