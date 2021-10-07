﻿using System;
using CSharpChess.board;
using CSharpChess.chess;

namespace CSharpChess
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                ChessMatch match = new ChessMatch();

                while (!match.finished)
                {
                    try
                    {
                        Console.Clear();
                        Screen.printBoard(match.bd);

                        Console.WriteLine();
                        Console.WriteLine("Turn: " + match.turn);
                        Console.WriteLine("Waiting for move: " + match.currentPlayer);

                        Console.WriteLine();
                        Console.WriteLine("Origin: ");
                        Position origin = Screen.readChessPosition().ToPosition();
                        match.ValidateOriginPosition(origin);

                        bool[,] possiblePositions = match.bd.Piece(origin).possibleMoves();

                        Console.Clear();
                        Screen.printBoard(match.bd, possiblePositions);

                        Console.WriteLine();
                        Console.WriteLine("Destino: ");
                        Position destiny = Screen.readChessPosition().ToPosition();

                        match.performMove(origin, destiny);
                    }
                    catch (BoardException e)
                    {
                        Console.WriteLine(e.Message);
                        Console.ReadLine();
                    }
                     
                }
            }
            catch (BoardException e)
            {
                Console.WriteLine(e.Message);
            }
            Console.ReadLine();
        }
    }
}