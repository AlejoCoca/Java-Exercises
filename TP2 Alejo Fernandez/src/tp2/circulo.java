package tp2;

public class circulo {
	
	char nombre;
	double diametro, superficie, perimetro;
	
	public void setNombre(char nom) {
		nombre=nom;
	}
	
	public void setDiametro(double diam) {
		diametro=diam;
		superficie=Math.pow(diametro/2, 2)*3.1416;
		perimetro=3.1416*diametro;
	}
	
	public char getNombre() {
		return nombre;
	}
	
	public double getDiametro(){
		return diametro;
	}
	
	public double getSuperficie(){
		return superficie;
	}
	
	public double getPerimetro(){
		return perimetro;
	}


}
