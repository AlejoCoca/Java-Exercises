package paquete;

public abstract class NaveEspacial {
	protected String nombre;
	protected int energia;
	protected double posicionX;
	protected double posicionY;
	protected int alcance;
	
	
	public NaveEspacial(double posicionX, double posicionY, String nombre) {
		super();
		this.nombre = nombre;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	

	public double getAlcance() {
		return alcance;
	}

	public boolean entraEnRango(NaveEspacial adversario) {
		return ( alcance >= Math.sqrt((Math.pow(adversario.getPosicionX()-this.posicionX,2))+(Math.pow(adversario.getPosicionY()-this.posicionY,2))) );
	}
	
	public String getNombre() {
		return nombre;
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
	
	public void mueve(double posicionX, double posicionY) {
		this.posicionX-=posicionX;
		this.posicionY-=posicionY;
	}
	
	public abstract void ataca (NaveEspacial adversario);

	@Override
	public String toString() {
		return "NaveEspacial [nombre=" + nombre + ", energia=" + energia + ", posicionX=" + posicionX + ", posicionY="
				+ posicionY + "]";
	}
	
}
