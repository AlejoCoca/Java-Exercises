package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Juego {
	private ArrayList<Personaje> personajes = new ArrayList<Personaje>();
	
	public void agregarPersonaje(Personaje p) 
	{
		this.personajes.add(p);
	}

	public Iterator<Personaje> getPersonaje() {
		return this.personajes.iterator();
	}
	
	public void eliminarPersonaje(Personaje p)
	{
		this.personajes.remove(p);
	}

	public Personaje enfrentar(Personaje p1, Personaje p2) 
	{
		Personaje ganador=null;
		while(p1.vitalidad>0 &&	 p2.vitalidad>0){
			p1.ataca(p2); 
			p2.ataca(p1);	
		}
		
		if(p1.vitalidad>=0){
			ganador= p1;
		}
		
		if(p2.vitalidad>=0){
			ganador= p2;
		}
		
		return ganador;
	}
	
}
