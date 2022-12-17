package main;

public class AtaqueImposibleException extends AccionPersonajeException {
	private Personaje personajeAtacado;
	private double distanciaMaximaSoportada;
	private double distanciaRealEntrePersonajes;
	public AtaqueImposibleException(String mensaje, Personaje personaje, Personaje personajeAtacado) {
		super(mensaje, personaje);
		this.distanciaMaximaSoportada=personaje.distanciaDeAtaque; 
		this.distanciaRealEntrePersonajes = personaje.distancia(personajeAtacado);
	}
	public Personaje getPersonajeAtacado() {
		return personajeAtacado;
	}
	public double getDistanciaMaximaSoportada() {
		return distanciaMaximaSoportada;
	}
	public double getDistanciaRealEntrePersonajes() {
		return distanciaRealEntrePersonajes;
	}

}
