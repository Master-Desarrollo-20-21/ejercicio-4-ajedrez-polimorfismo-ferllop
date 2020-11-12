package chess;

public class Game {
	
	private Board board;
	private Turn turn;
	private Player[] players;
	
	public Game(Board board) {
		this.board = board;
		turn = new Turn();
		players = new Player[] { new Player(Color.WHITE), new Player(Color.BLACK) };
		for (int i = 0; i < players.length; i++) {
			new Initializer(board, players[i].getColor()).init();
		}
	}
	
	public void move() {
		Movement movement;
		Player player = turn.changeToNext(players);
		do{
			movement = player.getMovement(board);			
		} while (!movement.isValid());
		movement.move();
		
	}
	
	public boolean isOver() {
		if (!board.isKingAlive(turn.getPlayer(players))) {
			System.out.println("Ganan las que no son " + turn.getPlayer(players).getColor());
			return true;
		}
		return false;
	}
}
