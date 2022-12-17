package paquete;

public class CuentaCorriente extends CuentaBancaria {
	
	private double tope;

	public CuentaCorriente(String titular, double tope) {
		super(titular);
		this.tope=tope;
	}

	@Override
	public boolean extraer(double cantidad) {
		if(this.saldo-cantidad>=-tope)
		{
			this.saldo-=cantidad; 
			return true;
		}
		else
		{
			return false;
		}
	}

	public double getTope() {
		return tope;
	}

	public void setTope(double tope) {
		this.tope = tope;
	}

	@Override
	public String toString() {
		return "Cuenta Corriente: "+super.toString()+" [tope=" + tope + "]";
	}
	
}
