package executable;


import java.sql.SQLException;

import controllers.InfoController;
import controllers.LoginController;
import controllers.PrincipalWindowController;
import controllers.RankingController;
import controllers.WelcomeController;
import model.Player;
import model.PlayerDAO;
import model.WordsDAO;
import view.ViewInfo;
import view.ViewLogin;
import view.ViewPrincipal;
import view.ViewRanking;
import view.ViewWelcome;

public class Exe {
	
	WordsDAO wDao = new WordsDAO();
	static ViewRanking rankingView = new ViewRanking();
	static ViewLogin viewLogin = new ViewLogin();
	static ViewPrincipal principalView = new ViewPrincipal();
	static ViewWelcome welcomeView = new ViewWelcome();
	static ViewInfo viewInfo = new ViewInfo();
	Player playerModel = new Player();
	PlayerDAO playerD = new PlayerDAO();
	
	
	
	
	public static void main(String[] args) {

		WelcomeController wc = new WelcomeController(welcomeView);
		wc.start();
		welcomeView.setVisible(true);
			
		}
	public void showLogin() {
	LoginController lc = new LoginController(viewLogin);
	lc.start();
	viewLogin.setVisible(true);
	}
	public void showPrincipalWindow(Player player) {
		
		
		PrincipalWindowController pwc = new PrincipalWindowController(principalView, player);
		pwc.start();
		principalView.setPWC(pwc);
		principalView.setVisible(true);
	}
	public void showInfo() {
		InfoController infoC = new InfoController(viewInfo);
		infoC.start();
		viewInfo.setVisible(true);
		}
	public void showRankingWindow() throws SQLException{
		
		RankingController pwc = new RankingController(rankingView, playerD, playerModel);
		pwc.start();
		rankingView.setVisible(true);
	}
	
}
