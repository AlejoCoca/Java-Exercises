package Ej1;

public class DestructorEstelar extends NaveEspacial {
	
	private int cantidadTripulantes;

	public DestructorEstelar(double posicionX, double posicionY, int cantidadTripulantes) {
		super(posicionX, posicionY);
		this.energia = 1000;
		this.cantidadTripulantes = cantidadTripulantes;
	}
	@Override
	public void mueve(double aumX,double aumY) {
		this.posicionX += aumX/2;
		this.posicionY += aumY/2;
	}

	@Override
	public String toString() {
		return "DestructorEstelar [cantidadTripulantes=" + cantidadTripulantes + ", nombre=" + nombre + ", energia="
				+ energia + ", posicionX=" + posicionX + ", posicionY=" + posicionY + "]";
	}
	@Override
	public void ataca(NaveEspacial adversario) {
		adversario.setEnergia(adversario.getEnergia() - 200);

	}

}
