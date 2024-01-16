/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedrochess.chess;

/**
 *
 * @author phsr
 */

import pedrochess.boardgame.Position;

// This class represents a position on the chessboard.
public class ChessPosition {

	private char column;
	private int row;
	
        // Constructor validates and sets the column and row.
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8. ");
		}
		this.column = column;
		this.row = row;
	}
        
        // Gets the column of the chess position.
	public char getColumn() {
		return column;
	}
        
        // Gets the row of the chess position.
	public int getRow() {
		return row;
	}
        
        // Converts ChessPosition to Position, adjusting for array indices.
	protected Position toPosition() {
		
		return new Position(8 - row, column - 'a');
	}
	
        // Converts Position to ChessPosition, adjusting for array indices.
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}
	
        // Overrides the toString method to display the chess position.
	@Override
	public String toString() {
		return "" + column + row;
	}
}
