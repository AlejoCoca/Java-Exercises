package paquete;

public class Arquero {
	private String nombre;
	private int vitalidad=400;
	private int flechas=20;
	private Posicion posicion;
	private int dañoAtaque=20;
	private int dañoAtaqueCorto=5;
	private double alcanceAtaque=100;
	private double alcanceAtaqueCorto=5;
	
	public Arquero(String nombre, Posicion posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
	}
	
	public Arquero(String nombre, double x, double y) {
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
		if(this.flechas>0 && this.distancia(adversario)<=this.alcanceAtaque) {
			respuesta=true;
			adversario.recibeDanio(this.dañoAtaque);
			flechas--;
		}
		else if(this.distancia(adversario)<=this.alcanceAtaqueCorto) {
			respuesta=true;
			adversario.recibeDanio(this.dañoAtaqueCorto);
		}
		return respuesta;
	}
	public boolean ataca(Caballero adversario) {
		boolean respuesta=false;
		if(this.flechas>0 && this.distancia(adversario)<=this.alcanceAtaque) {
			respuesta=true;
			adversario.recibeDanio(this.dañoAtaque);
			flechas--;
		}
		else if(this.distancia(adversario)<=this.alcanceAtaqueCorto) {
			respuesta=true;
			adversario.recibeDanio(this.dañoAtaqueCorto);
		}
		return respuesta;
	}
	
	public boolean ataca(Arquero adversario) {
		boolean respuesta=false;
		if(this.flechas>0 && this.distancia(adversario)<=this.alcanceAtaque) {
			respuesta=true;
			adversario.recibeDanio(this.dañoAtaque);
			flechas--;
		}
		else if(this.distancia(adversario)<=this.alcanceAtaqueCorto) {
			respuesta=true;
			adversario.recibeDanio(this.dañoAtaqueCorto);
		}
		return respuesta;
	}
	
	public void recibeDanio(int cantidad) {
		this.vitalidad-=cantidad;
	}
	
	public void conseguirFlechas(int cantidad) {
		this.flechas+=cantidad;
	}

	@Override
	public String toString() {
		return "Arquero [nombre=" + nombre + ", vitalidad=" + vitalidad + ", flechas=" + flechas + ", posicion="
				+ posicion + ", dañoAtaque=" + dañoAtaque + ", dañoAtaqueCorto=" + dañoAtaqueCorto + ", alcanceAtaque="
				+ alcanceAtaque + ", alcanceAtaqueCorto=" + alcanceAtaqueCorto + "]";
	}

	
	
}
