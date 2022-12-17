package paquete;

public class Caballero extends Personaje {
	
	private int armadura=500;
	
	public Caballero(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.vitalidad = 800;
		this.alcance = 5;
		this.ataque = 15;
		this.armadura = 500;
	}

	
	public int getArmadura() {
		return armadura;
	}
	
	@Override
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
		return "Caballero"+super.toString()+" [armadura=" + armadura + "]";
	}

	
	
}
