package characters;

import utilities.Posicion;

public class Caballero extends Personaje {
	
	protected int armadura;
	
	public Caballero(String nombre, Posicion posicion) {
		super(nombre,posicion);this.vitalidad = 800;
		this.danioDeAtaque = 15;	
		this.distanciaDeAtaque = 5;
		this.armadura = 500;
	}

	@Override
	public void recibeDanio(int cantidad) {
		 
		if(this.armadura >=cantidad)this.armadura-=cantidad;
		else {
			this.vitalidad -= cantidad-this.armadura;
			this.armadura = 0;
		}
			
		}
	
	 
}
