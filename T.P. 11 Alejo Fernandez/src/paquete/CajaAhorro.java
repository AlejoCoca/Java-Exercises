package paquete;

public class CajaAhorro extends CuentaBancaria {
	
	private int cantidadExtracciones;
	private int topeExtracciones;

	public CajaAhorro(String titular) {
		super(titular);
		this.cantidadExtracciones=0;
		this.topeExtracciones=5;
	}
	
	@Override
	public boolean extraer(double cantidad) {
		if(this.saldo-cantidad>0 && this.cantidadExtracciones+1<=this.topeExtracciones)
		{
			this.saldo-=cantidad;
			this.cantidadExtracciones++;
			return true;
		}
		else
		{
			return false;
		}
	}

	public int getCantidadExtracciones() {
		return cantidadExtracciones;
	}

	public int getTopeExtracciones() {
		return topeExtracciones;
	}

	public void setTopeExtracciones(int topeExtracciones) {
		this.topeExtracciones = topeExtracciones;
	}

	@Override
	public String toString() {
		return "Caja Ahorro: "+super.toString()+"[cantidadExtracciones=" + cantidadExtracciones + ", topeExtracciones=" + topeExtracciones + "]";
	}
	
}
