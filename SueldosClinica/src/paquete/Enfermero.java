package paquete;

public class Enfermero extends Empleado {
	private int antiguedad;
	private double sueldoBasico=30000;
	
	public Enfermero(String nombre, double documento, Domicilio domicilio, int antiguedad) {
		super(nombre, documento, domicilio);
		this.antiguedad = antiguedad;
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public double informarSueldo() {
		return this.sueldoBasico+(this.sueldoBasico*0.05)*antiguedad;
	}
	
}
