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
                for (int j = 0; j < bd.columns; j++)
                {
                    if (bd.ReturnBoardPiece(i, j) == null)
                    {
                        Console.Write("- ");
                    }
                    Console.Write(bd.ReturnBoardPiece(i, j) + " ");
                }
                
                Console.WriteLine();
            }
        }
        
    }
}