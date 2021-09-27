using System;
using CSharpChess.board;
using CSharpChess.chess;

namespace CSharpChess
{
    class Program
    {
        static void Main(string[] args)
        {
            ChessPosition pos = new ChessPosition('c', 7);
            
            Console.WriteLine(pos);

            Console.WriteLine(pos.ToPosition());
            Console.ReadLine(); 
        }
    }
}