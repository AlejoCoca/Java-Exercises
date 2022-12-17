package tp2;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner teclado=new Scanner(System.in);
		
		String nombre, apellido;
		System.out.println("Ingrese su nombre");
		nombre=teclado.nextLine();
		System.out.println("Ingrese su apellido");
		apellido=teclado.nextLine();
		
		circulo circulo1 = new circulo();
		circulo circulo2 = new circulo();
		circulo1.setNombre(nombre.charAt(0));
		circulo2.setNombre(apellido.charAt(0));
		System.out.println("Ingrese el diametro del circulo "+circulo1.getNombre()+"\n");
		circulo1.setDiametro(teclado.nextDouble());
		System.out.println("Ingrese el diametro del circulo "+circulo2.getNombre()+"\n");
		circulo2.setDiametro(teclado.nextDouble());
		
		System.out.println("Los datos del circulo "+circulo1.getNombre()+" son :\n");
		System.out.println("Diametro: "+circulo1.getDiametro()+"\n");
		System.out.println("Superficie: "+circulo1.getSuperficie()+"\n");
		System.out.println("Perimetro: "+circulo1.getPerimetro()+"\n");
		System.out.println("Los datos del circulo "+circulo2.getNombre()+" son :\n");
		System.out.println("Diametro: "+circulo2.getDiametro()+"\n");
		System.out.println("Superficie: "+circulo2.getSuperficie()+"\n");
		System.out.println("Perimetro: "+circulo2.getPerimetro()+"\n");
		
		if(circulo1.getDiametro()>circulo2.getDiametro()) {
			System.out.println("El mayor de los dos circulos es el circulo "+circulo1.getNombre()+"\n");
		}
		else {
			System.out.println("El mayor de los dos circulos es el circulo "+circulo2.getNombre()+"\n");
		}
	}

}
