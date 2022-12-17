package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import characters.Personaje;
import juego.Juego;
import javax.swing.ScrollPaneConstants;

public class Ventana extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private DefaultListModel<Personaje> modeloLista1 = new DefaultListModel<Personaje>();
	private DefaultListModel<Personaje> modeloLista2 = new DefaultListModel<Personaje>();
	private VentanaCrearPersonajes vcp = new VentanaCrearPersonajes();
	/**
	 * Launch the application.
	 */

	public Ventana() {
		 
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100, 1000, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JPanel Main = new JPanel();
		Main.setBorder(new TitledBorder(null, "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(153, 204, 255)));
		Main.setBackground(Color.WHITE);
		contentPane.add(Main, BorderLayout.CENTER);
		Main.setLayout(new GridLayout(0, 2, 10, 0));
		
		JPanel Personajes = new JPanel();
		Personajes.setBorder(null);
		Personajes.setBackground(Color.WHITE);
		Main.add(Personajes);
		Personajes.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		Personajes.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Equipo1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		JList<Personaje> listEquipo1 = new JList<Personaje>();
		listEquipo1.setBorder(new TitledBorder(null, "Personajes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setViewportView(listEquipo1);
		listEquipo1.setModel(modeloLista1);
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Equipo2", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_3.add(scrollPane_1, BorderLayout.CENTER);
		
		JList<Personaje> listEquipo2 = new JList<Personaje>();
		listEquipo2.setBorder(new TitledBorder(null, "Personajes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		listEquipo2.setModel(modeloLista2);
		scrollPane_1.setViewportView(listEquipo2);
		
		JPanel panel_1 = new JPanel();
		Personajes.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnAtacar = new JButton("Atacar");
		panel_1.add(btnAtacar);
		
		JButton btnMover = new JButton("Mover");
		panel_1.add(btnMover);
		
		JButton btnCrear = new JButton("Crear nuevo personaje");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vcp.getP();
				vcp.setVisible(true);
				
			}
		});
		panel_1.add(btnCrear);
		
		JPanel Registro = new JPanel();
		Registro.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Registro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Registro.setBackground(Color.WHITE);
		Main.add(Registro);
		Registro.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane registro = new JScrollPane();
		Registro.add(registro);
		
		JPanel Tittle = new JPanel();
		Tittle.setBackground(new Color(153, 204, 255));
		contentPane.add(Tittle, BorderLayout.NORTH);
		Tittle.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));
		
		JLabel lblNewLabel = new JLabel("Juego de Estrategia");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		Tittle.add(lblNewLabel);
	}
	public void actualizarListas() {
	this.modeloLista1.clear();
	this.modeloLista2.clear();
	Iterator<Personaje> iterator1 =Juego.getInstance().getEquipo1().iterator();
	Iterator<Personaje> iterator2 =Juego.getInstance().getEquipo2().iterator();
	
	while(iterator1.hasNext()) {
		this.modeloLista1.addElement(iterator1.next());
	}
	while(iterator2.hasNext()) {
		this.modeloLista2.addElement(iterator2.next());
	}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	 

	 
}
