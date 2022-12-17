package paquete;

public class Arquero extends Jugador{

	private double defensa = 0.5;
	 
	public Arquero(String nombre, double velocidad, double potencia) {
		super(nombre, velocidad, potencia);
		this.tipo = "Arquero";
	}
	
	public void setDefensa(double defensa) {
		if(velocidad > 0.0 && velocidad < 1.0) {
			this.defensa = defensa;				
		}else {
			System.out.println("La defensa ingresada debe estar entre 0 y 1");
		}
	}
	
	@Override
	double defensa() {
		return this.defensa;
	}

	@Override
	double ataque() {
		return 0.1 * velocidad * potencia;
	}
	@Override
	public String toString() {
		return "Arquero [defensa=" + defensa + ", nombre=" + nombre + ", velocidad=" + velocidad + ", potencia="
				+ potencia + "]";
	}
	

}
