package persistencia;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.apache.http.client.ClientProtocolException;

import modelo.Persona;

public interface Persistente {
	String almacenarPersona(Persona p) throws UnsupportedEncodingException, ClientProtocolException, IOException;

	ArrayList<Persona> obtenerPersonas() throws ClientProtocolException, IOException;
}


