package chess;

import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class Initializer {
	
	Board board;
	Color color;
	
	public Initializer(Board board, Color color) {
		this.board = board;
		this.color = color;
	}

	public void init() {
		initPawns();
		initRooks();
		initBishops();
		initKnights();
		initQueen();
		initKing();	
	};	
	
	private int whiteOrBlackRow(int whiteRow, int blackRow) {
		if ( color == Color.WHITE) {
			return  whiteRow;
		}
		return blackRow;
	}

	private int whiteOrBlackRow() {
		return whiteOrBlackRow(7, 0);
	}

	private void initRooks() {
		this.board.putPiece(new Coordinate(0, this.whiteOrBlackRow()), new Rook(color));
		this.board.putPiece(new Coordinate(7, this.whiteOrBlackRow()), new Rook(color));
	}

	private void initKnights() {
		this.board.putPiece(new Coordinate(1, this.whiteOrBlackRow()), new Knight(color));
		this.board.putPiece(new Coordinate(6, this.whiteOrBlackRow()), new Knight(color));
	}

	private void initBishops() {
		this.board.putPiece(new Coordinate(2, this.whiteOrBlackRow()), new Bishop(color));
		this.board.putPiece(new Coordinate(5, this.whiteOrBlackRow()), new Bishop(color));
	}

	private void initKing() {
		this.board.putPiece(new Coordinate(3, this.whiteOrBlackRow()), new King(color));		
	}

	private void initQueen() {
		this.board.putPiece(new Coordinate(4, this.whiteOrBlackRow()), new Queen(color));		
	}
	
	private void initPawns() {
		for(int i = 0; i<8; i++) {
			this.board.putPiece(new Coordinate(i, this.whiteOrBlackRow(6, 1)), new Pawn(color));	
		}
	}
}
