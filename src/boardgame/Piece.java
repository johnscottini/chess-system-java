package boardgame;

public class Piece {
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Position position;
	private Board board;

	protected Board getBoard() {
		return board;
	}
	
}
