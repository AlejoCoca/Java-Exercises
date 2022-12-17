package paquete;

public class Guerrero {
	public String nombre;
	public int indiceDaño;
	public int resistencia;
	Armadura armadura;
	Arma arma;
	Posicion posicion;
	
	public Guerrero(String nombre, int indiceDaño, int resistencia, Armadura armadura, Arma arma, Posicion posicion) {
		this.nombre = nombre;
		this.indiceDaño = indiceDaño;
		this.resistencia = resistencia;
		this.armadura = armadura;
		this.arma = arma;
		this.posicion = posicion;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public int getIndiceDaño() {
		if(this.arma!=null) {
			return this.indiceDaño+this.arma.getIndiceDaño();
		}
		else {
			return this.indiceDaño;
		}
	}
	
	public int getResistencia() {
		if(this.armadura!=null) {
			return this.resistencia+this.armadura.getResistencia();
		}
		else {
			return this.resistencia;
		}
	}
	
	public double calcularDistancia(int x, int y) {
		return this.posicion.calcularDistancia(x, y);
	}
	
	public void moverse(int x, int y) {
		this.posicion.moverse(x, y);
	}

	@Override
	public String toString() {
		return "Guerrero [nombre=" + nombre + ", indiceDaño=" + indiceDaño + ", resistencia=" + resistencia
				+ ", armadura=" + armadura + ", arma=" + arma + ", posicion=" + posicion + "]";
	}
	
}
