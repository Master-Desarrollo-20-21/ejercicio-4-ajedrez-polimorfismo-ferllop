package chess;

public class Coordinate {

	private int x;
	private int y;

	public Coordinate(int y, int x) {
		this.x = x;
		this.y = y;
	}

	public Coordinate(Coordinate coordinate) {
		this(coordinate.getY(), coordinate.getX());
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public boolean isRelatedWith(Coordinate coordinate) {
		if (isHorizontalWith(coordinate)) {
			System.out.println("es horizontal");
		}
		if (isVerticalWith(coordinate)) {
			System.out.println("es vertical");
		}
		if (isMainDiagonalWith(coordinate)) {
			System.out.println("es main diagonal");
		}
		if (isReverseDiagonalWith(coordinate)) {
			System.out.println("es reverse diagonal");
		}
		
		return isHorizontalWith(coordinate) 
				|| isVerticalWith(coordinate) 
				|| isDiagonalWith(coordinate);
	}

	public boolean isHorizontalWith(Coordinate coordinate) {
		return this.getX() == coordinate.getX();				
	}

	public boolean isVerticalWith(Coordinate coordinate) {
		return this.getY() == coordinate.getY(); 
				
	}

	public boolean isDiagonalWith(Coordinate coordinate) {
		return isMainDiagonalWith(coordinate) || isReverseDiagonalWith(coordinate);
	}

	private boolean isMainDiagonalWith(Coordinate coordinate) {
		return (this.getX() > coordinate.getX() && this.getY() < coordinate.getY())
				|| (this.getX() < coordinate.getX() && this.getY() > coordinate.getY());
	}

	private boolean isReverseDiagonalWith(Coordinate coordinate) {
		return (this.getX() > coordinate.getX() && this.getY() > coordinate.getY())
				|| (this.getX() < coordinate.getX() && this.getY() < coordinate.getY() - 1);
	}
	
	public boolean isAfar(Coordinate coordinate, int distance) {
		assert this.isRelatedWith(coordinate);
		
		if (isVerticalWith(coordinate)) {
			System.out.println("Calculando distancia:" + Math.abs(this.getX() - coordinate.getX()));
			return Math.abs(this.getX() - coordinate.getX()) == distance;
		}
		
		return Math.abs(this.getY() - coordinate.getY()) == distance;
	}

	

	

}
