package paquete;

public class Personaje {
	protected String nombre;
	protected int vitalidad;
	protected Posicion posicion;
	protected int ataque;
	protected double alcance;
	
	

	public Personaje(String nombre, Posicion posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getVitalidad() {
		return vitalidad;
	}

	public Posicion getPosicion() {
		return posicion;
	}
	
	public double getX() {
		return this.posicion.getX();
	}
	
	public void setX(double x) {
		this.posicion.setX(x);
	}
	
	public double getY() {
		return this.posicion.getY();
	}
	
	public void setY(double y) {
		this.posicion.setY(y);
	}
	
	public double distancia(Personaje otro) {
		return this.posicion.distancia(otro.getPosicion());
	}
	
	public boolean ataca(Personaje adversario) {
		boolean respuesta=false;
		if(this.distancia(adversario)<=this.alcance) {
			respuesta=true;
			adversario.recibeDanio(this.ataque);
		}
		return respuesta;
	}
	
	public void recibeDanio(int cantidad) {
		this.vitalidad-=cantidad;
	}

	public void recibeCuracion(int cantidad) {
		this.vitalidad+=cantidad;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", vitalidad=" + vitalidad + ", posicion=" + posicion + ", ataque="
				+ ataque + ", alcance=" + alcance + "]";
	}
	
	

	
	
}
