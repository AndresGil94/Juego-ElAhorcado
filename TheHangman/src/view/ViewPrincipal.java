
package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.PrincipalWindowController;
import model.WordsDAO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;

public class ViewPrincipal extends JFrame {

	private PrincipalWindowController pwc;
	private JPanel contentPane;
	public JButton btnRanking;
	public JButton btnInfo;
	public JButton btnExit;
	public JButton btnA;
	public JButton btnB;
	public JButton btnC;
	public JButton btnD;
	public JButton btnE;
	public JButton btnF;
	public JButton btnG;
	public JButton btnH;
	public JButton btnI;
	public JButton btnJ;
	public JButton btnK;
	public JButton btnL;
	public JButton btnM;
	public JButton btnN;
	public JButton btn—;
	public JButton btnO;
	public JButton btnP;
	public JButton btnQ;
	public JButton btnR;
	public JButton btnS;
	public JButton btnT;
	public JButton btnU;
	public JButton btnV;
	public JButton btnW;
	public JButton btnX;
	public JButton btnY;
	public JButton btnZ;
	public JLabel lblImage;
	public JLabel lblGuess;

	/**
	 * Create the frame.
	 */
	public ViewPrincipal() {
		
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnRanking = new JButton("Ranking");
		btnRanking.setBounds(171, 450, 71, 21);
		contentPane.add(btnRanking);
		
		btnInfo = new JButton("Info");
		btnInfo.setBounds(405, 9, 85, 21);
		contentPane.add(btnInfo);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(97, 450, 64, 21);
		contentPane.add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setBounds(97, 289, 319, 150);
		contentPane.add(panel);
		
		btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnA);
			}});
		panel.add(btnA);
		
		btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnB);
					
			}
		});
		panel.add(btnB);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnC);

			}});
		panel.add(btnC);
		
		btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnD);

			}});
		panel.add(btnD);
		
		btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnE);

			}});
		panel.add(btnE);
		
		btnF = new JButton("F");
				btnF.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pwc.guessResult(btnF);

					}});;
		panel.add(btnF);
		
		btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnG);

			}});
		panel.add(btnG);
		
		btnH = new JButton("H");
		btnH.setForeground(Color.BLACK);
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnH);

			}});
		panel.add(btnH);
		
		btnI = new JButton("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnI);

			}});
		panel.add(btnI);
		
		btnJ = new JButton("J");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnJ);

			}});
		panel.add(btnJ);
		
		btnK = new JButton("K");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnK);

			}});
		panel.add(btnK);
		
		btnL = new JButton("L");
		btnL.setForeground(Color.BLACK);
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnL);

			}});
		panel.add(btnL);
		
		btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnM);

			}});
		panel.add(btnM);
		
		btnN = new JButton("N");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnN);

			}});
		panel.add(btnN);
		
		
		btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnO);

			}
		});
		panel.add(btnO);
		
		btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnP);

			}});
		panel.add(btnP);
		
		btnQ = new JButton("Q");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnQ);

			}});
		panel.add(btnQ);
		
		btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnR);

			}});
		panel.add(btnR);
		
		btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnS);

			}});
		panel.add(btnS);
		
		btnT = new JButton("T");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnT);

			}});
		panel.add(btnT);
		
		btnU = new JButton("U");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnU);

			}});
		panel.add(btnU);
		
		btnV = new JButton("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnV);

			}});
		panel.add(btnV);
		
		
		btnW = new JButton("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnW);

			}});
		panel.add(btnW);
		
		btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnX);

			}});
		
		
		panel.add(btnX);
		
		btnY = new JButton("Y");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnY);

			}});
		panel.add(btnY);
		
		btnZ = new JButton("Z");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwc.guessResult(btnZ);

				
			}});
		panel.add(btnZ);
		
		lblImage = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/ahorcado1.jpg")).getImage();
		lblImage.setIcon(new ImageIcon(img));
		lblImage.setBounds(110, 44, 276, 224);
		contentPane.add(lblImage);
		
		JButton btnComenzar = new JButton("Comenzar");
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComenzar.setBounds(308, 448, 108, 23);
		contentPane.add(btnComenzar);
		
		lblGuess = new JLabel("");
		lblGuess.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGuess.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuess.setBounds(145, 12, 207, 41);
		contentPane.add(lblGuess);
	}
	
	public void setPWC(PrincipalWindowController pwc) {
		this.pwc = pwc;
	}
}
