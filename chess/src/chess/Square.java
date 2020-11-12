package chess;

public class Square {
	private Piece piece;
	
	public Square() {
		this.piece = null;
	}
	
	public void putPiece(Piece piece) {
		this.piece = piece;
	}
	
	public Piece removePiece() {
		Piece removedPiece = piece.clone();
		if (piece != null) {
			 removedPiece = piece;			
		}
		putPiece(null);
		return removedPiece;
	}

	public String getSymbol() {
		if (piece != null) {
			return "" + piece.getSymbol();
		}
		
		return " ";
	}

	public boolean hasPlayer(Player player) {
		return piece != null && piece.pertainsToPlayer(player);
	}
	
	public Piece getPiece() {
		return piece;
	}
	
}
