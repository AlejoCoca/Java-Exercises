package paquete;

import java.util.ArrayList;
import java.util.Iterator;

public class Equipo {
	public String nombre;
	public double añoDeCreacion;
	public ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	public Equipo(String nombre, double añoDeCreacion) {
		super();
		this.nombre = nombre;
		this.añoDeCreacion = añoDeCreacion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public double getAñoDeCreacion() {
		return añoDeCreacion;
	}

	public void agregarJugador(Jugador jugador) {
		this.jugadores.add(jugador);	
	}
	
	public void quitarJugador(Jugador jugador) {
		this.jugadores.remove(jugador);
	}
	
	public int getJugadores()	{
		return this.jugadores.size();
	}
	
	public double promedioEdad() {
		double suma=0;
		Iterator<Jugador> it = jugadores.iterator();
		while(it.hasNext()) {
			Jugador j = it.next();
			suma+=j.getEdad();
		}
		return (suma/this.jugadores.size());
	}
	
	public double getMayoresEdad() {
		double suma=0;
		Iterator<Jugador> it = jugadores.iterator();
		while(it.hasNext()) {
			Jugador j=it.next();
			if(j.getEdad()>18) {
				suma++;
			}
		}
		return((suma/this.jugadores.size())*100);
	}
	
	public double getMenoresEdad() {
		return(100-this.getMayoresEdad());
	}
	
	public double getEfectividad() {
		double suma=0;
		Iterator<Jugador> it = jugadores.iterator();
		while(it.hasNext()) {
			Jugador j = it.next();
			suma+=j.getDesempeño();
		}
		return (suma/this.jugadores.size());
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", añoDeCreacion=" + añoDeCreacion + ", jugadores=" + jugadores + "]";
	}
	
	
}
