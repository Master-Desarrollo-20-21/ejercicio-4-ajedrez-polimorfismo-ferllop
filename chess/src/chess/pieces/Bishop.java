package chess.pieces;

import chess.Color;
import chess.Coordinate;
import chess.Piece;

public class Bishop extends Piece {
	public Bishop(Color color) {
		super(color, new char[]{'B', 'b'});	
	}
	
	public Bishop(Bishop bishop) {
		super(bishop);
	}
	
	@Override
	 public Piece clone(){
		return new Bishop(this);
	}
	
	@Override
	public boolean isValidMovement(Coordinate origin, Coordinate destination) {
		return origin.isDiagonalWith(destination);
	}

	@Override
	public boolean isKing() {
		return false;
	}
	
}
