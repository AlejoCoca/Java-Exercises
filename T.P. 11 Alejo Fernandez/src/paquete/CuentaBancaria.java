package paquete;

public abstract class CuentaBancaria {
	
	protected String titular;
	protected double saldo;
	
	
	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo=0;
	}

	public String getTitular()
	{
		return titular;
	}
	
	public Double getSaldo()
	{
		return saldo;
	}
	
	public void depositar(double cantidad)
	{
		saldo+=cantidad;
	}
	
	public abstract boolean extraer(double cantidad);

	@Override
	public String toString() {
		return "titular=" + titular + ", saldo=" + saldo;
	}

	
	
}