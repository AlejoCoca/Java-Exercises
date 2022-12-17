package Ej2;

public abstract class Vehiculo {
	protected double precioBaseXDia=500;
	protected double plaza;
	public Vehiculo(double plaza) { 
		this.plaza = plaza;
	}

	public double getPrecioBaseXDia() {
		return precioBaseXDia;
	}
	
	public abstract double calcularAlquiler(double dias);

}
