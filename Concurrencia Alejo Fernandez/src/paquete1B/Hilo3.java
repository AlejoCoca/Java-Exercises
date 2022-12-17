package paquete1B;
import java.awt.*;

public class Hilo3 extends Thread{
	
@Override
	public void run(){
	for(int i=0;i<20;i++){
		try{
			Thread.sleep(4000);
		}catch(InterruptedException e){
			e.getStackTrace();
		}
		Toolkit.getDefaultToolkit().beep();
	}
}

	public Hilo3(){
		super();
	}
}
