package paquete;

public class Delantero extends Jugador{
	 
	public Delantero(String nombre, double velocidad, double potencia) {
		super(nombre, velocidad, potencia);
		this.tipo = "Delantero";
	 }

	@Override
	double defensa() {
		 return this.velocidad * 0.5;
	}

	@Override
	double ataque() {
		 return velocidad * potencia;
	}

	@Override
	public String toString() {
		return "Delantero [nombre=" + nombre + ", velocidad=" + velocidad + ", potencia=" + potencia + "]";
	}

}
