package paquete;

public class Guerrero extends Personaje {
	
	public Guerrero(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.vitalidad = 500;
		this.alcance = 10;
		this.ataque = 10;
	}

	@Override
	public String toString() {
		return "Guerrero"+super.toString();
	}

	
	
}
