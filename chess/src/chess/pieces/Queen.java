package chess.pieces;

import chess.Color;
import chess.Coordinate;
import chess.Piece;

public class Queen extends Piece {
	public Queen(Color color) {
		super(color, new char[]{'Q', 'q'});
	}
	
	public Queen(Queen queen) {
		super(queen);
	}
	
	@Override
	 public Piece clone(){
		return new Queen(this);
	}
	
	@Override
	public boolean isValidMovement(Coordinate origin, Coordinate destination) {
		return origin.isRelatedWith(destination);
	}
	
	@Override
	public boolean isKing() {
		return false;
	}
}
