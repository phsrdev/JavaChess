/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedrochess.boardgame;

/**
 *
 * @author phsr
 */


public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
        // Constructor for creating a new board with the specified number of rows and columns
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardExeption("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
        // Get the piece at the specified row and column on the board
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardExeption("Position not on the board");
		}
		return pieces[row][column];
	}
	
        // Get the piece at the specified position on the board
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardExeption("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
        // Place a piece on the board at the specified position
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardExeption("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
        // Remove and return the piece at the specified position on the board
	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardExeption("Position not on the board");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
        // Check if a position with the specified row and column exists on the board
	private boolean positionExists(int row, int column) {
		return row >= 0 && row <  rows && column >= 0 && column < columns;
	}
	
        // Check if a position exists on the board
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
        // Check if there is a piece at the specified position on the board
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardExeption("Position not on the board");
		}
		return piece(position) != null;
	}
        
        // Getter for the number of rows on the board
	public int getRows() {
		return rows;
	}

        // Getter for the number of columns on the board
	public int getColumns() {
		return columns;
	}
	
}
