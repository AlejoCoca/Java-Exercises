package paquete;

public class Jugador {
	public String nombre;
	public double edad;
	public String posicion;
	public double desempe�o;
	
	public Jugador(String nombre, double edad, String posicion, int desempe�o) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		this.desempe�o = desempe�o;
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

	public double getDesempe�o() {
		return desempe�o;
	}

	public void setDesempe�o(int desempe�o) {
		this.desempe�o = desempe�o;
	}

	public double getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", posicion=" + posicion + ", desempe�o=" + desempe�o
				+ "]";
	}
	
}
