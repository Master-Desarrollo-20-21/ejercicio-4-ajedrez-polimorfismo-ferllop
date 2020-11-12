package chess;

public class Turn {
	private int turn;
	
	public Turn() {
		turn = 1;
	}
	
	public Player changeToNext(Player[] players) {
		this.toggleTurn();
		return getPlayer(players);
	}
	
	public Player getPlayer(Player[] players) {
		return players[turn];
	}
	
	private void toggleTurn() {
		turn = getNextTurn();
	}
	
	private int getNextTurn() {
		if (turn == 0) {
			return 1;
		}
		
		return 0;
	}
}
