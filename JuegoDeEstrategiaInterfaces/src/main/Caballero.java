package main;

public class Caballero extends Personaje {
	protected int armadura;
	public Caballero(String nombre,Movible movible) {
		super(nombre, movible);
		this.distanciaMaximaDeDesplazamiento = 10;
		this.vitalidad = 800;
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
	@Override
	public void recibirMaldicion() {
		this.armadura-=200;
	}

	@Override
	public void recibirBendicion() {
		this.armadura+=200;
	}

	 

}
