package paquete;

public class Arma {
	public String nombre;
	public int Da�o;
	
	public Arma(String nombre, int indiceDa�o) {
		this.nombre = nombre;
		this.Da�o = indiceDa�o;
	}

	public String getNombre() {
		return nombre;
	}

	public int getIndiceDa�o() {
		return Da�o;
	}

	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", Da�o=" + Da�o + "]";
	}
	
}
