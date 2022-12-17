package RegistroDeUsuarios;

public class NombreInvalidoException extends Exception {
	private boolean condicion; 

	public NombreInvalidoException(String mensaje, boolean condicion) {
		super(mensaje);
		this.condicion = condicion; 
	}

	public boolean getCondicion() {
		return condicion;
	}
	
	
	
	
}
