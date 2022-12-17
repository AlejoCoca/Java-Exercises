package modelo;

public class DecoratorFuego extends DecoratorElementos
{

	public DecoratorFuego(IPersonaje encapsulado)
	{
		super(encapsulado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArmadura()
	{
		double armadura=this.encapsulado.getArmadura();
		armadura*=0.50;
		return armadura;
	}

	@Override
	public double getAtaqueCorto()
	{
		double corto=this.encapsulado.getAtaqueCorto();
		corto*=1.8;
		return corto;
	}

	@Override
	public double getAtaqueDistante()
	{
		double distante=this.encapsulado.getAtaqueDistante();
		distante*=1.7;
		return distante;
	}

	@Override
	public String toString()
	{
		return this.encapsulado.toString()+" Elemento Fuego";
	}
	
	

}
