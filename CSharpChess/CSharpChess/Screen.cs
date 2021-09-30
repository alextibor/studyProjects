using System;
using CSharpChess.board;

namespace CSharpChess
{
    public class Screen
    {
        public static void PrintBoard(Board bd)
        {
            for (int i = 0; i < bd.lines; i++)
            {
                Console.Write(8 - i + " ");
                for (int j = 0; j < bd.columns; j++)
                {
                    if (bd.ReturnBoardPiece(i, j) == null)
                    {
                        Console.Write("- ");
                    }
                    else
                    {
                        Screen.PrintPiece(bd.ReturnBoardPiece(i, j));
                    }
                    
                }
                Console.WriteLine();
            }
            Console.WriteLine("  a b c d e f g h");
        }

        public static void PrintPiece(Piece piece)
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
        }
    }
}