package Ej2;

public class CamionDeCarga extends Vehiculo {
	private double pesoMaximoAutorizado;
	public CamionDeCarga(double plaza, double pesoMaximoAutorizado) {
		super(plaza);
		this.pesoMaximoAutorizado = pesoMaximoAutorizado;
	}

	@Override
	public double calcularAlquiler(double dias) {
		
		return (precioBaseXDia + ((precioBaseXDia/100) * (20 * pesoMaximoAutorizado))) * dias;
	}

}
