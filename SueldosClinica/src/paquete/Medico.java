package paquete;

public class Medico extends Empleado {
	private Contrato contrato;
	private double numeroMatricula;

	public Medico(String nombre, double documento, Domicilio domicilio, Contrato contrato, double numeroMatricula) {
		super(nombre, documento, domicilio);
		this.contrato = contrato;
		this.numeroMatricula = numeroMatricula;
	}
	
	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public double getNumeroMatricula() {
		return numeroMatricula;
	}

	public double informarSueldo() {
		return this.contrato.getSueldoMensual();
	}
	
	
}
