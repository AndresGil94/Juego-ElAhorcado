package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import executable.Exe;
import view.ViewWelcome;

public class WelcomeController implements ActionListener {

	private Exe exe;
	private ViewWelcome view;
	public WelcomeController(ViewWelcome view) {
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
			Exe exe = new Exe();
			view.dispose();
			exe.showLogin();
		}

		if (e.getSource() == view.btnSalir) {
				view.dispose();
				System.exit(0);
			}	
	}
	
	
}
