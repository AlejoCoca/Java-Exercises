package paquete;

public class Domicilio {
	private String calle;
	private double numero;
	
	public Domicilio(String calle, double numero) {
		super();
		this.calle = calle;
		this.numero = numero;
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public double getNumero() {
		return numero;
	}
	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	
}
