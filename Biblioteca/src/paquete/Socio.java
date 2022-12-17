package paquete;

import java.util.ArrayList;

public class Socio {
	private String nombre;
	private int numeroSocio;
	private ArrayList<Libro> lista = new ArrayList<Libro>();
	
	public Socio(String nombre, int numeroSocio) {
		super();
		this.nombre = nombre;
		this.numeroSocio = numeroSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumeroSocio() {
		return numeroSocio;
	}

	public ArrayList<Libro> getLista() {
		return lista;
	}
	
	public void añadirLibro(Libro libro) {
		this.lista.add(libro);
	}
	
	public Libro eliminarLibro(Libro libro){
		this.lista.remove(libro); 
		return libro;
	}
	
	public String listarLibros() {
		return "Libros que tiene "+nombre+": "+lista;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", numeroSocio=" + numeroSocio + ", lista=" + lista + "]";
	}
	
	
}
