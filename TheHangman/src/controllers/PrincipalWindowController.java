package controllers;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import dbConnection.DBConnection;
import executable.Exe;
import model.Player;
import model.PlayerDAO;
import model.Words;
import model.WordsDAO;
import view.ViewPrincipal;

public class PrincipalWindowController extends DBConnection implements ActionListener {

	private ViewPrincipal view;
	private Exe exe;
	private WordsDAO wDao;
	private PlayerDAO pDao;
	private Player model;

	public PrincipalWindowController(ViewPrincipal view, Player model) {

		this.view = view;
		this.view.btnInfo.addActionListener(this);
		this.view.btnRanking.addActionListener(this);
		this.view.btnExit.addActionListener(this);
		wDao = new WordsDAO();
		pDao = new PlayerDAO();
		this.model = model;

	}

	public void start() {
		view.setTitle("Proyecto Andrés");
		view.setLocationRelativeTo(null);
		paintInterrogants();

		// Sentencia SQL
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == view.btnRanking) {
			Exe exe = new Exe();
			try {
				exe.showRankingWindow();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		if (e.getSource() == view.btnInfo) {
			Exe exe = new Exe();
			view.dispose();
			exe.showInfo();
	}		

		if (e.getSource() == view.btnExit) {
			pDao.updatePlayer(model);
			view.dispose();
			System.exit(0);
		}
	}

	public void paintInterrogants() {
		StringBuilder aux = new StringBuilder(wDao.getSelectedWord().getWord());
		Random r = new Random();
		int interrogantCounter = 0;

		for (int i = 0; i < aux.length() && interrogantCounter < 3; i++) {
			aux.setCharAt(r.nextInt(aux.length()), '?');
			interrogantCounter++;
		}

		view.lblGuess.setText(aux.toString());
	}

	public void guessResult(JButton b) {
		ArrayList<Integer> aux = wDao.guessWord(b.getText());
		if (aux.isEmpty()) {
			model.incFailures(); 
			changeImage(model);
			if(model.getFailures() >= 5){
				changeImage(model);
				JOptionPane.showMessageDialog(null, "GAME OVER");
				System.exit(0);
			}
		} else {
			String lblText = view.lblGuess.getText();
			StringBuilder auxSelectedWord = new StringBuilder(lblText);
			for (int i = 0; i < aux.size(); i++) {
				auxSelectedWord.setCharAt(aux.get(i), wDao.getSelectedWord().getWord().charAt(aux.get(i)));
			}
			view.lblGuess.setText(auxSelectedWord.toString());
			if (wDao.GGWP(view.lblGuess.getText())) {
				pDao.addScore(model);
				start();
			}
		}
	}
	
	public void changeImage(Player player) {
		/*ArrayList<ImageIcon> images = new ArrayList<>();
		images.add(new ImageIcon("/ahorcado2.jpg"));
		images.add(new ImageIcon("/ahorcado3.jpg"));
		images.add(new ImageIcon("/ahorcado4.jpg"));
		images.add(new ImageIcon("/ahorcado5.jpg"));
		
		view.lblImage.setIcon(images.get(player.getFailures() - 1));*/
		
		ArrayList<String> images = new ArrayList<>();
		images.add("/ahorcado2.jpg");
		images.add("/ahorcado3.jpg");
		images.add("/ahorcado4.jpg");
		images.add("/ahorcado5.jpg");
		images.add("/ahorcadoMuerto.jpg");
		
		Image img = new ImageIcon(this.getClass().getResource(images.get(model.getFailures() - 1))).getImage();
		view.lblImage.setIcon(new ImageIcon(img));
	}

	public ViewPrincipal getView() {
		return view;
	}

	public void setView(ViewPrincipal view) {
		this.view = view;
	}
	
	


}
