package unq;

public class Cuadrado {
	private Point base;
	private	int ancho;
	private int largo;
	
	public Cuadrado(Point base, int tamanio) {
		this.base=base;
		this.ancho=tamanio;
		this.largo=tamanio;
	}
	
	public int area() {
		return Math.abs(ancho*largo);
	}
	
	public int perimetro() {
		return (Math.abs(2*largo) + Math.abs(2*ancho));
	}

}
