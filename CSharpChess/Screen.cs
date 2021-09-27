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
                for (int c=0; c<bd.columns; c++)
                {
                    if (bd.piece(l, c) == null)
                    {
                        Console.Write("- ");
                    }
                    else
                    {
                        Console.Write(bd.piece(l, c) + " ");
                    }
                }
                Console.WriteLine();
            }
        }
    }
}