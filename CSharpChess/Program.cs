using System;
using CSharpChess.board;
using CSharpChess.chess;

namespace CSharpChess
{
    class Program
    {
        static void Main(string[] args)
        {
            Board bd = new Board(8, 8);
            
            bd.putPiece(new Tower(bd, Color.Black), new Position(1, 1));
            bd.putPiece(new Tower(bd, Color.Black), new Position(7, 5));
            bd.putPiece(new King(bd, Color.Black), new Position(2, 6));
            
            Screen.printBoard(bd);

            Console.ReadKey();
        }
    }
}