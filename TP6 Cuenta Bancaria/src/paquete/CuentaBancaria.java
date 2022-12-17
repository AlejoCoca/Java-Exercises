package paquete;

public class CuentaBancaria {
	
	private String titular;
	private double saldo;
	private int cantidadDepositos, cantidadExtracciones;
	
	
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
	
	public int getCantidadDepositos()
	{
		return cantidadDepositos;
	}
	
	public int getCantidadExtracciones()
	{
		return cantidadExtracciones;
	}
	
	
	public void depositar(double cantidad)
	{
		saldo+=cantidad;
		cantidadDepositos++;
	}
	
	public boolean extraer(double cantidad)
	{
		if(saldo-cantidad>0)
		{
			saldo-=cantidad;
			cantidadExtracciones++;
			return true;
		}
		else
		{
			return false;
		}
	}

	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + ", cantidadDepositos=" + cantidadDepositos
				+ ", cantidadExtracciones=" + cantidadExtracciones + "]";
	}
	
}
