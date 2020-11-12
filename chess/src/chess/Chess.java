package chess;

import java.io.PrintStream;

public class Chess {
	private Board board;
	private Game game;
	private PrintStream visualizer;
	
	public Chess(PrintStream visualizer) {
		this.visualizer = visualizer;
		this.board = new Board();
		this.game = new Game(board);
	}
	
	public void play() {
		do {
			board.print(visualizer);
			game.move();
		} while (!game.isOver());
		
		System.out.println("GAME IS OVER");
	}
	
	public static void main(String[] args) {
		new Chess(System.out).play();
	}
}
