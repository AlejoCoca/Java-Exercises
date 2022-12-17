package main;

public class AccionPersonajeException extends Exception {
	private Personaje personaje;
	public AccionPersonajeException(String mensaje,Personaje personaje) {
		super(mensaje); 
		this.personaje =personaje;
	} 
}
