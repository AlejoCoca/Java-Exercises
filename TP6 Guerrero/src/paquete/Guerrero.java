package paquete;

public class Guerrero {
	
	String nombre;
	private double vitalidad, armadura, x, y;
	
	
	public Guerrero() {
		this("Desconocido");
	}

	public Guerrero(String nombre) {
		this.nombre = nombre;
		this.vitalidad = 500;
		this.armadura = 800;
	}

	public Guerrero(String nombre, double x, double y) {
		this(nombre);
		this.x = x;
		this.y = y;
	}

	public String getNombre()
	{
		return this.nombre;
	}
	
	public Double getVitalidad()
	{
		return this.vitalidad;
	}
	
	public Double getArmadura()
	{
		return this.armadura;
	}
	
	public Double getX()
	{
		return this.x;
	}
	
	public Double getY()
	{
		return this.y;
	}
	
	public void setVitalidad(double vitalidad)
	{
		this.vitalidad=vitalidad;
	}
	
	public void setArmadura(double armadura)
	{
		this.armadura=armadura;
	}
	
	public void setX(double x)
	{
		this.x=x;
	}
	
	public void setY(double y)
	{
		this.y=y;
	}
	
	public void mover(double inc_x, double inc_y)
	{
		this.x+=inc_x;
		this.y+=inc_y;
	}
	
	public void recibirDaño(double cantidad)
	{
		if(this.armadura-cantidad>0)
		{
			this.armadura-=cantidad;
		}
		else if(armadura==0)
		{
			this.vitalidad-=cantidad;
		}
		else
		{
			this.vitalidad+=armadura-cantidad;
			this.armadura=0;
		}
	}

	@Override
	public String toString() {
		return "Guerrero [nombre=" + nombre + ", vitalidad=" + vitalidad + ", armadura=" + armadura + ", x=" + x
				+ ", y=" + y + "]";
	}
	
}
