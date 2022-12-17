package Ej1;

public class CazaLigero extends NaveEspacial {

	
	public CazaLigero(double posicionX, double posicionY) {
		super(posicionX, posicionY);
		this.energia = 500;
	}

	@Override
	public String toString() {
		return "CazaLigero [nombre=" + nombre + ", energia=" + energia + ", posicionX=" + posicionX + ", posicionY="
				+ posicionY + "]";
	}

	@Override
	public void ataca(NaveEspacial adversario) {
		adversario.setEnergia(adversario.getEnergia() - 50);
	}

}
