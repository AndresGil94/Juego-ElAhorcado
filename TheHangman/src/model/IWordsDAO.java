package model;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IWordsDAO {

	public ArrayList<Words> getAllWords() throws SQLException;

}
