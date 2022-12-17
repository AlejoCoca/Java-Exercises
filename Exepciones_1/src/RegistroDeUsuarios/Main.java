package RegistroDeUsuarios;
public class Main {
  
	public static void main(String[] args) {
		Usuario user = null;
		String contraseniaDePrueba = "L1234567";
		String nombreDePrueba ="";
		try {
			user = new Usuario("Contrase123","Kevin");
			System.out.println("Nuevo usuario creado: " + user.toString());
		} catch (ContraseniaInvalidaException e1) {
			System.out.println("No se pudo crear el usuario:");
			System.out.println("---Motivo: " + e1.getMessage());
		} catch (NombreInvalidoException e1) {
			System.out.println("No se pudo crear el usuario:");
			System.out.println("---Motivo: " + e1.getMessage());
		}
		
		try {
			user.setNombre(nombreDePrueba);
			System.out.println("Su nuevo nombre es: " + user.getNombre());
		} catch (NombreInvalidoException e1) {
			System.out.println("No se pudo cambiar el nombre:");
			System.out.println("---Motivo: " + e1.getMessage());
		}
		
	    try {
	    	user.setContrasenia(contraseniaDePrueba);
			System.out.println("Su nueva contrasenia es: " + user.getContrasenia());
	    } catch (ContraseniaInvalidaException e1) {
			System.out.println("No se pudo cambiar la contraseña:");
			System.out.println("---Motivo: " + e1.getMessage());
		}

	}

}
 
