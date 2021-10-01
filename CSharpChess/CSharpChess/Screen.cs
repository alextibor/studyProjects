using System;
using System.Globalization;
using CSharpChess.board;
using CSharpChess.chess;

namespace CSharpChess
{
    public class Screen
    {
        public static void printBoard(Board bd)
        {
            for (int l=0; l<bd.lines; l++)
            {
                Console.Write(8 - l + " ");
                for (int c=0; c<bd.columns; c++)
                {
                    printPiece(bd.Piece(l, c));
                }
                Console.WriteLine();
            }
            Console.WriteLine("  a b c d e f g h");
        }
        
        public static void printBoard(Board bd, bool[,] possiblePositions)
        {
            ConsoleColor originalBackground = Console.BackgroundColor;
            ConsoleColor changedBackground = ConsoleColor.DarkGray;
            
            for (int l=0; l<bd.lines; l++)
            {
                Console.Write(8 - l + " ");
                for (int c=0; c < bd.columns; c++)
                {
                    if (possiblePositions[l, c])
                    {
                        Console.BackgroundColor = changedBackground;
                    }
                    else
                    {
                        Console.BackgroundColor = originalBackground;
                    }
                    printPiece(bd.Piece(l, c));
                    Console.BackgroundColor = originalBackground;
                }
                Console.WriteLine();
            }
            Console.WriteLine("  a b c d e f g h");
            Console.BackgroundColor = originalBackground;
        }
        public static ChessPosition readChessPosition()
        {
            string s = Console.ReadLine();
            char column = s[0];
            int line = int.Parse(s[1] + "");
            return new ChessPosition(column, line);
        }
        public static void printPiece(Piece piece)
        {
            if (piece == null)
            {
                Console.Write("- ");
            }
            else
            {
                if (piece.color == Color.White)
                {
                    Console.Write(piece);
                }
                else
                {
                    ConsoleColor aux = Console.ForegroundColor;
                    Console.ForegroundColor = ConsoleColor.Yellow;
                    Console.Write(piece);
                    Console.ForegroundColor = aux;
                }
                Console.Write(" ");
            }
        }
    }
}