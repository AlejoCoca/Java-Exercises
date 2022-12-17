package Ej2;

public class TrailerRefrigerado extends Trailer {
	private int temperaturaMinima;
	public TrailerRefrigerado(double precioXDia, int temperaturaMinima) {
		super(precioXDia);
		this.temperaturaMinima = temperaturaMinima;
	}
	
	
	public int getTemperaturaMinima() {
		return temperaturaMinima;
	}
	public void setTemperaturaMinima(int temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
	

}
