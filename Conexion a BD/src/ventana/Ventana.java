package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.http.client.ClientProtocolException;

import modelo.Persona;
import persistencia.Persistente;
import persistencia.ViaPhp;
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
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JList;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JPanel panel;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_6;
	private JLabel Nombre;
	private JTextField Edad_1;
	private JLabel Apellido;
	private JTextField Apellido_1;
	private JLabel Edad;
	private JButton Agregar;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JButton Listar;
	private JPanel panel_2;
	private JTextField Nombre_1;
	private JList<Persona> Lista;
	private DefaultListModel<Persona> ModelLista = new DefaultListModel<>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.BLACK);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 3, 5));

		panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 4));

		panel_6 = new JPanel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_3.add(panel_6);
		panel_6.setLayout(new GridLayout(4, 2, 0, 0));

		panel_7 = new JPanel();
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_6.add(panel_7);

		Nombre = new JLabel("Nombre");
		panel_7.add(Nombre);
		Nombre.setHorizontalAlignment(SwingConstants.CENTER);

		panel_8 = new JPanel();
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_6.add(panel_8);

		Nombre_1 = new JTextField();
		panel_8.add(Nombre_1);
		Nombre_1.setColumns(10);

		panel_9 = new JPanel();
		panel_9.setBackground(Color.LIGHT_GRAY);
		panel_6.add(panel_9);

		Apellido = new JLabel("Apellido");
		panel_9.add(Apellido);
		Apellido.setHorizontalAlignment(SwingConstants.CENTER);

		panel_10 = new JPanel();
		panel_10.setBackground(Color.LIGHT_GRAY);
		panel_6.add(panel_10);

		Apellido_1 = new JTextField();
		panel_10.add(Apellido_1);
		Apellido_1.setColumns(10);

		panel_11 = new JPanel();
		panel_11.setBackground(Color.LIGHT_GRAY);
		panel_6.add(panel_11);

		Edad = new JLabel("Edad");
		panel_11.add(Edad);
		Edad.setHorizontalAlignment(SwingConstants.CENTER);

		panel_12 = new JPanel();
		panel_12.setBackground(Color.LIGHT_GRAY);
		panel_6.add(panel_12);

		Edad_1 = new JTextField();
		panel_12.add(Edad_1);
		Edad_1.setColumns(10);

		panel_13 = new JPanel();
		panel_13.setBackground(Color.LIGHT_GRAY);
		panel_6.add(panel_13);
		Lista = new JList<Persona>();

		this.Lista.setModel(ModelLista);
		Agregar = new JButton("Agregar");
		Agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = Nombre_1.getText();
				String apellido = Apellido_1.getText();
				int edad = Integer.parseInt(Edad_1.getText());

				Persistente persistente = new ViaPhp("http://127.1.1.1");
				Persona p = new Persona(nombre, apellido, edad);

				try {
					persistente.almacenarPersona(p);
					System.out.println("Persona guardada");
				} catch (UnsupportedEncodingException e1) {
					System.out.println(e1.getMessage() + e1);
				} catch (ClientProtocolException e1) {
					System.out.println(e1.getMessage() + e1.getCause().getMessage());
				} catch (IOException e1) {
					System.out.println(e1.getMessage() + e1);
				}

			}
		});
		panel_13.add(Agregar);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_6.add(panel_2);

		Listar = new JButton("Listar");
		Listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViaPhp persistente = new ViaPhp("http://127.1.1.1");// TODO Auto-generated method
				ArrayList<Persona> listado = new ArrayList<Persona>();
				try {
					listado = persistente.obtenerPersonas();
					for (int i = 0; i < listado.size(); i++) {
						ModelLista.addElement(listado.get(i));
					}

				} catch (ClientProtocolException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		panel_2.add(Listar);

		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		panel_4.add(Lista);

		panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setPreferredSize(new Dimension(10, 80));
		contentPane.add(panel_1, BorderLayout.SOUTH);
	}

}
