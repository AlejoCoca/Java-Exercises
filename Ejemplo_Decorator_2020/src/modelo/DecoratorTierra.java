package modelo;

public class DecoratorTierra extends DecoratorElementos
{

	public DecoratorTierra(IPersonaje encapsulado)
	{
		super(encapsulado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArmadura()
	{
		double armadura=this.encapsulado.getArmadura();
		armadura*=1.25;
		return armadura;
	}

	@Override
	public double getAtaqueCorto()
	{
		double corto=this.encapsulado.getAtaqueCorto();
		corto*=0.8;
		return corto;
	}

	@Override
	public double getAtaqueDistante()
	{
		double distante=this.encapsulado.getAtaqueDistante();
		distante*=0.7;
		return distante;
	}

	@Override
	public String toString()
	{
		return this.encapsulado.toString()+" Elemento Tierra";
	}
	
	

}

