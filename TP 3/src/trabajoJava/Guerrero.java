package trabajoJava;
import java.util.Random;

public class Guerrero {
	Random rd=new Random();
	String nombre;
	private int ataque, defensa, torso=100, cabeza=30, brazoIzq=35, brazoDer=35, piernaIzq=35, piernaDer=35;
	
	public void setNombre(String nom)
	{
		nombre=nom;
	}
	public void setAtaque(int at)
	{
		ataque=at;
	}
	public void setDefensa(int df)
	{
		defensa=df;
	}
	public int atacar() {
		return ataque;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void recivirAtaque(int lugarAtaque, int tipoAtaque, int at) {
		int presicion=75;
		at-=defensa;
		if(brazoIzq<0)
		{
			torso-=5;
		}
		if(brazoIzq<0)
		{
			torso-=5;
		}
		if(piernaIzq<0)
		{
			torso-=5;
		}
		if(piernaIzq<0)
		{
			torso-=5;
		}
		if(tipoAtaque==1)
		{
			presicion-=15;
			at=at+at/3;
		}
		else
		{
			if(tipoAtaque==3)
			{
				presicion+=15;
				at=at-at/3;
			}
		}
		switch(lugarAtaque) {
		case 1:{
			if(rd.nextInt(100)+1<=presicion-30) {
				cabeza-=at;
				System.out.println("Se hizo "+at+" de daño");
			}
			else
			{
				System.out.println("Ataque fallido");
			}
		}break;
		case 2:{
			if(rd.nextInt(100)+1<=presicion) {
				torso-=at;
				System.out.println("Se hizo "+at+" de daño");
			}
			else
			{
				System.out.println("Ataque fallido");
			}
		}break;
		case 3:{
			if(rd.nextInt(100)+1<=presicion-15) {
				if(brazoIzq>0 && brazoIzq-at<0)
				{
					ataque=ataque/3;
					presicion-=10;
				}
				brazoIzq-=at;
				System.out.println("Se hizo "+at+" de daño");
			}
			else
			{
				System.out.println("Ataque fallido");
			}
		}break;
		case 4:{
			if(rd.nextInt(100)+1<=presicion-15) {
				if(brazoDer>0 && brazoDer-at<0)
				{
					ataque=ataque/3;
					presicion-=10;
				}
				brazoDer-=at;
				System.out.println("Se hizo "+at+" de daño");
			}
			else
			{
				System.out.println("Ataque fallido");
			}
		}break;
		case 5:{
			if(rd.nextInt(100)+1<=presicion-15) {
				if(piernaIzq>0 && piernaIzq-at<0)
				{
					ataque=ataque/3;
					presicion-=10;
				}
				piernaIzq-=at;
				System.out.println("Se hizo "+at+" de daño");
			}
			else
			{
				System.out.println("Ataque fallido");
			}
		}break;
		case 6:{
			if(rd.nextInt(100)+1<=presicion-15) {
				if(piernaDer>0 && piernaDer-at<0)
				{
					ataque=ataque/3;
					presicion-=10;
				}
				piernaDer-=at;
				System.out.println("Se hizo "+at+" de daño");
			}
			else
			{
				System.out.println("Ataque fallido");
			}
		}break;
		}
	}
	
	public boolean sigueVivo()
	{
		return (cabeza>0 && torso>0);
	}
	
	public int getCabeza()
	{
		return cabeza;
	}
	
	public int getTorso()
	{
		return torso;
	}
	
	public int getBrazoIzq()
	{
		return brazoIzq;
	}
	
	public int getBrazoDer()
	{
		return brazoDer;
	}
	
	public int getPiernaIzq()
	{
		return piernaIzq;
	}
	
	public int getPiernaDer()
	{
		return piernaDer;
	}
}
