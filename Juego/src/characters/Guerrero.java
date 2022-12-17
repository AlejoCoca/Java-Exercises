package characters;

import utilities.Posicion;

public class Guerrero extends Personaje{
 
	public Guerrero(String nombre, Posicion posicion) {
		super(nombre,posicion);this.vitalidad = 500;
		this.danioDeAtaque = 10;	
		this.distanciaDeAtaque = 10;
	}
	
	
}
