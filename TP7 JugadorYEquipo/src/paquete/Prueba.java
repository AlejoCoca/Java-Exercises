package paquete;

public class Prueba {

	public static void main(String[] args) {
		String[] nombres= {"Juan","Pepe","Pancho","Esteban","Roberto"};
		String[] posiciones= {"Delantero","Mediocampista","Defensor","Arquero"};
		Equipo equipo1 = new Equipo("Chacarita",1960);
		Equipo equipo2 = new Equipo("Barcelona",1940);
		for(int i=0;i<22;i++)
		{
			Jugador j = new Jugador (nombres[(int) (Math.random()*5)],(int) (Math.random()*10)+16,posiciones[(int) (Math.random()*4)],(int) (Math.random()*10)+1);
			if(Math.random()<0.5)
			{
				equipo1.agregarJugador(j);
			}
			else
			{
				equipo2.agregarJugador(j);
			}
		}
		System.out.println(equipo1);
		System.out.println(equipo2);
		System.out.println("Cantidad de jugadores de "+equipo1.getNombre()+" : "+equipo1.getJugadores());
		System.out.println("Cantidad de jugadores de "+equipo2.getNombre()+" : "+equipo2.getJugadores());
		
		System.out.println("Promedio de edad de "+equipo1.getNombre()+" : "+equipo1.promedioEdad());
		System.out.println("Promedio de edad de "+equipo2.getNombre()+" : "+equipo2.promedioEdad());
		
		System.out.println("Promedio de mayores de edad de "+equipo1.getNombre()+" : "+equipo1.getMayoresEdad());
		System.out.println("Promedio de mayores de edad de "+equipo2.getNombre()+" : "+equipo2.getMayoresEdad());
		
		System.out.println("Promedio de menores de edad de "+equipo1.getNombre()+" : "+equipo1.getMenoresEdad());
		System.out.println("Promedio de menores de edad de "+equipo2.getNombre()+" : "+equipo2.getMenoresEdad());
		
		System.out.println("Promedio de desempeño de "+equipo1.getNombre()+" : "+equipo1.getEfectividad());
		System.out.println("Promedio de desempeño de "+equipo2.getNombre()+" : "+equipo2.getEfectividad());
	}

}
