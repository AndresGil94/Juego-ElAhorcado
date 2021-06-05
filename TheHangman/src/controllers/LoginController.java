package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import executable.Exe;
import model.Player;
import model.PlayerDAO;
import view.ViewLogin;

public class LoginController implements ActionListener {

	private ViewLogin view;
	private Player model;

	public LoginController(ViewLogin view) {

		this.view = view;
		this.view.btnEntrar.addActionListener(this);
		this.view.btnSalir.addActionListener(this);
	}

	public void start() {

		view.setLocationRelativeTo(null);
		view.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == view.btnEntrar) {
			PlayerDAO playerD = new PlayerDAO();
			Exe exe = new Exe();
			model = new Player();
			model.setName(view.textUsuario.getText());
			if (playerD.createPlayer(model)) {
				try {
					model.setId(playerD.getLastPlayer().getId());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				exe.showPrincipalWindow(model);
				view.dispose();

			} else {
				JOptionPane.showMessageDialog(view, "Escriba un nombre.");
			}

		}
		if (e.getSource() == view.btnSalir) {
			view.dispose();
			System.exit(0);
		}
	}
}
