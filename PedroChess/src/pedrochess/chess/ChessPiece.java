/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedrochess.chess;

/**
 *
 * @author phsr
 */

import pedrochess.boardgame.Board;
import pedrochess.boardgame.Piece;
import pedrochess.boardgame.Position;

//This abstract class represents a chess piece and extends the general Piece class.
public  abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;
        
        // Constructor initializes the chess piece with its color and the board
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	} 
        
        // Gets the color of the chess piece
	public Color getColor() {
		return color;
	}
	
        // Gets the number of moves made by the chess piece
	public int getMoveCount() {
		return moveCount;
	}
	
        // Increases the move count of the chess piece
	public void increaseMoveCount() {
		moveCount++;
	}
	
        // Decreases the move count of the chess piece
	public void decreaseMoveCount() {
		moveCount--;
	}
	
        // Gets the chess position of the piece
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
        // Checks if there is an opponent's piece at the specified position
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
		
	}
}
