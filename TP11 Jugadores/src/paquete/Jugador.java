package paquete;

public abstract class Jugador {
	public String nombre;
	public float velocidad;
	public float potencia;
	
	public Jugador(String nombre, float velocidad, float potencia) {
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.potencia = potencia;
	}

	public String getNombre() {
		return nombre;
	}

	public abstract double indiceDefensa();
	
	public abstract double indiceAtaque();
	
}
