package Main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Scanner teclado=new Scanner(System.in);
		Motor m1 = new Motor("rb36",2569,"nafta");
		Chasis c1 = new Chasis("R34 NISMO-Z-Tune",300);
		Automovil auto1 = new Automovil("Nissan Skyline",1993,m1,c1);
		auto1.setPrecio(50000);
		System.out.println(auto1);
	}
	
}
