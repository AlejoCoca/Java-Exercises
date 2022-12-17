package CuentaBancaria;

public class DepositoInvalidoException extends Exception {
	private double cantidadInvalida;

	public DepositoInvalidoException(String mensaje,double cantidadInvalida) {
		super(mensaje);
		this.cantidadInvalida = cantidadInvalida;
	}

	public double getCantidadInvalida() {
		return cantidadInvalida;
	}
	
}
