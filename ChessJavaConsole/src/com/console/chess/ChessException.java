package com.console.chess;

public class ChessException extends RuntimeException{

    private static final long serialVersionUID = 1;

    public ChessException(String msg){
        super(msg);
    }
}
