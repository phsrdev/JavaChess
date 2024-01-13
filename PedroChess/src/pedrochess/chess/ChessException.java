package pedrochess.chess;

import pedrochess.boardgame.BoardExeption;

public class ChessException extends BoardExeption {

	private static final long serialVersionUID = 1L;
	
	public ChessException(String msg) {
		super(msg);
	}
}
