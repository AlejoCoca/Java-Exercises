package paquete;

public class Contrato {
	private String nombre;
	private double sueldoMensual;
	
	public Contrato(String nombre, double sueldoMensual) {
		super();
		this.nombre = nombre;
		this.sueldoMensual = sueldoMensual;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoMensual() {
		return sueldoMensual;
	}
	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	
	
}
