package paquete;

public class CuentaUniversitaria extends CuentaBancaria {
	
	private double montoDiario;

	public CuentaUniversitaria(String titular) {
		super(titular);
		this.montoDiario=1000;
	}

	@Override
	public boolean extraer(double cantidad) {
		if(this.saldo-cantidad>0 && this.montoDiario-cantidad>0)
		{
			this.saldo-=cantidad;
			this.montoDiario-=cantidad;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void resetearMonto() {
		this.montoDiario=1000;
	}
	
	public double getMontoDiario() {
		return montoDiario;
	}

	@Override
	public String toString() {
		return "Cuenta Universitaria: "+super.toString()+", montoDiario=" + montoDiario;
	}

	
}
