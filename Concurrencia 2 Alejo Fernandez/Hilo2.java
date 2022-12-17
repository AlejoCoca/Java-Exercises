
import java.util.Random;
public class Hilo2 extends Thread{
private String[] lista={"Coso uno","Socotroco dos","Cosito tres","Suuu 4","Conjunto de caracteres numero 5"};
private static Random r=new Random();
public void run() {
	for(int i=0;i<=30;i++) {
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.getStackTrace();
		}
		System.out.println(lista[r.nextInt(5)]);
		
	}
}
public Hilo2() {
	super();
	// TODO Auto-generated constructor stub
}
}
