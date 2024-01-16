/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedrochess;

/**
 *
 * @author phsr
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import pedrochess.chess.ChessException;
import pedrochess.chess.ChessMatch;
import pedrochess.chess.ChessPiece;
import pedrochess.chess.ChessPosition;

public class PedroChess {

    public static void main(String[] args) {

        // Set up Scanner for user input
        Scanner sc = new Scanner(System.in);
        
        // Welcome message and tutorial
        System.out.println("Welcome to Pedro Chess!");
        System.out.println("To make a move, enter the source and target positions following the format 'a2 a4'.");
        System.out.println("If a pawn reaches the opposite side, you'll be prompted to choose a piece for promotion.");
        System.out.println("Piece codes: B - Bishop, N - Knight, R - Rook, Q - Queen");
        System.out.println("Let's start the game!");

        // Create ChessMatch instance to manage the chess game
        ChessMatch chessMatch = new ChessMatch();

        // List to store captured pieces
        List<ChessPiece> captured = new ArrayList<>();

        // Main game loop
        while (!chessMatch.getCheckMate()) {
            try {
                // Clear the console screen
                UI.clearScreen();

                // Print current state of the game
                UI.printMatch(chessMatch, captured);
                System.out.println();

                // Prompt user for source position
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                // Get possible moves for the selected piece
                boolean[][] possibleMoves = chessMatch.possibleMoves(source);

                // Clear the console screen
                UI.clearScreen();

                // Print the chessboard with possible moves highlighted
                UI.printBoard(chessMatch.getPieces(), possibleMoves);
                System.out.println();

                // Prompt user for target position
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                // Perform the chess move and capture the piece if applicable
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);

                // If a piece was captured, add it to the list
                if (capturedPiece != null) {
                    captured.add(capturedPiece);
                }

                // If a pawn is promoted, prompt user for the new piece type
                if (chessMatch.getPromoted() != null) {
                    System.out.println("Enter piece for promotion (B/N/R/Q): ");
                    String type = sc.nextLine().toUpperCase();
                    chessMatch.replacePromotedPiece(type);
                }
            } catch (ChessException e) {
                // Handle chess-specific exceptions
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                // Handle input mismatch exceptions
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }

        // Game over, clear screen and print final state
        UI.clearScreen();
        UI.printMatch(chessMatch, captured);
    }
}
