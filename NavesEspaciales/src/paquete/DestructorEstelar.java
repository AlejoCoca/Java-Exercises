package paquete;

public class DestructorEstelar extends NaveEspacial {
	
	private int cantidadTripulantes;
	
	
	public DestructorEstelar(double posicionX, double posicionY, String nombre, int cantidadTripulantes) {
		super(posicionX, posicionY, nombre);
		this.cantidadTripulantes = cantidadTripulantes;
		this.energia=1000;
		this.alcance=100;
	}
	
	public int getCantidadTripulantes() {
		return cantidadTripulantes;
	}

	public void setCantidadTripulantes(int cantidadTripulantes) {
		this.cantidadTripulantes = cantidadTripulantes;
	}

	@Override
	public void ataca(NaveEspacial adversario) {
		adversario.setEnergia(adversario.getEnergia()-200);
	}

	@Override
	public void mueve(double posicionX, double posicionY) {
		super.mueve(posicionX-posicionX/2, posicionY-posicionY/2);
	}

	@Override
	public String toString() {
		return "DestructorEstelar [cantidadTripulantes=" + cantidadTripulantes + ", nombre=" + nombre + ", energia="
				+ energia + ", posicionX=" + posicionX + ", posicionY=" + posicionY + "]";
	}
	
}
