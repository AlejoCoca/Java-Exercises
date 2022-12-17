package main;

public abstract class Personaje implements Hechizable, Movible {
	protected String nombre;
	protected int vitalidad;
	protected Movible movible;
	protected int danioDeAtaque;
	protected double distanciaDeAtaque;
	protected double distanciaMaximaDeDesplazamiento;

	public Personaje(String nombre, Movible movible) {
		this.nombre = nombre;
		this.movible = movible;
	}

	public double getPositionX() {
		return movible.getPositionX();
	}

	public double getPositionY() {
		return movible.getPositionY();
	}

	public void recibeDanio(int cantidad) {
		this.vitalidad -= cantidad;
	}

	public void ataca(Personaje adversario)throws AtaqueImposibleException { 
		if (this.distancia(adversario.movible) <= this.distanciaDeAtaque) { 
			adversario.recibeDanio(this.danioDeAtaque);
		}else throw new AtaqueImposibleException("No fue posible atacar",this,adversario);
	}

	public void incrementarPos(double incX, double incY) throws IncrementoImposibleException {

		if (incX > distanciaMaximaDeDesplazamiento)
			throw new IncrementoImposibleException("Imposible moverse", this, distanciaMaximaDeDesplazamiento, incX);
		else if (incY > distanciaMaximaDeDesplazamiento)
			throw new IncrementoImposibleException("Imposible moverse", this, distanciaMaximaDeDesplazamiento, incY);
		else
			movible.incrementarPos(incX, incY);
	}

	public double distancia(Movible otro) {

		return movible.distancia(otro);
	}

}
