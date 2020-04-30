package unq;

public class Point {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public void movePoinTo(int x,int y) {
		this.setX(x);
		this.setY(y);
	}
	public Point sumarCon(Point puntoASumar) {
		Point puntoNuevo = new Point();
		int xDePuntoNuevo = this.getX() + puntoASumar.getX();
		int yDePuntoNuevo = this.getY() + puntoASumar.getY();
		puntoNuevo.movePoinTo(xDePuntoNuevo, yDePuntoNuevo);
		return puntoNuevo;
	}
}
