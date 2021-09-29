using System;
using System.Net.WebSockets;
using System.Security.Cryptography.X509Certificates;
using System.Xml;
using CSharpChess.tabuleiro;

namespace CSharpChess
{
    class Program
    {
        static void Main(string[] args)
        {
            Tabuleiro tab = new Tabuleiro(8,8);
            
            Tela.imprimirTabuleiro(tab);

            Console.ReadLine();
        }
    }
}