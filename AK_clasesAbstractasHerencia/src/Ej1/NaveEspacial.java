package Ej1;

public abstract class NaveEspacial {
	protected String nombre;
	protected int energia;
	protected double posicionX;
	protected double posicionY;
	protected String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public double getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(double posicionX) {
		this.posicionX = posicionX;
	}
	public double getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(double posicionY) {
		this.posicionY = posicionY;
	}
	public NaveEspacial(double posicionX, double posicionY) {
		
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	
	
	@Override
	public String toString() {
		return "NaveEspacial [nombre=" + nombre + ", energia=" + energia + ", posicionX=" + posicionX + ", posicionY="
				+ posicionY + "]";
	}
	
	public void mueve(double aumX,double aumY) {
		this.posicionX += aumX;
		this.posicionY += aumY;
	}
	
	public abstract void ataca(NaveEspacial adversario);
	
	
}
