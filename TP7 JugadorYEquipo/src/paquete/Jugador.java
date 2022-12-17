package paquete;

public class Jugador {
	public String nombre;
	public double edad;
	public String posicion;
	public double desempeño;
	
	public Jugador(String nombre, double edad, String posicion, int desempeño) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		this.desempeño = desempeño;
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

	public double getDesempeño() {
		return desempeño;
	}

	public void setDesempeño(int desempeño) {
		this.desempeño = desempeño;
	}

	public double getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", posicion=" + posicion + ", desempeño=" + desempeño
				+ "]";
	}
	
}
