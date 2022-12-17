package paquete;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

public class LeerPaginaWeb {

	public static void main(String[] args) {
		try {
			System.out.println(leer("https://www.google.com/"));
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static String leer(String urlAdress) throws ClientProtocolException, IOException {

		HttpClient cliente = HttpClientBuilder.create().build();
		HttpContext contexto = new BasicHttpContext();
		HttpPost httppost = new HttpPost(urlAdress);
		String resultado = null;

		HttpResponse response = cliente.execute(httppost, contexto);
		HttpEntity entity = response.getEntity();
		resultado = EntityUtils.toString(entity, "UTF-8");
		return resultado;
	}
}
