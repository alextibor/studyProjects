using System;
using CSharpChess.Board;

namespace CSharpChess
{
    class Program
    {
        static void Main(string[] args)
        {
            Position P = new Position(3, 4);

            Console.WriteLine("Position: " + P);

            Console.ReadKey();
        }
    }
}