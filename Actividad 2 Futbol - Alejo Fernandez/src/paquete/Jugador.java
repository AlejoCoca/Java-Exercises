package paquete;

public abstract class Jugador {

	protected String nombre;
	protected String tipo;
	protected double velocidad;
	protected double potencia;  
	public boolean fueCreado;
	
	public Jugador(String nombre, double velocidad, double potencia) {
		if(velocidad > 0.0 && velocidad < 1.0 &&
		   potencia  > 0.0 && potencia  < 1.0) {
			this.nombre = nombre;
			this.velocidad = velocidad;
			this.potencia = potencia;	
		} 
		else 
		{ 
			throw new RuntimeException("La velocidad y la potencia del jugador deben estar entre 0 y 1"); 
		}
	}
	
	abstract double defensa();
	
	abstract double ataque();
	
}
