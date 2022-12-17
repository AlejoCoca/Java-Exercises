package RegistroDeUsuarios;
public class Usuario {
	private String contrasenia;
	private String nombre;
	Usuario(String contrasenia,String nombre) throws ContraseniaInvalidaException,NombreInvalidoException{
		this.setContrasenia(contrasenia);
		this.setNombre(nombre);
	}
	public String getContrasenia() {
		return contrasenia;
	}
	
	public void setContrasenia(String contrasenia) throws ContraseniaInvalidaException {
		if(contrasenia!=null) {
			if(contrasenia.length()>=6) {
				if(contrasenia.codePointAt(0) >= 65 && contrasenia.codePointAt(0) <= 90 || 
				contrasenia.codePointAt(0) >= 97 && contrasenia.codePointAt(0) <= 122)  {
					this.contrasenia = contrasenia;
				}else  throw new ContraseniaInvalidaException("La contraseña no inicia con una letra",contrasenia);
				
			} else throw new ContraseniaInvalidaException("La contraseña es corta",contrasenia);
			
		}else throw new ContraseniaInvalidaException("La contraseña es null",contrasenia);
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) throws NombreInvalidoException {
		
		if(nombre!=null) {
			if(nombre!="") this.nombre = nombre;
			else throw new NombreInvalidoException("El nombre es una String vacia",false); 
		}
		else throw new NombreInvalidoException("El nombre es null",false); 
		
	}
	@Override
	public String toString() {
		return "Usuario | Contrasenia:" + contrasenia + " | Nombre:" + nombre ;
	}
	
	
}
