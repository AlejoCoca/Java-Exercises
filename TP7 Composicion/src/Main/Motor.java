package Main;

public class Motor {
	private String nSerie;
	private double cilindrada;
	private String tipoCombustible;
	
	public Motor(String nSerie, double cilindrada, String tipoCombustible) {
		this.nSerie = nSerie;
		this.cilindrada = cilindrada;
		this.tipoCombustible = tipoCombustible;
	}
	
	public String getnSerie() {
		return nSerie;
	}
	public double getCilindrada() {
		return cilindrada;
	}
	public String getTipoCombustible() {
		return tipoCombustible;
	}

	@Override
	public String toString() {
		return "Motor [nSerie=" + nSerie + ", cilindrada=" + cilindrada + ", tipoCombustible=" + tipoCombustible + "]";
	}
	
	
}
