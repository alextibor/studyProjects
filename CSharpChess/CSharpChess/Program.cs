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
                ChessMatch cm = new ChessMatch();
            
                
                Screen.PrintBoard(cm.bd);
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
            Console.ReadLine();
        }
    }
}