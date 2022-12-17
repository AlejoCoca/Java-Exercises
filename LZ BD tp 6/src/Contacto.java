import java.sql.Date;
import java.util.GregorianCalendar;

public class Contacto {
	private String nombre;
	private String telefono;
	private GregorianCalendar fecha;
	
	public Contacto(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha=fecha;
	}
	
	public String toString() {
		return nombre+", "+telefono;
	}
}
