package CuentaBancaria;

public class ExtraccionInvalidaException extends Exception {
	private double extraccion_invalida;
	private double saldo;
	public ExtraccionInvalidaException(String mensaje,double extraccion_invalida, double saldo) {
		super(mensaje);
		this.extraccion_invalida = extraccion_invalida;
		this.saldo = saldo;
	}
	public double getExtraccion_invalida() {
		return extraccion_invalida;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
