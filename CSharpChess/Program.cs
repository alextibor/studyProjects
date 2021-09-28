using System;
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
                    Console.Clear();
                    Screen.printBoard(match.bd);

                    Console.WriteLine();
                    Console.WriteLine("Origin: ");
                    Position origin = Screen.readChessPosition().ToPosition();

                    bool[,] possiblePositions = match.bd.piece(origin).possibleMoves();
                    
                    Console.Clear();
                    Screen.printBoard(match.bd, possiblePositions);
                    Console.WriteLine("Destino: ");
                    Position destiny = Screen.readChessPosition().ToPosition();
                    
                    match.performMove(origin, destiny);
                }
                
                Screen.printBoard(match.bd);
            }
            catch (BoardException e)
            {
                Console.WriteLine(e.Message);
            }
            Console.ReadLine();
        }
    }
}