import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;


public class BD {
	
	private Connection conexion;
	
	
	
	public BD() throws SQLException {
		System.out.println("iniciando programa.");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			System.out.println("no se pudo cargar");
			return;
		}
	}
	
	
	
	
	public void conectar(String direccion, String usuario, String contrasena) throws SQLException {
		
		this.conexion = DriverManager.getConnection(direccion,usuario,contrasena);
	}
	
	
	
	
	public void almacenarContacto(Contacto contacto) throws SQLException {
		String nombre = contacto.getNombre();
		String telefono = contacto.getTelefono();
		Date fecha = new
	
		Date(contacto.getFecha().getTimeInMillis());
		PreparedStatement agregar = this.conexion.prepareStatement("INSERT INTO contactos (nombre,telefono,fecha_de_nacimiento) VALUES (?,?,?)");
	
		agregar.setString(1, nombre);
		agregar.setString(2, telefono);
		agregar.setDate(3, fecha);
		agregar.executeUpdate();
	}
	
	
	
	public Iterator<Contacto> recuperarPersonas() throws SQLException {
		
		ArrayList<Contacto> arrayContactos = new ArrayList<Contacto>();

		String nombre, telefono;
		GregorianCalendar fecha;

		
		Statement sentencia;
		sentencia = conexion.createStatement();
		
		ResultSet resultado = sentencia.executeQuery("SELECT * FROM contactos ORDER BY nombre");
		
		while (resultado.next())
		{
			fecha = new GregorianCalendar();
			
			nombre = resultado.getString("nombre");
			telefono = resultado.getString("telefono");
			fecha.setTime(resultado.getDate("fecha_de_nacimiento"));
			
			Contacto p = new Contacto(nombre);
			p.setTelefono(telefono);
			p.setFecha(fecha);
			arrayContactos.add(p);
		}
		return arrayContactos.iterator();
	}
	
	
	public Contacto recuperarPersona(String x) throws SQLException {
		Statement sentencia;
		sentencia = conexion.createStatement();
		ResultSet resultado = sentencia.executeQuery("SELECT * FROM `contactos` WHERE nombre='"+x+"';");
		resultado.next();
		
		String nombre = resultado.getString("nombre"), telefono = resultado.getString("telefono");
		GregorianCalendar fecha = new GregorianCalendar();
		fecha.setTime(resultado.getDate("fecha_de_nacimiento"));;
		
		Contacto c = new Contacto(nombre);
		c.setTelefono(telefono);
		c.setFecha(fecha);

		return c;
	}
	
	public void desconectar() throws SQLException {
		this.conexion.close();
	}
}
