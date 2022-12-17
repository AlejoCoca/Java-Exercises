

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Window.Type;

public class NotificacionModal extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NotificacionModal dialog = new NotificacionModal("");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NotificacionModal(String mensaje) {
		setType(Type.POPUP);
		setModal(true);
		setBackground(Color.BLACK);
		setResizable(false);
		setBounds(100, 100, 353, 144);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel labelNotificacion = new JLabel(mensaje);
			contentPanel.add(labelNotificacion);
		}
		{
			{
				this.setVisible(false);
				this.dispose();
			}
		}
	}

}
