package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class RetryWindow {

	private JFrame frmTheHangmanPerdiste;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetryWindow window = new RetryWindow();
					window.frmTheHangmanPerdiste.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RetryWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTheHangmanPerdiste = new JFrame();
		frmTheHangmanPerdiste.setTitle("The Hangman: Perdiste");
		frmTheHangmanPerdiste.setBounds(100, 100, 450, 300);
		frmTheHangmanPerdiste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTheHangmanPerdiste.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00BFQuieres Jugar otra partida?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 81, 434, 14);
		frmTheHangmanPerdiste.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Otra Partida");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(163, 208, 110, 23);
		frmTheHangmanPerdiste.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBounds(305, 208, 89, 23);
		frmTheHangmanPerdiste.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ranking");
		btnNewButton_2.setBounds(40, 208, 89, 23);
		frmTheHangmanPerdiste.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("PERDISTE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 26, 434, 23);
		frmTheHangmanPerdiste.getContentPane().add(lblNewLabel_1);
	}

}
