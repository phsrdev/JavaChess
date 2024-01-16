/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedrochess.chess;

/**
 *
 * @author phsr
 */


import pedrochess.boardgame.BoardExeption;

// Custom exception class for chess-related errors, extends BoardException
public class ChessException extends BoardExeption {
        
        // Generated serial version UID
	private static final long serialVersionUID = 1L;
	
        // Constructor that takes an error message and passes it to the superclass constructor
	public ChessException(String msg) {
		super(msg);
	}
}
