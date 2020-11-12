package chess;

import java.io.PrintStream;

public class BoardVisualizer {
	
	private PrintStream printer;
	private Board board;
	
	public BoardVisualizer(Board board, PrintStream printer) {
		this.printer = printer;
		this.board = board;
	}
	
	public void print(String string) {
		printer.print(string);
	}

	public void print() {
		printer.print(renderColumnsHeader() + "\n");
		printer.print("   ");
		printer.print(renderRowPartialBottomNoVerticals() + "\n");
		
		for (int i = 0; i < board.BOARD_SIZE; i++) {
			printer.print("   ");
			printer.print(renderRowPartialTop() + "\n");
			
			printer.print(renderRowHeader(board.BOARD_SIZE-i));
			printer.print(renderRowPartialCenter(i));
			printer.print(renderRowHeader(board.BOARD_SIZE-i) + "\n");

			printer.print("   ");
			printer.print(renderRowPartialBottom() + "\n");
		}
		printer.print("\n");
		printer.print(renderColumnsHeader() + "\n");
		
	}

	private String renderRowPartialTop() {
		StringBuffer string = new StringBuffer();
		for (int i = 0; i < board.BOARD_SIZE; i++) {
			string.append("|     ");
		}
		string.append("|");
		return string.toString();
	}
	
	private String renderRowPartialCenter(int row) {
		StringBuffer string = new StringBuffer();
		for (int i = 0; i < board.BOARD_SIZE; i++) {
			string.append("|  " + board.squares[row][i].getSymbol() + "  ");
		}
		string.append("|");
		return string.toString();
	}
	
	private String renderRowPartialBottom() {
		StringBuffer string = new StringBuffer();
		for (int i = 0; i < board.BOARD_SIZE; i++) {
			string.append("|_____");
		}
		string.append("|");
		return string.toString();
	}
	
	private String renderRowPartialBottomNoVerticals() {
		StringBuffer string = new StringBuffer();
		for (int i = 0; i < board.BOARD_SIZE; i++) {
			string.append(" _____");
		}
		return string.toString();
	}

	private String renderColumnsHeader() {
		StringBuffer string = new StringBuffer();
		string.append("    ");
		
		for (int i = 0; i < board.BOARD_SIZE; i++) {
			string.append("  " + ((char) (97+i)) + "  ");
			string.append(" ");
		}
		return string.toString();
	}
	
	public String renderRowHeader(int value) {
		return " " + value + " ";
	}
}
