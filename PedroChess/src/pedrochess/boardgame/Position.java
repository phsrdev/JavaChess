/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedrochess.boardgame;

/**
 *
 * @author phsr
 */

// Class representing a position on a chessboard
public class Position {
        
        // Row and column coordinates of the position
	private int row;
	private int column;
	
        // Constructor for creating a position with specified row and column
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
        // Method to set values for the row and column of the position
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}

        // Getter for the row coordinate
	public int getRow() {
		return row;
	}
        
        // Setter for the row coordinate
	public void setRow(int row) {
		this.row = row;
	}
        
        // Getter for the column coordinate
	public int getColumn() {
		return column;
	}
        
        // Setter for the column coordinate
	public void setColumn(int column) {
		this.column = column;
	}
	
        // Override toString method to represent the position as a string
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}
