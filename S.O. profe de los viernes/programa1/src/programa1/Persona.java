package programa1;

public class Persona {
	
	
	private String nombre, email;
	private int edad;
	
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
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
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
}
