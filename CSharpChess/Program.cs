using System;
using CSharpChess.board;

namespace CSharpChess
{
    class Program
    {
        static void Main(string[] args)
        {
            Board bd = new Board(8, 8);
            
            Screen.printBoard(bd);

            Console.ReadKey();
        }
    }
}