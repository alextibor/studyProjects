using System;
using CSharpChess.board;

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
                    if (bd.piece(l, c) == null)
                    {
                        Console.Write("- ");
                    }
                    else
                    {
                        printPiece(bd.piece(l,c));
                        Console.Write(" ");
                    }
                }
                Console.WriteLine();
            }

            Console.WriteLine(" a b c d e f g h");
        }

        public static void printPiece(Piece piece)
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