package Ej2;

public class Combi extends Vehiculo {

	public Combi(double plaza) {
		super(plaza);
	}

	@Override
	public double calcularAlquiler(double dias) {
		return (precioBaseXDia * dias) + ((precioBaseXDia/100) * (2 * plaza));
	}

}
