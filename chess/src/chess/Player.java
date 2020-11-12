package chess;

import java.util.Scanner;

import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class Player {
	private Color color;
	
	public Player(Color color) {
		this.color = color;
	}

	public Movement getMovement(Board board) {
		System.out.println("Mueven las " + color);
		Movement movement;
		do {
			movement = new Movement(this.getOrigin(board), this.getCoordinate("destino"), board, this);
		} while (movement.isValid());
		return movement;
	}	
	
	private Coordinate getOrigin(Board board) {
		Coordinate coordinate;
		do {
			coordinate = getCoordinate("origen");
		} while (!board.getSquare(coordinate).hasPlayer(this));
		
		return coordinate;
	}
	
	private Coordinate getCoordinate(String title) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una fila " + title + ": ");
		int row = sc.nextInt();
		System.out.print("Introduce una columna " + title + ": ");
		int column = sc.nextInt();
//		sc.close();
		return new Coordinate(column, row);
	}	
	
	public Color getColor() {
		return color;
	}
	
}
