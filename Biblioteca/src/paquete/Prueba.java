package paquete;

public class Prueba {

	public static void main(String[] args) {
		
		Biblioteca biblioteca = Biblioteca.getInstance("biblioteca1", "JuanbJusto");
		Libro libro1 = new Libro("Don Quijote");
		Libro libro2 = new Libro("El arte de la guerra");
		Libro libro3 = new Libro("El principe");
		Socio socio1 = new Socio("Alejo",123);
		Socio socio2 = new Socio("Chicho",223);
		Socio socio3 = new Socio("Marco",321);
		
		libro1.setAnio(1600);
		libro2.setAnio(300);
		libro3.setAnio(1700);
		libro1.setAutor("Cerbantes");
		libro2.setAutor("Sun Tzu");
		libro3.setAutor("Nicolas Maquiavelo");
		libro1.setEditorial("no lo se");
		libro1.setEditorial("ninguna");
		libro1.setEditorial("no se");
		
		
		
		
		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro2);
		biblioteca.agregarLibro(libro3);
		biblioteca.añadirSocio(socio1);
		biblioteca.añadirSocio(socio2);
		biblioteca.añadirSocio(socio3);
		System.out.println(biblioteca);
		biblioteca.prestarLibro(libro1, socio1);
		biblioteca.prestarLibro(libro2, socio1);
		biblioteca.prestarLibro(libro3, socio3);
		System.out.println(biblioteca);
		System.out.println(socio1.listarLibros());
		System.out.println(socio2.listarLibros());
		System.out.println(socio3.listarLibros());
		biblioteca.recibirLibro(libro1, socio2);
		System.out.println(socio1.listarLibros());
		
	}

}
