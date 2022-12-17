package trabajoJava;
import java.util.Random;

public class Guerrero {
	Random rd=new Random();
	String nombre;
	private int ataque, defensa, torso, cabeza, brazoIzq, brazoDer, piernaIzq, piernaDer;
	
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
	public void recivirAtaque(int tipoAtaque, int lugarAtaque, int at) {
		int presicion=75;
		if(brazoIzq<0)
		{
			torso-=5;
			ataque=ataque/2;
		}
		if(brazoIzq<0)
		{
			torso-=5;
			ataque=ataque/2;
		}
		if(piernaIzq<0)
		{
			torso-=5;
			presicion-=20;
		}
		if(piernaIzq<0)
		{
			torso-=5;
			presicion-=20;
		}
		if(tipoAtaque==1)
		{
			presicion-=15;
		}
		else
		{
			if(tipoAtaque==3)
			{
				presicion+=15;
			}
		}
		switch(lugarAtaque) {
		case 1:{
			if(rd.nextInt(100)+1<=presicion-30) {
				cabeza-=at;
			}
		}break;
		case 2:{
			if(rd.nextInt(100)+1<=presicion) {
				torso-=at;
			}
		}break;
		case 3:{
			if(rd.nextInt(100)+1<=presicion-15) {
				brazoIzq-=at;
			}
		}break;
		case 4:{
			if(rd.nextInt(100)+1<=presicion-15) {
				brazoDer-=at;
			}
		}break;
		case 5:{
			if(rd.nextInt(100)+1<=presicion-15) {
				piernaIzq-=at;
			}
		}break;
		case 6:{
			if(rd.nextInt(100)+1<=presicion-15) {
				piernaDer-=at;
			}
		}break;
		}
	}
	public boolean sigueVivo()
	{
		return (cabeza>0 && torso>0);
	}
	
}
