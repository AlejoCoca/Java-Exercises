package main;

public class Guerrero extends Personaje {
	 
	public Guerrero(String nombre,Movible movible) {
		super(nombre, movible);
		this.distanciaMaximaDeDesplazamiento=5;
		this.vitalidad = 500; 
		this.danioDeAtaque = 10;	
		this.distanciaDeAtaque = 10;
 
	}
 
	@Override
	public void recibirMaldicion() { 
		this.vitalidad-= (this.vitalidad/100)*50;
	}

	@Override
	public void recibirBendicion() { 
		this.vitalidad+= (this.vitalidad/100)*25;
	}
	
}
