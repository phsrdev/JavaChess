/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedrochess.boardgame;

/**
 *
 * @author phsr
 */

// Abstract class representing a chess piece
public abstract class Piece {
        
        // The position of the piece on the board
	protected Position position;
	// Reference to the board on which the piece is placed
        private Board board;
        
        // Constructor for creating a piece with an associated board
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
        
        // Getter for the associated board
	protected Board getBoard() {
		return board;
	}
        
        // Abstract method to calculate possible moves for a piece
	public abstract boolean[][] possibleMoves();
        
         // Check if a specific position is a possible move for the piece
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
        
        // Check if there is any possible move for the piece on the board
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i <mat.length; i++) {
			for (int j = 0; j <mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
