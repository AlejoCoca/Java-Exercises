package programa3;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		
		Guerrero guerrero1 = new Guerrero();
		System.out.println("Escriba el nombre del guerrero");
		guerrero1.setNombre(teclado.nextLine());
		System.out.println("Escriba la vitalidad del guerrero");
		guerrero1.setVitalidad(teclado.nextDouble());
		System.out.println("Escriba la armadura del guerrero");
		guerrero1.setArmadura(teclado.nextDouble());
		System.out.println("Escriba donde quiere empezar en el eje X");
		guerrero1.setX(teclado.nextDouble());
		System.out.println("Escriba donde quiere empezar en el eje Y");
		guerrero1.setY(teclado.nextDouble());
		do {
			System.out.println("El guerrero "+guerrero1.getNombre()+" tiene "+guerrero1.getVitalidad()+" de vitalidad y "+guerrero1.getArmadura()+" de armadura");
			System.out.println("Se encuentra en las cordenadas "+guerrero1.getX()+" en el eje X y "+guerrero1.getY()+" en el eje Y");
			System.out.println("Escriba hacia donde quiere moverse primero en el eje X y despues en el eje Y");
			guerrero1.mover(teclado.nextDouble(),teclado.nextDouble());
			if(guerrero1.getX()==13 && guerrero1.getY()==12 || guerrero1.getX()==9 && guerrero1.getY()==10)
			{
				System.out.println("Caiste en una trampa, sufriste 500 de daño");
				guerrero1.recibirDaño(500);
			}
			else if(guerrero1.getX()>15 && guerrero1.getY()>15)
			{
				System.out.println("Estas en una zona llena de monstruos, perdes 200 de vida");
				guerrero1.recibirDaño(200);
			}
			
		}while(guerrero1.getVitalidad()>0);
		System.out.println("Fin del juego");
	}

}