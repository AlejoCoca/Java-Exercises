import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class Probar {

	public static BD baseDatos;
	public static void main(String[] args) {
		try {
			baseDatos = new BD();
		}
		catch(SQLException e) {
			System.out.println("no se pudo inicializar");
		}
		
		
		
		
		
		
		
		
		/* probar subir nuevo contacto
		Contacto c = new Contacto("rajoy");
		c.setTelefono("2234323112");
		c.setFecha(new GregorianCalendar(1996, 5, 4));
		
		try {
			baseDatos.conectar("jdbc:mysql://localhost:3306/ejemplo contactos", "root", "");
			baseDatos.almacenarContacto(c);
			System.out.println("se guardo correctamente");
			System.out.println(c);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}*/
		
		
		
		
		/*  probar bajar todos los contactos
		Iterator<Contacto> it = null;
		try {
			baseDatos.conectar("jdbc:mysql://localhost:3306/ejemplo contactos", "root", "");
			it = baseDatos.recuperarPersonas();
			baseDatos.desconectar();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		while(it.hasNext()) {
			Contacto c = it.next();
			System.out.println(c);
		}*/
		
		
		
		
		/* probar bajar un contacto particular
		Contacto c = null;
		try {
			baseDatos.conectar("jdbc:mysql://localhost:3306/ejemplo contactos", "root", "");
			c = baseDatos.recuperarPersona("rajoy");
			baseDatos.desconectar();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(c);
		*/
		
		
	}

}
