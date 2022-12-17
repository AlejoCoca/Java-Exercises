package ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import modelo.Arquero;
import modelo.Caballero;
import modelo.Guerrero;
import modelo.Juego;
import modelo.Mago;
import modelo.Personaje;
import modelo.Posicion;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;



public class Ventana extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panelCentro;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JScrollPane scrollPaneIzquierda;
	private JPanel panelMedio;
	private JScrollPane scrollPaneDerecha;
	private JPanel Creacion;
	private JPanel Enfrentar;
	private JRadioButton RadioButtonGuerrero;
	private JRadioButton RadioButtonArquero;
	private JRadioButton RadioButtonCaballero;
	private JRadioButton RadioButtonMago;
	private JPanel panel;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_6;
	private JButton ButtonAgregar;
	private JButton ButtonEliminar;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel panel_8;
	private JPanel panel_9;
	private JButton NewButtonEnfrentar;
	private Juego juego=new Juego();
	private JTextField textFieldNombre;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JPanel panel_2;
	private JList<Personaje> list1;
	private JList<Personaje> list2;
	private DefaultListModel<Personaje> modeloLista = new DefaultListModel<Personaje>();
	private JTextField textFieldX;
	private JTextField textFieldY;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPanel panel_5;
	private JPanel panel_7;
	private JPanel panel_10;
	private JPanel panel_11;
	
	

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 420);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.panelCentro = new JPanel();
		this.contentPane.add(this.panelCentro, BorderLayout.CENTER);
		this.panelCentro.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.scrollPaneIzquierda = new JScrollPane();
		this.panelCentro.add(this.scrollPaneIzquierda);
		
		this.panelMedio = new JPanel();
		this.panelCentro.add(this.panelMedio);
		this.panelMedio.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.Creacion = new JPanel();
		this.Creacion.setBorder(new LineBorder(new Color(0, 0, 0)));
		this.panelMedio.add(this.Creacion);
		this.Creacion.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel = new JPanel();
		this.Creacion.add(this.panel);
		
		RadioButtonGuerrero =    new JRadioButton("Guerrero");
		buttonGroup.add(this.RadioButtonGuerrero);
		this.panel.add(this.RadioButtonGuerrero);
		
		this.panel_4 = new JPanel();
		this.Creacion.add(this.panel_4);
		
		this.RadioButtonCaballero = new JRadioButton("Caballero");
		buttonGroup.add(this.RadioButtonCaballero);
		this.panel_4.add(this.RadioButtonCaballero);
		
		this.panel_3 = new JPanel();
		this.Creacion.add(this.panel_3);
		
		this.RadioButtonArquero = new JRadioButton("Arquero");
		buttonGroup.add(this.RadioButtonArquero);
		this.panel_3.add(this.RadioButtonArquero);
		
		this.panel_6 = new JPanel();
		this.Creacion.add(this.panel_6);
		
		this.RadioButtonMago = new JRadioButton("Mago");
		buttonGroup.add(this.RadioButtonMago);
		this.panel_6.add(this.RadioButtonMago);
		
		this.panel_2 = new JPanel();
		this.Creacion.add(this.panel_2);
		
		this.lblNewLabel = new JLabel("Nombre:");
		this.panel_2.add(this.lblNewLabel);
		
		this.panel_1 = new JPanel();
		this.Creacion.add(this.panel_1);
		
		this.textFieldNombre = new JTextField();
		this.panel_1.add(this.textFieldNombre);
		this.textFieldNombre.setColumns(10);
		
		this.panel_5 = new JPanel();
		this.Creacion.add(this.panel_5);
		
		this.lblNewLabel_1 = new JLabel("X");
		this.panel_5.add(this.lblNewLabel_1);
		
		this.panel_7 = new JPanel();
		this.Creacion.add(this.panel_7);
		
		this.lblNewLabel_2 = new JLabel("Y");
		this.panel_7.add(this.lblNewLabel_2);
		
		this.panel_10 = new JPanel();
		this.Creacion.add(this.panel_10);
		
		this.textFieldX = new JTextField();
		this.panel_10.add(this.textFieldX);
		this.textFieldX.setColumns(10);
		
		this.panel_11 = new JPanel();
		this.Creacion.add(this.panel_11);
		
		this.textFieldY = new JTextField();
		this.panel_11.add(this.textFieldY);
		this.textFieldY.setColumns(10);
		
		this.panel_8 = new JPanel();
		this.Creacion.add(this.panel_8);
		
		this.ButtonAgregar = new JButton("Agregar");
		this.ButtonAgregar.addActionListener(this);
		this.panel_8.add(this.ButtonAgregar);
		
		this.panel_9 = new JPanel();
		this.Creacion.add(this.panel_9);
		
		this.ButtonEliminar = new JButton("Eliminar");
		this.ButtonEliminar.addActionListener(this);
		this.panel_9.add(this.ButtonEliminar);
		
		this.Enfrentar = new JPanel();
		this.Enfrentar.setSize(new Dimension(0, 80));
		this.Enfrentar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		this.panelMedio.add(this.Enfrentar);
		
		this.NewButtonEnfrentar = new JButton("Enfrentar");
		this.NewButtonEnfrentar.addActionListener(this);
		this.Enfrentar.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		this.Enfrentar.add(this.NewButtonEnfrentar);
		
		this.scrollPaneDerecha = new JScrollPane();
		this.panelCentro.add(this.scrollPaneDerecha);
		
		JPanel panelSurTexto = new JPanel();
		panelSurTexto.setPreferredSize(new Dimension(10, 80));
		this.contentPane.add(panelSurTexto, BorderLayout.SOUTH);
		panelSurTexto.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane = new JScrollPane();
		panelSurTexto.add(this.scrollPane, BorderLayout.CENTER);
		
		this.textArea = new JTextArea();
		this.scrollPane.setViewportView(this.textArea);
		
		this.list1 = new JList<Personaje>();
		this.scrollPaneIzquierda.setViewportView(this.list1);
		
		this.list2 = new JList<Personaje>();
		this.scrollPaneDerecha.setViewportView(this.list2);
		
		this.list1.setModel(modeloLista);
		this.list2.setModel(modeloLista);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.NewButtonEnfrentar) {
			do_NewButtonEnfrentar_actionPerformed(e);
		}
		if (e.getSource() == this.ButtonEliminar) {
			do_ButtonEliminar_actionPerformed(e);
		}
		if (e.getSource() == this.ButtonAgregar) {
			do_ButtonAgregar_actionPerformed(e);
		}
	}
	
	protected void do_ButtonAgregar_actionPerformed(ActionEvent e) 
	{
		String nombre = this.textFieldNombre.getText();
		double x = Double.parseDouble(this.textFieldX.getText());
		double y = Double.parseDouble(this.textFieldX.getText());
		Posicion pos=new  Posicion(x,y);
		Personaje p =  new Personaje(nombre, pos);
		
		if(RadioButtonGuerrero.isSelected()){
			p = new Guerrero(nombre, pos);
		}
		if(RadioButtonCaballero.isSelected()){
			p = new Caballero(nombre,pos);
		}
		if(RadioButtonArquero.isSelected()){
			p = new Arquero(nombre,pos);
		}
		if(RadioButtonMago.isSelected()){
			p = new Mago(nombre,pos);		
		}
		
		this.juego.agregarPersonaje(p);		
		this.actualizaListas();
		this.textArea.append(p.getNombre() + " fue agregado \n");
	}
	
	private void actualizaListas() 
	{
		this.modeloLista.clear();
		Iterator<Personaje> iterator=this.juego.getPersonaje();
		while(iterator.hasNext())
			this.modeloLista.addElement(iterator.next());
	}

	protected void do_ButtonEliminar_actionPerformed(ActionEvent e) 
	{
		Personaje p= this.list1.getSelectedValue();
		if(p!=null)
		{
			this.juego.eliminarPersonaje(p);
			this.actualizaListas();
			this.textArea.append(p.getNombre() + " fue eliminado \n");
		}
	}
	
	protected void do_NewButtonEnfrentar_actionPerformed(ActionEvent e) 
	{
		Personaje p1= this.list1.getSelectedValue();
		Personaje p2= this.list2.getSelectedValue();
		if(p1!=null && p2!=null) 
		{
			Personaje ganador = this.juego.enfrentar(p1,p2);
			String cartel = "Se enfrentaron "+p1.getNombre()+" con "+p2.getNombre();
			if(ganador==null)
			{ 
				cartel = cartel+"\n Empate \n";
			}else {
				cartel=cartel+" Ganador: "+ganador.getNombre()+"\n";
			}
			this.textArea.append(cartel);
		}else{
			String cartel ="Seleccione 2 personajes \n";
			this.textArea.append(cartel);
		}
	}


}
