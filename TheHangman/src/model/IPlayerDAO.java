package model;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IPlayerDAO {

	public boolean createPlayer(Player player);
	public boolean resetScore(Player player);
	public boolean updatePlayer(Player player);
	public ArrayList<Player> getAllPlayers() throws SQLException;
	public ArrayList<Player> getAllPlayersByRanking() throws SQLException;
}
