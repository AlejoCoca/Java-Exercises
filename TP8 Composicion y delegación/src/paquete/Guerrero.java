package paquete;

public class Guerrero {
	public String nombre;
	public int indiceDa�o;
	public int resistencia;
	Armadura armadura;
	Arma arma;
	Posicion posicion;
	
	public Guerrero(String nombre, int indiceDa�o, int resistencia, Armadura armadura, Arma arma, Posicion posicion) {
		this.nombre = nombre;
		this.indiceDa�o = indiceDa�o;
		this.resistencia = resistencia;
		this.armadura = armadura;
		this.arma = arma;
		this.posicion = posicion;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public int getIndiceDa�o() {
		if(this.arma!=null) {
			return this.indiceDa�o+this.arma.getIndiceDa�o();
		}
		else {
			return this.indiceDa�o;
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
		return "Guerrero [nombre=" + nombre + ", indiceDa�o=" + indiceDa�o + ", resistencia=" + resistencia
				+ ", armadura=" + armadura + ", arma=" + arma + ", posicion=" + posicion + "]";
	}
	
}
