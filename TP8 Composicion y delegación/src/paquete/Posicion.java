package paquete;

public class Posicion {
	public int x;
	public int y;
	
	public Posicion(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public double calcularDistancia(int x, int y) {
		return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));
	}
	
	public void moverse(int x, int y) {
		this.x+=x;
		this.y+=y;
	}

	@Override
	public String toString() {
		return "Posicion [x=" + x + ", y=" + y + "]";
	}
	
}
