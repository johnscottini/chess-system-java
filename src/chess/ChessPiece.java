package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	private int moveCount;
	public int getMoveCount() {
		return moveCount;
	}
	public void increaseMoveCount()
	{
		moveCount++;
	}
	public void decreaseMoveCount()
	{
		moveCount--;
	}
	private Color color;
	

	public Color getColor() {
		return color;
	}

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

}
