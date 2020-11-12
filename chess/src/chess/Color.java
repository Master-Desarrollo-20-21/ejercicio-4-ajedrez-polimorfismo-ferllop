package chess;

public enum Color {
	WHITE(0),
	BLACK(1); 
	
	private int key;
	
	private Color(int key) {
		this.key = key;
	}
}
