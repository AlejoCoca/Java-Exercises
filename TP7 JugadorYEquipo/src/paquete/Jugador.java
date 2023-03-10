package paquete;

public class Jugador {
	public String nombre;
	public double edad;
	public String posicion;
	public double desempeņo;
	
	public Jugador(String nombre, double edad, String posicion, int desempeņo) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		this.desempeņo = desempeņo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public double getDesempeņo() {
		return desempeņo;
	}

	public void setDesempeņo(int desempeņo) {
		this.desempeņo = desempeņo;
	}

	public double getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", posicion=" + posicion + ", desempeņo=" + desempeņo
				+ "]";
	}
	
}
