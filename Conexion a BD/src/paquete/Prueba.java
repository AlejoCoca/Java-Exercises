package paquete;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.apache.http.client.ClientProtocolException;

import modelo.Persona;
import persistencia.Persistente;
import persistencia.ViaPhp;

public class Prueba {

	public static void main(String[] args) {
		lee();
	}

	public static void lee() {
		ViaPhp persistente = new ViaPhp("http://127.1.1.1");
		ArrayList<Persona> listado = new ArrayList<Persona>();
		try {
			listado = persistente.obtenerPersonas();
			for (int i = 0; i < listado.size(); i++)
				System.out.println(listado.get(i));
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void escribe() {
		Persistente persistente = new ViaPhp("http://127.1.1.1");
		Persona p = new Persona("Roxana", "Basualdo", 47);

		try {
			persistente.almacenarPersona(p);
			System.out.println("Persona guardada");
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage() + e);
		} catch (ClientProtocolException e) {
			System.out.println(e.getMessage() + e.getCause().getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage() + e);
		}

	}

}
