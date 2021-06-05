package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ExitWindow {

	private JFrame frmTheHangmanSalida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExitWindow window = new ExitWindow();
					window.frmTheHangmanSalida.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ExitWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTheHangmanSalida = new JFrame();
		frmTheHangmanSalida.setTitle("The Hangman: Salida");
		frmTheHangmanSalida.setBounds(100, 100, 450, 188);
		frmTheHangmanSalida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTheHangmanSalida.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(255, 79, 89, 23);
		frmTheHangmanSalida.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBounds(63, 79, 89, 23);
		frmTheHangmanSalida.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u00BFEst\u00E1s seguro de que quieres salir?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 24, 434, 14);
		frmTheHangmanSalida.getContentPane().add(lblNewLabel);
	}

}
