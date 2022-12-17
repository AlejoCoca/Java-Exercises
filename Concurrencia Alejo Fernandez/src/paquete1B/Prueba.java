package paquete1B;

public class Prueba {
	public static void main(String[] args) {
		
		Hilo3 hilo3=new Hilo3();
		Hilo2 hilo2=new Hilo2();
		Hilo1 hilo1=new Hilo1();
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
	}
}
