package trabajoJava;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner teclado=new Scanner(System.in);
		Guerrero jugador1=new Guerrero();
		Guerrero jugador2=new Guerrero();
		
		String cadena=teclado.nextLine();
		
		while(jugador1.sigueVivo()&&jugador2.sigueVivo())
		{
			
		}
	}
}
