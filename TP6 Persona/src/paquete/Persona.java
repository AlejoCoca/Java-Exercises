package paquete;

public class Persona {
	
	
	private String nombre, email;
	private int edad;
	
	public Persona() {
		this("Anonimo");
	}
	
	public Persona(String nombre) {
		this(nombre, "Desconocido",0);

	}
	
	public Persona(String nombre, int edad) {
		this(nombre, "Desconocido", edad);
	}

	public Persona(String nombre, String email, int edad) {
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public int getEdad()
	{
		return this.edad;
	}
	
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	
	public boolean sosMayor()
	{
		return (edad>=18);
	}
	
	public int repeticionesDeLetra(char letra)
	{
		int cantidad=0;
		for(int i=0;i<nombre.length();i++)
		{
			if(Character.toLowerCase(nombre.charAt(i))==letra)
			{
				cantidad++;
			}
		}
		return cantidad;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", email=" + email + ", edad=" + ((edad>0)?edad:"Desconocida")  + "]";
	}
	
	
}
