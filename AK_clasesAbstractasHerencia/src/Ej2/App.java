package Ej2;

public class App {

	public static void main(String[] args) {
		Auto a = new Auto(5.0);
		System.out.println(a.calcularAlquiler(10));
		Camion b = new Camion(5.0, new TrailerRefrigerado(200.0,35));
		System.out.println(b.calcularAlquiler(10));
	}

}
