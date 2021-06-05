package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;



import dbConnection.DBConnection;

public class PlayerDAO extends DBConnection implements IPlayerDAO {

	static Connection con = null;

	@Override
	public boolean createPlayer(Player player) {
		PreparedStatement ps = null;
		Connection con = getConnection();
		String sql = "INSERT INTO `bdahorcado`.`jugador` (`nombreJugador`) VALUES (?);";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, player.getName());
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}

	}

	@Override
	public boolean resetScore(Player player) {

		con = getConnection();
		String sql = "UPDATE player SET Score=0 WHERE Id=?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, player.getId());
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}

	@Override
	public boolean updatePlayer(Player player) {

		con = getConnection();
		String sql = "UPDATE jugador SET puntuacionJugador = ? WHERE idJugador = ?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, player.getScore());
			ps.setInt(2, player.getId());
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.err.println(e);
			return false;

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println(e);
			}
		}
	}

	@Override
	public ArrayList<Player> getAllPlayers() throws SQLException {

		ArrayList<Player> arrayP = new ArrayList<Player>();
		con = getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM jugador";

		ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Player player = new Player(rs.getString("nombreJugador"), rs.getInt("puntuacionJugador"));
			arrayP.add(player);
		}
		rs.close();
		return arrayP;
	}
	
	public Player getLastPlayer() throws SQLException {
		Player player = null;
		con = getConnection();
		PreparedStatement ps = null;
		String sql = "SELECT * FROM jugador ORDER BY idJugador DESC LIMIT 1";
		ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			player = new Player(rs.getString("nombreJugador"), rs.getInt("puntuacionJugador"));
			player.setId(rs.getInt("idJugador"));
			
		}
		rs.close();
		return player;
		
		
	}
	
	@Override
	public ArrayList<Player> getAllPlayersByRanking() throws SQLException {

		ArrayList<Player> aux = getAllPlayers();
		Collections.sort(aux);
		
		return aux;
	}

	public void addScore(Player player) {
		player.setScore(player.getScore() + 1);
		
	}
	

}
