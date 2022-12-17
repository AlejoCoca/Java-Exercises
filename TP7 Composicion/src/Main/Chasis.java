package Main;

public class Chasis {
	private String nChasis;
	private double peso;
	
	public Chasis(String nChasis, double peso) {
		this.nChasis = nChasis;
		this.peso = peso;
	}
	
	public String getnChasis() {
		return nChasis;
	}
	public double getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Chasis [nChasis=" + nChasis + ", peso=" + peso + "]";
	}
	
}
