package paquete;


public class Unidad {
   private String equipo;
   private int costo;
   private int energia;
   
   public String getEquipo() {
	  return equipo;
   }

   public void setEquipo(String equipo) {
	  this.equipo = equipo;
   }

   public int getCosto() {
	  return costo;
   }

   public void setCosto(int costo) {
	  this.costo = costo;
   }

   public int getEnergia() {
	  return energia;
   }

   public void setEnergia(int energia) {
	  this.energia = energia;
   }

   public Unidad(String equipo, int costo, int energia) {
	  super();
	  this.equipo = equipo;
	  this.costo = costo;
	  this.energia = energia;
   }
   
   void recibeDano(int cantidad) {
	   
   }
   
}
