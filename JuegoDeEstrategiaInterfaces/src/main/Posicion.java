package main;
public class Posicion implements Movible{
 
	private double positionX;
	private double positionY;
	
	public Posicion(double positionX, double positionY) {
		
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public double getPositionX() {return this.positionX;}
	public double getPositionY() {return this.positionY;}
	public void incrementarPos(double incX, double incY) {
		this.positionX+=incY;
		this.positionY+=incX; 
	}
	public double distancia(Movible otro) {
		double distanciaEntre = 0;
		
		double A = Math.pow((otro.getPositionX()-this.positionX),2);
		double B = Math.pow((otro.getPositionY()-this.positionY),2);
		distanciaEntre = Math.sqrt((A+B)); 
		return distanciaEntre;
	}
 
}

