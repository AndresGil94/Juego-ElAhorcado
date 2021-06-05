package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import dbConnection.DBConnection;

public class WordsDAO extends DBConnection implements IWordsDAO {

	static Connection con = null;
	private Words selectedWord;

	public WordsDAO() {
		try {
			setSelectedWord(getRandomWord());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Words> getAllWords() throws SQLException {
		ArrayList<Words> arrayW = new ArrayList<Words>();
		con = getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM word";

		ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Words words = new Words(rs.getString("contentWord"));
			arrayW.add(words);
		}
		rs.close();
		return arrayW;
	}

	public Words getRandomWord() throws SQLException {

		return getAllWords().get(new Random().nextInt(getAllWords().size()));
	}

	public ArrayList<Integer> guessWord(String character) {
		ArrayList<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < selectedWord.getWord().length(); i++) {
			if (selectedWord.getWord().charAt(i) == Character.toLowerCase(character.toCharArray()[0])) {
				indexes.add(i);
			}
		}
		
		return indexes;
	}

	public boolean GGWP(String word) {
		if (word.contains("?")) {
			return false;
		} else {
			try {
				
				setSelectedWord(getRandomWord());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return true;
		}
	}

	public Words getSelectedWord() {
		return selectedWord;
	}

	public void setSelectedWord(Words selectedWord) {
		this.selectedWord = selectedWord;
	}

}
