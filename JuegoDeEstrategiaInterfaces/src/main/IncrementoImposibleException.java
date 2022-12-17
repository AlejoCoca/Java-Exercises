package main;

public class IncrementoImposibleException extends AccionPersonajeException {
	private double maxDistanciaSoportada;
	private double distanciaPretendida;

	public IncrementoImposibleException(String mensaje, Personaje personaje, double maxDistanciaSoportada,
			double distanciaPretendida) {
		super(mensaje, personaje);
		this.maxDistanciaSoportada = maxDistanciaSoportada;
		this.distanciaPretendida = distanciaPretendida;
	}

	public void setMaxDistanciaSoportada(double maxDistanciaSoportada) {
		this.maxDistanciaSoportada = maxDistanciaSoportada;
	}

	public void setDistanciaPretendida(double distanciaPretendida) {
		this.distanciaPretendida = distanciaPretendida;
	} 

}
