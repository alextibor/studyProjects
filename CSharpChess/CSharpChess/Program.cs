using System;
using System.Net.WebSockets;
using System.Security.Cryptography.X509Certificates;
using System.Xml;
using CSharpChess.board;
using CSharpChess.chess;

namespace CSharpChess
{
    class Program
    {
        static void Main(string[] args)
        {
            ChessPosition cp = new ChessPosition('a', 1);
            Console.WriteLine(cp.toPosition());
            Console.ReadLine();
        }
    }
}