package paquete;


public class Edificio extends Unidad implements IConstruible, IHostil{
	
	public int getTiempoConstruccion(int i) {
		return 0;
	}
	
	public void atacar(Unidad adversario) {
		
	}
	public void setEquipo(String equipo) {
		
		super.setEquipo(equipo);
		equipo = "edificio";
	}
	public void setCosto(int costo) {
		
		super.setCosto(costo);
		costo = 500;
	}
	public void setEnergia(int energia) {
		
		super.setCosto(energia);
		energia = 3000;
	}
	public void recibeDano(int daño) {
		int energia = this.getEnergia();
		energia -= daño/2;
		this.setEnergia(energia);
	}
	public Edificio(String equipo, int costo, int energia) {
		super(equipo, costo, energia);	
	}
}
