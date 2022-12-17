package main;

public class Arquero extends Personaje {
	protected int cantidadFlechas;
	protected double alcanceAtaqueLargo;
	protected int danioAtaqueLargo;

	public Arquero(String nombre, Movible movible) {
		super(nombre, movible);
		this.distanciaMaximaDeDesplazamiento = 8;
		this.vitalidad = 400;
		this.danioDeAtaque = 5;
		this.alcanceAtaqueLargo = 100;
		this.danioAtaqueLargo = 20;
		this.cantidadFlechas = 20;
	}

	@Override
	public void recibirMaldicion() {
		this.cantidadFlechas=0;
	}

	@Override
	public void recibirBendicion() {
		this.cantidadFlechas+=5;
	}

}
