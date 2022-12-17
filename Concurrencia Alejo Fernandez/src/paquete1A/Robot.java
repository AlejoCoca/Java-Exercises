package paquete1A;

import java.util.Random;

public class Robot extends Thread{
	
private String name;
private String[] listaNombres= {"Alejo","Pepe","Ximena","Messi","Lucas"};
private static Random r=new Random();

public Robot(String name){
	this.name=name;
}

public Robot(){
	this.name=listaNombres[(int)Math.round(Math.random()*5)];
}

public static void espera() {
	try {
		Thread.sleep(r.nextInt(3000));
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}

public String[] getListaNombres(){
	return listaNombres;
}

public void run() {
	for(int i=0;i<10;i++) {
		System.out.println(this.name);
		espera();
	}

	System.out.println("El robot "+this.name+" finalizo su tarea.");
	}
}
