
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;

import com.mysql.jdbc.Statement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BD {
	private Connection conexion;

	public BD() throws SQLException {
		System.out.println("Iniciando programa.");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("No se pudo cargar el puente JDBC-ODBC.");

			return;
		}
	}

	public void conectar(String direccion, String usuario, String contrasena) throws SQLException {
		this.conexion = DriverManager.getConnection(direccion, usuario, contrasena);
	}

	public void almacenarPersona(Persona persona) throws SQLException {
		String nombre = persona.getNombre();
		String telefono = persona.getTelefono();
		Date fecha = new Date(persona.getFecha().getTimeInMillis());
		PreparedStatement agregar = this.conexion
				.prepareStatement("INSERT INTO contactos(nombre,fecha_nacimiento,telefono) VALUES (?,?,?)");

		agregar.setString(1, nombre);
		agregar.setDate(2, fecha);
		agregar.setString(3, telefono);
		agregar.executeUpdate();
	}

	public Iterator<Persona> recuperarPersonas() throws SQLException {
		Statement sentencia;
		ArrayList<Persona> listado_personas = new ArrayList<Persona>();
		String domicilio, nombre, telefono;
		GregorianCalendar fecha;
		sentencia = (Statement) conexion.createStatement();
		ResultSet resultado = sentencia.executeQuery("SELECT * FROM contactos ORDER BY nombre");
		while (resultado.next()) {
			nombre = resultado.getString("nombre");
			fecha = new GregorianCalendar();
			fecha.setTime(resultado.getDate("fecha_nacimiento"));
			telefono = resultado.getString("telefono");
			Persona p = new Persona(nombre);
			p.setFecha(fecha);
			p.setTelefono(telefono);
			listado_personas.add(p);
		}
		return listado_personas.iterator();
	}
	public ArrayList<Persona> recuperarPersonasList() throws SQLException {
		Statement sentencia;
		ArrayList<Persona> listado_personas = new ArrayList<Persona>();
		String domicilio, nombre, telefono;
		GregorianCalendar fecha;
		sentencia = (Statement) conexion.createStatement();
		ResultSet resultado = sentencia.executeQuery("SELECT * FROM contactos ORDER BY nombre");
		while (resultado.next()) {
			nombre = resultado.getString("nombre");
			fecha = new GregorianCalendar();
			fecha.setTime(resultado.getDate("fecha_nacimiento"));
			telefono = resultado.getString("telefono");
			Persona p = new Persona(nombre);
			p.setFecha(fecha);
			p.setTelefono(telefono);
			listado_personas.add(p);
		}
		return listado_personas;
	}
	public void desconectar() throws SQLException {
		this.conexion.close();
	}
}