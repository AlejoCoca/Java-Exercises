package paquete;

public class Personajes extends Unidad implements IHostil, IPosicionable, IMovible{
	public void atacar(Unidad adversario) {
	}
	public int getX() {
		return 0;
	}
	public int getY() {
		return 0;
	}
	public void mover(int x, int y) {
		
	}
	public void setEquipo(String equipo) {
		super.setEquipo(equipo);
		equipo = "personaje";
	}
	public void setCosto(int costo) {
		super.setCosto(costo);
		costo = 40;
	}
	public void setEnergia(int energia) {
		super.setCosto(energia);
		energia = 100;
	}
	public void recibeDano(int cantidad) {
	}
	public Personajes(String equipo, int costo, int energia) {
		super(equipo, costo, energia);
	}
}
