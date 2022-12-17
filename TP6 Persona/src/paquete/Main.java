package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Alejo");
		Persona persona3 = new Persona("Alejo", 18);
		Persona persona4 = new Persona("Alejo", "alejococa23@gmail.com", 18);
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
		System.out.println(persona4);
	}

}
