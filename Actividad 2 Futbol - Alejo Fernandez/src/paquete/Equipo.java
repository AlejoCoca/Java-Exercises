package paquete;

import java.util.ArrayList;
public class Equipo {
	private  String nombre;
	private ArrayList<Jugador> jugadores = new ArrayList();
	private double indiceDefensa = 0.0;
	private double indiceAtaque = 0.0;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarJugador(Jugador jugador){
		this.jugadores.add(jugador);	
	}
	 
	 
	public void eliminarJugador(Jugador jugador) {
		this.jugadores.remove(jugador);
	}
	public ArrayList<Jugador> getJugadores(){
		return this.jugadores;
	}
	
	public double indiceDefensa() {
		 
		jugadores.forEach((jugador)->{
			 
			this.indiceDefensa += jugador.defensa();
		});
		 return this.indiceDefensa;
	}
	
	public double indiceAtaque() {
		jugadores.forEach((jugador)->{
			this.indiceAtaque += jugador.ataque();
		});
		 return this.indiceAtaque;
	}
	
	
}
