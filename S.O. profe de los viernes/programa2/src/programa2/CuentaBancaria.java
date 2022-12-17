package programa2;

public class CuentaBancaria {
	
	private String titular;
	private double saldo=0;
	private int cantidadDepositos, cantidadExtracciones;
	
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
	
	public void setTitular(String titular)
	{
		this.titular=titular;
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
	
}
