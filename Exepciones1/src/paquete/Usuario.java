package paquete;

public class Usuario {
	private String usuario;
	private String contraseña;
	
	public Usuario(String usuario, String contraseña) {
		this.setUsuario(usuario);
		this.setContraseña(contraseña);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
