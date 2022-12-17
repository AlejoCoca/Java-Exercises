package paquete1B;

public class Hilo1 extends Thread {
	
public void run() {
	for(int i=0;i<=100;i++) {
		try{Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i);
	}
}

public Hilo1() {
	super();
}

}
