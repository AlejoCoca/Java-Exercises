package modelo;

public class Posicion {
	private double x;
	private double y;
	
	
	
	public Posicion(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Posicion() {
		super();
		this.x = 0;
		this.y = 0;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public void setX(double x){
		this.x=x;
	}
	
	public void setY(double y){
		this.y=y;
	}
	
	public void incrementaPos(double valorX, double valorY) {
		this.x+=valorX;
		this.y+=valorY;
	}
	
	public double distancia(Posicion enemigo) {
		return Math.sqrt((Math.pow(enemigo.getX()-x,2))+(Math.pow(enemigo.getY()-y,2)));
	}

	@Override
	public String toString() {
		return "Posicion [x=" + x + ", y=" + y + "]";
	}
	
}
