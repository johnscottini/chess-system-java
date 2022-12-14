package boardgame;

public class Board {

	public Board(int rows, int colums) {
		super();
		this.rows = rows;
		this.colums = colums;
		pieces = new Piece[rows][colums];
	}

	private int rows;
	private int colums;
	private Piece[][] pieces;
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColums() {
		return colums;
	}
	public void setColums(int colums) {
		this.colums = colums;
	}
	
	public Piece piece(int row, int column)
	{
		return pieces[row][column];
	}
	public Piece piece(Position position)
	{
		return pieces[position.getRow()][position.getColumn()];
	}
}
