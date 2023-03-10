package paquete;

public class Guerrero {
	public String nombre;
	public int indiceDaņo;
	public int resistencia;
	Armadura armadura;
	Arma arma;
	Posicion posicion;
	
	public Guerrero(String nombre, int indiceDaņo, int resistencia, Armadura armadura, Arma arma, Posicion posicion) {
		this.nombre = nombre;
		this.indiceDaņo = indiceDaņo;
		this.resistencia = resistencia;
		this.armadura = armadura;
		this.arma = arma;
		this.posicion = posicion;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public int getIndiceDaņo() {
		if(this.arma!=null) {
			return this.indiceDaņo+this.arma.getIndiceDaņo();
		}
		else {
			return this.indiceDaņo;
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
		return "Guerrero [nombre=" + nombre + ", indiceDaņo=" + indiceDaņo + ", resistencia=" + resistencia
				+ ", armadura=" + armadura + ", arma=" + arma + ", posicion=" + posicion + "]";
	}
	
}
