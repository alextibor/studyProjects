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
                Board bd = new Board(8, 8);
            
                bd.PutPiece(new Tower(bd, Color.Black), new Position(0, 0));
                bd.PutPiece(new Tower(bd, Color.Black), new Position(1, 3));
                bd.PutPiece(new King(bd, Color.Black), new Position(5, 0));
                Screen.PrintBoard(bd);
                Console.ReadLine();

            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }

            Console.ReadLine();
        }
    }
}