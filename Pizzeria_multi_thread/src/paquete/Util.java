package paquete;

import java.util.Random;

public class Util {
	private static Random r=new Random();

	public static void espera() 
	{
		int cant=r.nextInt(1000)+50;
		try {
			Thread.sleep(cant);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
}
