package Ej2;

public class Auto extends Vehiculo {

	public Auto(double plaza) {
		super(plaza);
	}

	@Override
	public double calcularAlquiler(double dias) {
		return (precioBaseXDia + ((precioBaseXDia/100) * (1.5 * plaza))) * dias;
	}

}
