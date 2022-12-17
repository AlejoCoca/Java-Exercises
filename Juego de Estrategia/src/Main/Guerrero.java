package Main;

public class Guerrero {
	String nombre;
	private double vitalidad, armadura, x=10, y=10;
	
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
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
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
	
}
