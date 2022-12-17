package paquete;

public class Caballero {
	private String nombre;
	private int vitalidad=800;
	private int armadura=500;
	private Posicion posicion;
	private int ataque=5;
	private double alcance=15;
	
	public Caballero(String nombre, Posicion posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
	}
	
	public Caballero(String nombre, double x, double y) {
		this.nombre = nombre;
		this.posicion = new Posicion(x, y);
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
	
	public double distancia(Guerrero otro) {
		return this.posicion.distancia(otro.getPosicion());
	}
	
	public double distancia(Caballero otro) {
		return this.posicion.distancia(otro.getPosicion());
	}
  	
	public double distancia(Arquero otro) {
		return this.posicion.distancia(otro.getPosicion());
	}
	
	public boolean ataca(Guerrero adversario) {
		boolean respuesta=false;
		if(this.distancia(adversario)<=this.alcance) {
			respuesta=true;
			adversario.recibeDanio(this.ataque);
		}
		return respuesta;
	}
	
	public boolean ataca(Caballero adversario) {
		boolean respuesta=false;
		if(this.distancia(adversario)<=this.alcance) {
			respuesta=true;
			adversario.recibeDanio(this.ataque);
		}
		return respuesta;
	}
	
	public boolean ataca(Arquero adversario) {
		boolean respuesta=false;
		if(this.distancia(adversario)<=this.alcance) {
			respuesta=true;
			adversario.recibeDanio(this.ataque);
		}
		return respuesta;
	}
	
	public int getArmadura() {
		return armadura;
	}

	public void recibeDanio(int cantidad) {
		if(armadura>0)
		{
			this.armadura-=cantidad;
		}
		else
		{
			this.vitalidad-=cantidad;
		}
	}

	@Override
	public String toString() {
		return "Caballero [nombre=" + nombre + ", vitalidad=" + vitalidad + ", armadura=" + armadura + ", posicion="
				+ posicion + ", ataque=" + ataque + ", alcance=" + alcance + "]";
	}

	
	
}
