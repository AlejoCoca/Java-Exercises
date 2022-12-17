package main;
import java.util.ArrayList;

public class Mapa {
	private ArrayList<Personaje> personajes = new ArrayList<Personaje>();
	public Mapa() {
		 personajes.add(new Arquero("Arquero1",new Posicion(0.0,0.0)));
		 personajes.add(new Caballero("Caballero1",new Posicion(0.0,0.0)));
		 personajes.add(new Guerrero("Guerrero1",new Posicion(0.0,0.0)));
	}
	public void mueve (Personaje personaje, double valorX, double valorY) throws IncrementoImposibleException{}
	public void ataca(Personaje atacante, Personaje atacado) throws AtaqueImposibleException{}
}
