package chess;

import java.io.PrintStream;

public class Board {
	
	public Square[][] squares;
	public final int BOARD_SIZE = 8;
	
	
	public Board() {
		this.squares = new Square[BOARD_SIZE][BOARD_SIZE];
		
		
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < squares[i].length; j++) {
				squares[i][j] = new Square();				
			}
		}
	}
	
	public void print(PrintStream visualizer) {
		new BoardVisualizer(this, visualizer).print();
	}
	
	public void removePiece(Coordinate coordinate) {
		this.getSquare(coordinate).removePiece();
	}

	public void putPiece(Coordinate coordinate, Piece piece) {
		this.getSquare(coordinate).putPiece(piece);
	}
	
	public void movePiece(Coordinate origin, Coordinate destination) {
		Piece piece = this.getSquare(origin).removePiece();
		this.getSquare(destination).putPiece(piece);
	}
	
	public Piece getPiece(Coordinate coordinate) {
		return this.getSquare(coordinate).getPiece();
	}
	
	public Square getSquare(Coordinate coordinate) {
		return this.squares[coordinate.getX()][coordinate.getY()];
	}
	public Square getSquare(int x, int y) {
		return this.getSquare(new Coordinate(x,y));
	}
	
	public boolean isKingAlive(Player player) {
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				if (this.getSquare(i,j).getPiece().isKing() 
					&& this.getSquare(i,j).hasPlayer(player)) {
					return true;
				}
			}
		}
		return false;
	}	
}
