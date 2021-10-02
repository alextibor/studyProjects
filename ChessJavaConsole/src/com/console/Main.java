package com.console;

import com.console.boardgame.Position;
import com.console.chess.ChessMatch;

public class Main {

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
        //test
    }
}
