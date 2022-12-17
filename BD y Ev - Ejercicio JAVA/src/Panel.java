import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
 
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class Panel extends JFrame {

	private static BD baseDatos;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldTelefono;
	private JTextField textFieldDia;
	private JTextField textFieldMes;
	private JTextField textFieldAnio;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private DefaultListModel<Persona> modeloLista; 
	private JList<Persona> list_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			baseDatos = new BD();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} 
		try {
			baseDatos.conectar("jdbc:mysql://localhost:3306/agenda", "root", ""); 
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel frame = new Panel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Panel() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton añadirContacto = new JButton("A\u00F1adir Contacto");
		
		panel.add(añadirContacto);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Nombre", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_2);
		
		textFieldNombre = new JTextField();
		panel_2.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Telefono", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_3);
		
		textFieldTelefono = new JTextField();
		panel_3.add(textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DD - MM - AAAA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_1);
		
		textFieldDia = new JTextField();
		panel_1.add(textFieldDia);
		textFieldDia.setColumns(10);
		
		textFieldMes = new JTextField();
		panel_1.add(textFieldMes);
		textFieldMes.setColumns(10);
		
		textFieldAnio = new JTextField();
		panel_1.add(textFieldAnio);
		textFieldAnio.setColumns(10);
		
		list_1 = new JList<Persona>();
		contentPane.add(list_1, BorderLayout.CENTER);
		this.modeloLista= new DefaultListModel<Persona>();
		list_1.setModel(modeloLista);
		try {
			Iterator<Persona>it = baseDatos.recuperarPersonas();
			while (it.hasNext()) {
				modeloLista.addElement(it.next());
				repaint(); 
			}
		} catch (SQLException e2) { 
			NotificacionModal error = new NotificacionModal(e2.getMessage());
			error.setVisible(true);
		} 
		añadirContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nombre = textFieldNombre.getText();
					String telefono = textFieldTelefono.getText(); 
					int dia = Integer.parseInt(textFieldDia.getText());
					int mes = Integer.parseInt(textFieldMes.getText());
					int anio = Integer.parseInt(textFieldAnio.getText());
			
				try {
					Persona p = new Persona(nombre);
					p.setFecha(new GregorianCalendar(anio, mes, dia));
					p.setTelefono(telefono);
					baseDatos.almacenarPersona(p); 
					modeloLista.clear();
					try {
						Iterator<Persona>it = baseDatos.recuperarPersonas();
						while (it.hasNext()) {
							modeloLista.addElement(it.next());
							repaint(); 
						}
					} catch (SQLException e2) { 
						NotificacionModal error = new NotificacionModal(e2.getMessage());
						error.setVisible(true);
					} 
				}catch(SQLException e1) {
					NotificacionModal error = new NotificacionModal(e1.getMessage());
					error.setVisible(true);
				}
				}catch(Exception e4) {
					NotificacionModal error = new NotificacionModal(e4.getMessage());
					error.setVisible(true);
				}
			}
		});
	}

}
