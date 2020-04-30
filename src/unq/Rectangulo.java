package unq;

public class Rectangulo {
	private Point base;
	private	int ancho;
	private int largo;
	
	public Rectangulo(Point base, int ancho, int largo) {
		this.base=base;
		this.ancho=ancho;
		this.largo=largo;
	}
	
	public int area() {
		return Math.abs(ancho*largo);
	}
	
	public int perimetro() {
		return (Math.abs(2*largo) + Math.abs(2*ancho));
	}
}
