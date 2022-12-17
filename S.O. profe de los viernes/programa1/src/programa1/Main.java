package programa1;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		char letra;
		
		Persona persona1 = new Persona();
		System.out.println("Escriba su nombre");
		persona1.setNombre(teclado.nextLine());
		System.out.println(persona1.getNombre()+" ahora escribi tu Email");
		persona1.setEmail(teclado.nextLine());
		System.out.println("Escribi tu edad");
		persona1.setEdad(teclado.nextInt());
		System.out.println("Te llamas "+persona1.getNombre()+" tenes "+persona1.getEdad()+" y tu email es "+persona1.getEmail());
		if(persona1.sosMayor())
		{
			System.out.println("Sos mayor de edad");
		}
		else
		{
			System.out.println("Sos menor de edad");
		}
		System.out.println("Escribe una letra para averiguar cuantas veces se repite en tu nombre");
		letra=teclado.next().charAt(0);
		System.out.println("La letra "+letra+" aparece "+persona1.repeticionesDeLetra(Character.toLowerCase(letra))+" veces en el nombre "+persona1.getNombre());
		
	}

}