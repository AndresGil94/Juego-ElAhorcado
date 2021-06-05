package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import executable.Exe;
import view.ViewInfo;

public class InfoController implements ActionListener{

	private ViewInfo view;
	
	public InfoController(ViewInfo view) {
		
		this.view = view;
		this.view.btnVolver.addActionListener(this);
	}
	public void start() {
		

		view.setLocationRelativeTo(null);
		view.setVisible(true);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == view.btnVolver) {
			view.dispose();
		
		
	}
	
	}
	
}
