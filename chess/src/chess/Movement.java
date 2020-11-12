package chess;

public class Movement {
	private Coordinate origin;
	private Coordinate destination;
	private Board board;
	private Player player;
	
	
	public Movement(Coordinate origin, Coordinate destination, Board board, Player player) {
		this.origin = origin;
		this.destination = destination;		
		this.board = board;
		this.player = player;
	}
	
	public boolean isValid() {
		return checkOrigin() && checkDestination() && checkMovementType();
	}
	
	private boolean checkOrigin() {
		return board.getSquare(origin).hasPlayer(player);
	}
	
	private boolean checkDestination() {
		return !board.getSquare(destination).hasPlayer(player);
	}
	
	private boolean checkMovementType() {
		return board.getPiece(origin).isValidMovement(this.origin, this.destination);
//		return true;
	}
	
	public void move() {
		board.movePiece(origin, destination);		
	}
	
	
}
