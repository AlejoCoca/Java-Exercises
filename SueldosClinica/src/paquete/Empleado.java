package paquete;

public abstract class Empleado {
	protected String nombre;
	protected double documento;
	protected Domicilio domicilio;
	
	public Empleado(String nombre, double documento, Domicilio domicilio) {
		super();
		this.nombre = nombre;
		this.documento = documento;
		this.domicilio = domicilio;
	}
	
	public String getNombre() {
		return nombre;
	}



	public double getDocumento() {
		return documento;
	}



	public Domicilio getDomicilio() {
		return domicilio;
	}



	public abstract double informarSueldo();
	
	
}
