package paquete;

public class Juego {

	public static void main(String[] args) {
		
		Caballero personaje3= new Caballero("Arturo", 0, -10);
		Guerrero personaje1= new Guerrero("Pepe", -20, 30);
		Arquero personaje2= new Arquero("Juan", 50, 50);
		personaje2.ataca(personaje1);
		personaje1.ataca(personaje3);
		System.out.println(personaje1);
		System.out.println(personaje2);
		System.out.println(personaje3);
		
	}

}
