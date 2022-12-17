import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona
{
	private String nombre;
	private GregorianCalendar fecha;
	private String telefono;
	public Persona(String nombre) { 
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public GregorianCalendar getFecha() {
		return fecha;
	}
	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}
	public String getTelefono() {
		return telefono;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fecha=" + fecha.get(Calendar.DAY_OF_MONTH) +"/"+ fecha.get(Calendar.MONTH) +"/"+ fecha.get(Calendar.YEAR)+ ", telefono=" + telefono + "]";
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	} 
}