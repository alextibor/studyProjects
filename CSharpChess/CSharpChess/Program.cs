using System;
using System.Security.Cryptography.X509Certificates;
using System.Xml;
using CSharpChess.tabuleiro;

namespace CSharpChess
{
    class Program
    {
        static void Main(string[] args)
        {
            Posicao P;
        
            P = new Posicao(3, 4);

            Console.WriteLine("Posicao: " + P);

            Console.ReadLine();
        }
    }
}