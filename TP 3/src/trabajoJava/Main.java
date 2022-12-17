package trabajoJava;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		Guerrero guerrero1=new Guerrero();
		Guerrero guerrero2=new Guerrero();
		System.out.println("Escriba el nombre del primer guerrero");
		guerrero1.setNombre(teclado.nextLine());
		System.out.println("Escriba el nombre del segundo guerrero");
		guerrero2.setNombre(teclado.nextLine());
		System.out.println("Escriba el ataque de "+guerrero1.getNombre());
		guerrero1.setAtaque(teclado.nextInt());
		System.out.println("Escriba la defensa de "+guerrero1.getNombre());
		guerrero1.setDefensa(teclado.nextInt());
		System.out.println("Escriba el ataque de "+guerrero2.getNombre());
		guerrero2.setAtaque(teclado.nextInt());
		System.out.println("Escriba la defensa de "+guerrero2.getNombre());
		guerrero2.setDefensa(teclado.nextInt());
		
		while(1==1)
		{
			System.out.println("Es el turno de "+guerrero1.getNombre()+". Primero elija donde atacar");
			System.out.println("Presione '1' para atacar a la cabeza (vida "+guerrero2.getCabeza()+"/30) (-30% de precision) - Presione '2' para atacar a el torso (vida "+guerrero2.getTorso()+"/100)");
			System.out.println("Presione '3' para atacar a el Brazo izquierdo (vida "+guerrero2.getBrazoIzq()+"/35) (-15% de precision) - Presione '4' para atacar a el Brazo derecho (vida "+guerrero2.getBrazoDer()+"/35) (-15% de precision)");
			System.out.println("Presione '5' para atacar a la Pierna izquierda (vida "+guerrero2.getPiernaIzq()+"/35) (-15% de precision) - Presione '6' para atacar a la Pierna derecha (vida "+guerrero2.getPiernaDer()+"/35) (-15% de precision)");
			System.out.println("Despues elija con que fuerza atacar");
			System.out.println("Presione '1' para un golpe pesado (60% de presicion, +30% de daño) - Presione '2' para un golpe normal (75% de presicion, daño normal) - Presione '4' para un golpe pesado (95% de presicion, -30% de daño)");
			guerrero2.recivirAtaque(teclado.nextInt(), teclado.nextInt(), guerrero1.atacar());
			if(!guerrero2.sigueVivo())
			{
				System.out.println("Gano "+guerrero1.getNombre());
				break;
			}
			System.out.println("Es el turno de "+guerrero2.getNombre()+". Primero elija donde atacar");
			System.out.println("Presione '1' para atacar a la cabeza (vida "+guerrero1.getCabeza()+"/30) (-30% de precision) - Presione '2' para atacar a el torso (vida "+guerrero1.getTorso()+"/100)");
			System.out.println("Presione '3' para atacar a el Brazo izquierdo (vida "+guerrero1.getBrazoIzq()+"/35) (-15% de precision) - Presione '4' para atacar a el Brazo derecho (vida "+guerrero1.getBrazoDer()+"/35) (-15% de precision)");
			System.out.println("Presione '5' para atacar a la Pierna izquierda (vida "+guerrero1.getPiernaIzq()+"/35) (-15% de precision) - Presione '6' para atacar a la Pierna derecha (vida "+guerrero1.getPiernaDer()+"/35) (-15% de precision)");
			System.out.println("Despues elija con que fuerza atacar");
			System.out.println("Presione '1' para un golpe pesado (60% de presicion, +30% de daño) - Presione '2' para un golpe normal (75% de presicion, daño normal) - Presione '4' para un golpe pesado (95% de presicion, -30% de daño)");
			guerrero1.recivirAtaque(teclado.nextInt(), teclado.nextInt(), guerrero2.atacar());
			if(!guerrero1.sigueVivo())
			{
				System.out.println("Gano "+guerrero2.getNombre());
				break;
			}
		}
	}
}
