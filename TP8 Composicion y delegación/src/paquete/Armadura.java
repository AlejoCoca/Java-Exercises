package paquete;

public class Armadura {
	public String elemento;
	public int resistencia;
	
	public Armadura(String elemento, int resistencia) {
		this.elemento = elemento;
		this.resistencia = resistencia;
	}

	public String getElemento() {
		return elemento;
	}

	public int getResistencia() {
		return resistencia;
	}

	@Override
	public String toString() {
		return "Armadura [elemento=" + elemento + ", resistencia=" + resistencia + "]";
	}
	
}
