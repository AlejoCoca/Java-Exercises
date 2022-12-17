package paquete;


public class Prueba {

	public static void main(String[] args) {
		Personajes Tropa = new Personajes("", 0, 0);
		Edificio Cuartel = new Edificio("", 0, 0);
		Edificio TorretaVigilancia = new Edificio("", 0, 0);
        
        Cuartel.setCosto(550);
        Cuartel.setEnergia(2400);
        Cuartel.getTiempoConstruccion(40);
        Cuartel.recibeDano(0);
        Cuartel.atacar(Cuartel);
        
        TorretaVigilancia.setCosto(200);
        TorretaVigilancia.setEnergia(2000);
        TorretaVigilancia.getTiempoConstruccion(40);
        TorretaVigilancia.recibeDano(0);
        TorretaVigilancia.atacar(TorretaVigilancia);
        
        Tropa.setCosto(200);
        Tropa.setEnergia(500);
        Tropa.recibeDano(0);
        Tropa.atacar(Tropa);
        
   
	}

}
