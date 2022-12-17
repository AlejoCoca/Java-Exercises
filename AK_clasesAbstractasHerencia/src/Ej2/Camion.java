package Ej2;

public class Camion extends Vehiculo {
	private Trailer trailer;
	public Camion(double plaza) {
		super(plaza); 
	}
	public Camion(double plaza,Trailer trailer) {
		super(plaza); 
		this.trailer = trailer;
	}
	@Override
	public double calcularAlquiler(double dias) { 
		return (precioBaseXDia * dias) + ((precioBaseXDia/100) * 40) + (trailer!=null? (trailer.getPrecioXDia() * dias):0);	
	}

}
