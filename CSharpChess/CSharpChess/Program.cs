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
            try
            {
                ChessMatch match = new ChessMatch();

                while (!match.FinishedMove)
                {
                    Console.Clear();
                    Screen.PrintBoard(match.bd);

                    Console.WriteLine();
                    Console.WriteLine("Origin: ");
                    Position origin = Screen.ReadChessPosition().toPosition();
                    Console.WriteLine("Destiny: ");
                    Position destiny = Screen.ReadChessPosition().toPosition();

                    match.PerformMovement(origin, destiny);
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
            Console.ReadLine();
        }
    }
}