package persistencia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;

import modelo.Persona;

public class ViaPhp implements Persistente {
	private String host;

	public ViaPhp(String host) {
		super();
		this.host = host;
	}

	@Override
	public String almacenarPersona(Persona p) throws ClientProtocolException, IOException {
		HttpClient httpClient = HttpClientBuilder.create().build();

		HttpContext localContext = new BasicHttpContext();
		HttpResponse response = null;

		HttpPost httpPost = new HttpPost(this.host + "/insertar.php");
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("nombre", p.getNombre()));
		params.add(new BasicNameValuePair("apellido", p.getApellido()));
		params.add(new BasicNameValuePair("edad", String.valueOf(p.getEdad())));

		httpPost.setEntity(new UrlEncodedFormEntity(params));
		response = httpClient.execute(httpPost, localContext);

		return response.toString();

	}

	@Override
	public ArrayList<Persona> obtenerPersonas() throws ClientProtocolException, IOException {
		String resultado = this.leer();
		ArrayList<Persona> listado = new ArrayList<Persona>();
		Persona p;
		JSONArray json;
		try {
			json = new JSONArray(resultado);
			for (int i = 0; i < json.length(); i++) {
				p = new Persona();
				p.setNombre(json.getJSONObject(i).getString("nombre"));
				p.setApellido(json.getJSONObject(i).getString("apellido"));
				p.setEdad(json.getJSONObject(i).getInt("edad"));
				listado.add(p);
			}
		} catch (JSONException e) {
			System.out.println("Error de Json: " + e.getMessage());

		}

		return listado;
	}

	private String leer() throws ClientProtocolException, IOException {

		HttpClient cliente = HttpClientBuilder.create().build();
		HttpContext contexto = new BasicHttpContext();
		HttpPost httppost = new HttpPost(this.host + "/leer.php");
		String resultado = null;

		HttpResponse response = cliente.execute(httppost, contexto);
		HttpEntity entity = response.getEntity();
		resultado = EntityUtils.toString(entity, "UTF-8");
		return resultado;
	}

}
