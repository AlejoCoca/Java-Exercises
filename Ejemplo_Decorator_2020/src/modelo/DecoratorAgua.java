package modelo;

public class DecoratorAgua extends DecoratorElementos
{

	public DecoratorAgua(IPersonaje encapsulado)
	{
		super(encapsulado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArmadura()
	{
		double armadura=this.encapsulado.getArmadura();
		armadura*=0.85;
		return armadura;
	}

	@Override
	public double getAtaqueCorto()
	{
		double corto=this.encapsulado.getAtaqueCorto();
		corto*=1.2;
		return corto;
	}

	@Override
	public double getAtaqueDistante()
	{
		return this.encapsulado.getAtaqueDistante();
	}

	@Override
	public String toString()
	{
		return this.encapsulado.toString()+" Elemento Agua";
	}
	
	

}

