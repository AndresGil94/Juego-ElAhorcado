package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ViewLogin extends JFrame {

	private JPanel contentPane;
	public JTextField textUsuario;
	public JButton btnEntrar;
	public JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin frame = new ViewLogin();
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
	public ViewLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(55, 83, 45, 13);
		contentPane.add(lblNewLabel);
		
		
		textUsuario = new JTextField();
		textUsuario.setBounds(138, 81, 241, 19);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(55, 186, 85, 21);
		contentPane.add(btnEntrar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(294, 186, 85, 21);
		contentPane.add(btnSalir);
	}

}
