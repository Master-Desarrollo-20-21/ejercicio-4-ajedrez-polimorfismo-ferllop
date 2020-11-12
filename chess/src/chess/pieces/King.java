package chess.pieces;

import chess.Color;
import chess.Coordinate;
import chess.Piece;

public class King extends Piece {
	
	public King(Color color) {
		super(color, new char[]{'K', 'k'});
	}
	
	public King(King king) {
		super(king);
	}
	
	@Override
	 public Piece clone(){
		return new King(this);
	}
	@Override
	public boolean isValidMovement(Coordinate origin, Coordinate destination) {
		return origin.isAfar(destination, 1);
	}
	@Override
	public boolean isKing() {
		return true;
	}
}
