package com.console;

import com.console.boardgame.Position;
import com.console.chess.ChessException;
import com.console.chess.ChessMatch;
import com.console.chess.ChessPiece;
import com.console.chess.ChessPosition;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while(true){
            try{
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.println("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.println("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            } catch (ChessException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }

    }
}
