package com.console.chess.pieces;

import com.console.boardgame.Board;
import com.console.chess.ChessPiece;
import com.console.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
