package paquete;

public class Defensor extends Jugador {

	public Defensor(String nombre, double velocidad, double potencia) {
		super(nombre, potencia, potencia); 
		this.tipo = "Defensor";
	}

	@Override
	double defensa() { 
		return this.velocidad * this.velocidad;
	}

	@Override
	double ataque() {
		return this.potencia * this.potencia;
	}

	@Override
	public String toString() {
		return "Defensor [nombre=" + nombre + ", velocidad=" + velocidad + ", potencia=" + potencia + "]";
	}

}
