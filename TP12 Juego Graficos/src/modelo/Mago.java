package modelo;

public class Mago extends Personaje {
	
	protected int mana;
	protected int ataqueLargo;
	
	public Mago(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.vitalidad = 300;
		this.alcance = 5;
		this.ataque = 3;
		this.ataqueLargo = 10;
		this.mana = 5000;
	}

	@Override
	public boolean ataca(Personaje adversario) {
		boolean respuesta=false;
		if(this.mana>500) {
			respuesta=true;
			adversario.recibeDanio(this.ataqueLargo);
			mana-=500;
		}
		else
		{
			respuesta=super.ataca(adversario);
		}
		return respuesta;
	}
	
	public boolean teletransporte(double x, double y){
		if(this.mana>2000) {
			this.setX(x);
			this.setY(y);
			return true;
		}
		else { return false; }
	}
	
	public boolean curar(Personaje objetivo){
		if(this.mana>1000) {
			objetivo.recibeCuracion(100);
			this.mana-=1000;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void cargarMana(int cantidad) {
		this.mana+=cantidad;
	}

	@Override
	public String toString() {
		return "Mago: "+super.toString()+" [mana=" + mana + ", ataqueLargo=" + ataqueLargo + "]";
	}
	
	
}
