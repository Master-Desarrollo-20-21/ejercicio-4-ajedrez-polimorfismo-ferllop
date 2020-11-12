package chess.pieces;

import chess.Color;
import chess.Coordinate;
import chess.Piece;

public class Knight extends Piece {
	
	public Knight(Color color) {
		super(color, new char[]{'C', 'c'});
	}
	
	public Knight(Knight knight) {
		super(knight);
	}
	
	@Override
	 public Piece clone(){
		return new Knight(this);
	}
	
	@Override
	public boolean isValidMovement(Coordinate origin, Coordinate destination) {
		return true;
	}
	
	@Override
	public boolean isKing() {
		return false;
	}
}
