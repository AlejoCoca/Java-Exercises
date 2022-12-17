package paquete;

import java.util.ArrayList;

public class Biblioteca {
	private String nombre;
	private String direccion;
	private ArrayList<Libro> libros = new ArrayList<Libro>();
	private ArrayList<Libro> librosPrestados = new ArrayList<Libro>();
	private ArrayList<Socio> socios = new ArrayList<Socio>();
	private static Biblioteca instance=null;
	
	
	public static Biblioteca getInstance(String nombre, String direccion) {
		if(instance==null) {
			instance = new Biblioteca(nombre, direccion);
		}
		return instance;
	}
	
	private Biblioteca(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void agregarLibro(Libro libro) {
		this.libros.add(libro);
	}
	
	public void eliminarLibro(Libro libro) {
		this.libros.remove(libro);
	}
	
	public void prestarLibro(Libro libro, Socio socio) {
		if(this.socios.contains(socio)&&this.libros.contains(libro)) {
			socio.añadirLibro(libro);
			this.librosPrestados.add(libro);
			this.libros.remove(libro);
		}
	}
	
	public void recibirLibro(Libro libro, Socio socio) {
		if(this.socios.contains(socio)&&this.librosPrestados.contains(libro)) {
			socio.eliminarLibro(libro);
			this.librosPrestados.remove(libro);
			this.libros.add(libro);
		}
	}
	
	public void añadirSocio(Socio socio) {
		this.socios.add(socio);
	}
	
	public void eliminarSocio(Socio socio) {
		this.socios.remove(socio);
	}

	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + ", libros=" + libros + ", librosPrestados="
				+ librosPrestados + ", socios=" + socios + "]";
	}
}
