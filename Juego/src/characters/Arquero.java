package characters;

import utilities.Posicion;

public class Arquero extends Personaje {
	protected int cantidadFlechas;
	protected double alcanceAtaqueLargo;
	protected int danioAtaqueLargo;
 public Arquero(String nombre, Posicion posicion) {
	 super(nombre,posicion);
	 this.vitalidad = 400;
	 this.danioDeAtaque = 5;
	 this.alcanceAtaqueLargo = 100;
	 this.danioAtaqueLargo = 20;
	 this.cantidadFlechas = 20;
	 
 }
@Override
public boolean ataca(Personaje adversario) {
	 
	boolean respuesta = false;
	
	if(this.cantidadFlechas>0) {
		if(this.distancia(adversario)<=this.alcanceAtaqueLargo) {
			adversario.recibeDanio(this.danioAtaqueLargo);
			this.cantidadFlechas--;
			respuesta = true;
		}else {
		respuesta = super.ataca(adversario);
		}
		}
	return respuesta;
	}

}
