package model;

public class Player implements Comparable<Player>{

	private int id;
	private String name;
	private int score;
	private int failures = 0;

	public Player() {
		
	}

	public Player(String name) {
		setName(name);
	}

	public Player(String name, int score) {
		setName(name);
		setScore(score);
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	

	public int getFailures() {
		return failures;
	}

	public void setFailures(int failures) {
		this.failures = failures;
	}
	
	public void incFailures() {
		failures++;
	}

	@Override
	public int compareTo(Player player) {
		if(score < player.getScore()) {
			return -1;
		} else {
			return 1;
		}
	}

	
}
