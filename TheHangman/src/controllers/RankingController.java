package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.table.DefaultTableModel;

import executable.Exe;
import model.Player;
import model.PlayerDAO;
import view.ViewRanking;

public class RankingController implements ActionListener {

	
	private ViewRanking view;
	private Exe exe;
	private PlayerDAO dao;
	private Player model;
	
	public RankingController(ViewRanking view,PlayerDAO dao,Player model) {
		
		this.view = view;
		this.dao = dao;
		this.model = model;
		this.view.btnVolver.addActionListener(this);
	}

	public void start() throws SQLException {
		
		view.setLocationRelativeTo(null);
		view.setLocationRelativeTo(null);
		ArrayList<Player> arrayp = dao.getAllPlayersByRanking();
		arrayp.sort(Comparator.comparing(Player::getScore).reversed());
		DefaultTableModel tableAux = (DefaultTableModel) view.table.getModel();
		Object[] row = new Object[2];
		for (int i = 0; i < arrayp.size(); i++) {
		row[0] = arrayp.get(i).getScore();
		row[1] = arrayp.get(i).getName();
		tableAux.addRow(row);

		}
		view.table.setModel(tableAux);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == view.btnVolver) {
			view.dispose();

			
		
	}
	
	
}
}