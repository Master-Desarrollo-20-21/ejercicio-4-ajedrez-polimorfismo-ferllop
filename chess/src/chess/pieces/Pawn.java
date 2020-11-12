package chess.pieces;

import chess.Color;
import chess.Coordinate;
import chess.Piece;

public class Pawn extends Piece {
	private boolean firstMovement;
	
	public Pawn(Color color) {
		super(color, new char[]{'P', 'p'});
		this.firstMovement = true;
	}
	public Pawn(Pawn pawn) {
		super(pawn);
	}
	private boolean isFirstMovement() {
		if (firstMovement) {
			firstMovement = false;
			return true;
		}
		
		return false;
	}
	
	@Override
	 public Piece clone(){
		return new Pawn(this);
	}
	@Override
	public boolean isValidMovement(Coordinate origin, Coordinate destination) {
		return origin.isVerticalWith(destination) && 
				(
					(this.isFirstMovement() && origin.isAfar(destination, 2)) 
					|| origin.isAfar(destination, 1)
				);
	}
	@Override
	public boolean isKing() {
		return false;
	}
}
