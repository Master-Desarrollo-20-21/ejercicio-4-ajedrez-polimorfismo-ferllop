package chess.pieces;

import chess.Color;
import chess.Coordinate;
import chess.Piece;

public class Rook extends Piece {
	public Rook(Color color) {
		super(color, new char[] {'R', 'r'});
	}
	
	public Rook(Rook rook) {
		super(rook);
	}
	
	@Override
	 public Piece clone(){
		return new Rook(this);
	}
	
	@Override
	public boolean isValidMovement(Coordinate origin, Coordinate destination) {
		return origin.isHorizontalWith(destination) || origin.isVerticalWith(destination);
	}
	
	@Override
	public boolean isKing() {
		return false;
	}
	
}
