package paquete;

public class Prueba {

	public static void main(String[] args) {
		
		Delantero j1 = new Delantero("Alejo",0.8,0.5);
		Delantero j2 = new Delantero("Juan",0.5,0.2);
		Defensor j3 = new Defensor("Jose",0.5,0.9);
		Defensor j4 = new Defensor("Toledo",0.5,0.7);
		
		Equipo e1 = new Equipo("chacarita");
		e1.agregarJugador(j1);
		e1.agregarJugador(j2);
		e1.agregarJugador(j3);
		e1.agregarJugador(j4);
		System.out.println(e1.getJugadores());
		
		 
		System.out.println("Indice de defensa: " + e1.indiceDefensa());
		  
	}

}
