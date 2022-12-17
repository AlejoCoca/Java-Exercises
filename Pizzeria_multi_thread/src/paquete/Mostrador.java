package paquete;

public class Mostrador {
	private String mesita=null;
	
	public synchronized void agregarPizza(Cocinero c, String p)
	{
		while(this.mesita1!=null)
			wait();
		this.mesita=p;
		notifyAll();
	}
	
	public synchronized String retirarPizza(Delivery d)
	{
		while(this.mesita==null)
			wait();
		String pedido=this.pedido;
		mesita=null;
		notifyAll();
		return pedido;
	}
	
}
