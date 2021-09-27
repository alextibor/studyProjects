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

            try
            {
                bd.putPiece(new Tower(bd, Color.Black), new Position(0, 0));
                bd.putPiece(new Tower(bd, Color.Black), new Position(1, 3));
                bd.putPiece(new King(bd, Color.Black), new Position(0, 2));
                bd.putPiece(new King(bd, Color.White), new Position(3, 5));
                
                Screen.printBoard(bd);
            }
            catch (BoardException e)
            {
                Console.WriteLine(e.Message);
            }
            Console.ReadLine();
        }
    }
}