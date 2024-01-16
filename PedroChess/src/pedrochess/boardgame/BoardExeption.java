/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedrochess.boardgame;

/**
 *
 * @author phsr
 */

// Custom exception class for board-related errors
public class BoardExeption extends RuntimeException {
        
        // Generated serial version UID
	private static final long serialVersionUID = 1L;
	
        // Constructor that takes an error message
	public BoardExeption(String msg) {
            // Pass the error message to the superclass constructor
            super(msg);
	}

}
