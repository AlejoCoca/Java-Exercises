package CuentaBancaria;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDepositar;
	private JTextField textFieldExtraer;

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
		setResizable(false);
		setBackground(Color.BLACK);
		CuentaBancaria cuenta = new CuentaBancaria(1000,"LazurriGod");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 192);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel datosDeLaCuenta = new JPanel();
		datosDeLaCuenta.setBackground(Color.WHITE);
		panel.add(datosDeLaCuenta, BorderLayout.NORTH);
		datosDeLaCuenta.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel labelTitular = new JLabel("Titular: " + cuenta.getTitular());
		labelTitular.setBackground(Color.WHITE);
		datosDeLaCuenta.add(labelTitular);
		
		JLabel lblSaldo = new JLabel("Saldo: " + cuenta.getSaldo());
		lblSaldo.setBackground(Color.WHITE);
		datosDeLaCuenta.add(lblSaldo);
		
		JPanel acciones = new JPanel();
		panel.add(acciones);
		acciones.setLayout(new BorderLayout(0, 0));
		
		JPanel accionesBtnSection = new JPanel();
		acciones.add(accionesBtnSection);
		accionesBtnSection.setBackground(Color.WHITE);
		accionesBtnSection.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		accionesBtnSection.add(panel_1);
		
		JButton btnDepositar = new JButton("Depositar");
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cuenta.depositar(Integer.parseInt(textFieldDepositar.getText()));
					lblSaldo.setText("Saldo: " + cuenta.getSaldo());
				}
				catch (DepositoInvalidoException e1) { 
					NotificacionModal error = new NotificacionModal(e1.getMessage());
					error.setVisible(true);
				}
				catch (NumberFormatException e1) { 
					NotificacionModal error = new NotificacionModal("Ingrese un valor valido");
					error.setVisible(true);
				}  
			}
		});
		 
		panel_1.add(btnDepositar);
		
		textFieldDepositar = new JTextField();
		panel_1.add(textFieldDepositar);
		textFieldDepositar.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		accionesBtnSection.add(panel_1_1);
		
		JButton btnExtraer = new JButton("Extraer");
		btnExtraer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cuenta.extraer(Double.parseDouble(textFieldExtraer.getText()));
					lblSaldo.setText("Saldo: " + cuenta.getSaldo()); 
				} catch (NumberFormatException e1) { 
					NotificacionModal error = new NotificacionModal("Ingrese un valor valido");
					error.setVisible(true);
				} catch (ExtraccionInvalidaException e1) {
					NotificacionModal error = new NotificacionModal("El valor de la extraccion es mayor al saldo de la cuenta");
					error.setVisible(true);
				}
			}
		});
		panel_1_1.add(btnExtraer);
		
		textFieldExtraer = new JTextField();
		textFieldExtraer.setColumns(10);
		panel_1_1.add(textFieldExtraer);
	}

}
