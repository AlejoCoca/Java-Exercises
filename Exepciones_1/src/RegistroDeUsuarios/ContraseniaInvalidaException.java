package RegistroDeUsuarios;

public class ContraseniaInvalidaException extends Exception {
	private String contraseniaInvalida;

	public ContraseniaInvalidaException(String mensaje,String contraseniaInvalida) {
		super(mensaje);
		this.contraseniaInvalida = contraseniaInvalida;
	}

	public String getContraseniaCorta() {
		return contraseniaInvalida;
	}
	
	
}
