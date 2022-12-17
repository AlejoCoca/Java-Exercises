package prueba;
import modelo.IPersonaje;
import modelo.PersonajeFactory;

public class Prueba
{

	public static void main(String[] args)
	{
		IPersonaje personaje1 = PersonajeFactory.getPersonaje("MAGO", "AIRE", "Gandalf");
		IPersonaje personaje2 = PersonajeFactory.getPersonaje("HECHICERA", "FUEGO", "Melisandre");
		IPersonaje personaje3 = PersonajeFactory.getPersonaje("DRAGON", "TIERRA", "Rhaegal");
		
		
		System.out.println(personaje1);
		System.out.println(personaje2);
		System.out.println(personaje3);
		
		
		System.out.println("Armadura Personaje1: "+personaje1.getArmadura());
		System.out.println("Ataque Corto Personaje2: "+personaje2.getAtaqueCorto());
		System.out.println("Ataque a distancia Personaje3: "+personaje3.getAtaqueDistante());
	}

}
