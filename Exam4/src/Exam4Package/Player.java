package Exam4Package;

public class Player {
	public String player;
	public Die die;
	
	
	
	
	public Player(String player, Die die) {
		this.player = player;
		this.die = die;
	}




	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public Die getDie() {
		return die;
	}

	public void setDie(Die die) {
		this.die = die;
	}
	
	public int getScore() {
//		int value = die.getValue();
		return die.getValue();
	}
	
}
