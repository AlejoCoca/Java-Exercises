package CuentaBancaria;

public class CuentaBancaria {
	private double saldo;
	private String titular;
	
	public CuentaBancaria(double saldo, String titular) {
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void depositar(double cantidad)throws DepositoInvalidoException
	{
		if(cantidad>0)this.saldo+=cantidad;
		
		else throw new DepositoInvalidoException("Debe ingresar un valor mayor a 0",cantidad);
		
	}
	public void extraer(double cantidad)throws ExtraccionInvalidaException
	{
		if(this.saldo>=cantidad&&cantidad>=0)this.saldo-=cantidad;
		else throw new ExtraccionInvalidaException("Saldo insuficiente",cantidad,this.saldo);
	}

	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", titular=" + titular + "]";
	}
}
