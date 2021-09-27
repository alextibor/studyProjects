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
                bd.putPiece(new Tower(bd, Color.Black), new Position(0, 9));
                bd.putPiece(new Tower(bd, Color.Black), new Position(1, 9));
                bd.putPiece(new King(bd, Color.Black), new Position(0, 2));
            }
            catch (BoardException e)
            {
                Console.WriteLine(e.Message);
            }
            Console.ReadKey();
        }
    }
}