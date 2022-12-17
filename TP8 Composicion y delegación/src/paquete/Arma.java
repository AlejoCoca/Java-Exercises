package paquete;

public class Arma {
	public String nombre;
	public int Daño;
	
	public Arma(String nombre, int indiceDaño) {
		this.nombre = nombre;
		this.Daño = indiceDaño;
	}

	public String getNombre() {
		return nombre;
	}

	public int getIndiceDaño() {
		return Daño;
	}

	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", Daño=" + Daño + "]";
	}
	
}
