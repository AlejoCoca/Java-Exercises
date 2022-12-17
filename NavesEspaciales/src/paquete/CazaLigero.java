package paquete;

public class CazaLigero extends NaveEspacial {

	
	public CazaLigero(double posicionX, double posicionY, String nombre) {
		super(posicionX, posicionY, nombre);
		this.energia=500;
		this.alcance=60;
	}

	@Override
	public void ataca(NaveEspacial adversario) {
		adversario.setEnergia(adversario.getEnergia()-50);
	}

}
