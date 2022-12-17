package modelo;

public abstract class Personaje implements IPersonaje
{
	private String nombre;

	@Override
	public String getNombre()
	{
		return this.nombre;
	}

	public Personaje(String nombre)
	{
		this.nombre = nombre;
	}

	@Override
	public String toString()
	{
		return "nombre=" + nombre;
	}
	
	

}
