package paquete;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int eleccion;
		
		CuentaBancaria cuenta1 = new CuentaBancaria("Alejo");
		
		System.out.println(cuenta1);
		
		System.out.println("Bienvenido "+cuenta1.getTitular()+" a tu cuenta bancaria.");
		do {
			System.out.println("Presiona '1' para realizar consultar el saldo de la cuenta. Presiona '2' para realizar un deposito");
			System.out.println("Presiona '3' para realizar una extraccion. Presiona '4' para consultar la cantidad de depositos realizados.");
			System.out.println("Presiona '5' para consultar la cantidad de extracciones realizadas. Presiona '6' para salir.");
			eleccion=(teclado.nextInt());
			switch(eleccion)
			{
			case 1:{
				System.out.println("Tu saldo es de "+cuenta1.getSaldo());
			}break;
			case 2:{
				System.out.println("Ingrese la cantidad a depositar");
				cuenta1.depositar(teclado.nextInt());
				System.out.println("Su saldo ahora es de "+cuenta1.getSaldo());
			}break;
			case 3:{
				System.out.println("Ingrese la cantidad a extraer");
				if(cuenta1.extraer(teclado.nextInt()))
				{
					System.out.println("La extraccion se realizo con exito");
					System.out.println("Su saldo ahora es de "+cuenta1.getSaldo());
				}
				else
				{
					System.out.println("Error. Fondos insuficientes");
				}
			}break;
			case 4:{
				System.out.println("La cantidad de depositos realizados es de "+cuenta1.getCantidadDepositos());
			}break;
			case 5:{
				System.out.println("La cantidad de extracciones realizadas es de "+cuenta1.getCantidadExtracciones());
			}
			}
		}while(eleccion!=6);
		
	}

}

