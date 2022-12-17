package paquete;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		Guerrero guerrero1 = new Guerrero();
		Guerrero guerrero2 = new Guerrero("Pepe");
		Guerrero guerrero3 = new Guerrero("Pepe",5.0,-2.2);
		System.out.println(guerrero1);
		System.out.println(guerrero2);
		System.out.println(guerrero3);

	}

}
