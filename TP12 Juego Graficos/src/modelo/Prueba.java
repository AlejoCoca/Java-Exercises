package modelo;

public class Prueba {

	public static void main(String[] args) {
		
		Personaje guerrero= new Guerrero("Pepe", new Posicion(-20, 30));
		Personaje caballero= new Caballero("Arturo",new Posicion(0, 10));
		Personaje arquero= new Arquero("Juan", new Posicion(50, 50));
		Personaje mago= new Mago("Gandalf", new Posicion(100, 15));
		guerrero.ataca(caballero);
		arquero.ataca(mago);
		arquero.ataca(guerrero);
		mago.ataca(guerrero);
		System.out.println(guerrero);
		System.out.println(caballero);
		System.out.println(arquero);
		System.out.println(mago);

	}

}
