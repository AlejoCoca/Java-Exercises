package paquete;

public class Arquero extends Personaje {
	
	protected int flechas;
	protected double alcanceLargo;
	protected int ataqueLargo;
	
	public Arquero(String nombre, Posicion posicion) {
		super(nombre , posicion);
		this.alcanceLargo=100;
		this.alcance=5;
		this.ataqueLargo=20;
		this.ataque=5;
		this.vitalidad=400;
		this.flechas = 20;
	}

	
	@Override
	public boolean ataca(Personaje adversario) {
		boolean respuesta=false;
		if(this.flechas>0 && this.distancia(adversario)<=this.alcanceLargo) {
			respuesta=true;
			adversario.recibeDanio(this.ataqueLargo);
			flechas--;
		}
		else
		{
			respuesta=super.ataca(adversario);
		}
		return respuesta;
	}
	
	public void conseguirFlechas(int cantidad) {
		this.flechas+=cantidad;
	}
	
	public int getFlechas() {
		return flechas;
	}


	@Override
	public String toString() {
		return "Arquero:"+super.toString()+" [flechas=" + flechas + ", alcanceLargo=" + alcanceLargo + ", ataqueLargo=" + ataqueLargo + "]";
	}


	
	
	
}
