package modelo;

public class DecoratorAire extends DecoratorElementos
{

	public DecoratorAire(IPersonaje encapsulado)
	{
		super(encapsulado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArmadura()
	{
		double armadura=this.encapsulado.getArmadura();
		armadura*=0.9;
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
		double distante=this.encapsulado.getAtaqueDistante();
		distante*=1.1;
		return distante;
	}

	@Override
	public String toString()
	{
		return this.encapsulado.toString()+" Elemento Aire";
	}
	
	

}

