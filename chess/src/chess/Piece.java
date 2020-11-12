package chess;

public abstract class Piece {
	
	private char symbol;
	private Color color;
//	protected MovementPolicy movementPolicy;
	
	
	public Piece(Color color, char[] symbols) {
		this.symbol = renderSymbol(color, symbols);
		this.color = color;	
//		this.movementPolicy = movementPolicy;
	}
	
	public Piece(Piece piece) {
		this.symbol = piece.symbol;
		this.color = piece.color;		
	}
	
	public char getSymbol() {
		return symbol;
	}
	
	private char renderSymbol(Color color, char[] symbols) {
		if ( color == Color.WHITE) {
			return  symbols[0];
		}
		return symbols[1];
	}
	
	public boolean pertainsToPlayer(Player player) {
		return player.getColor() == color;
	}
	
	public abstract Piece clone();
	public abstract boolean isValidMovement(Coordinate origin, Coordinate destination);
	public abstract boolean isKing();
	
}
