package paquete;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		//Scanner teclado=new Scanner(System.in);
		
		Armadura armaduraFuerte = new Armadura("Acero",6);
		Arma espada = new Arma("Espada de Hierro",8);
		Posicion posicion = new Posicion(0,0);
		Guerrero guerrero1 = new Guerrero("Pepe",10,5,armaduraFuerte,espada,posicion);
		
		System.out.println(guerrero1);
		System.out.println(guerrero1.getResistencia());
		System.out.println(guerrero1.getIndiceDaño());
		guerrero1.moverse(-5, 15);
		System.out.println(guerrero1.posicion);
		System.out.println(guerrero1.calcularDistancia(20, 20));
	}
	
}