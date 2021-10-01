using System.ComponentModel;
using CSharpChess.board;
using Microsoft.VisualBasic;

namespace CSharpChess.chess
{
    public class King : Piece
    {
        public King(Board bd, Color color) : base(bd, color)
        {
            
        }
        public override string ToString()
        {
            return "K";
        }

        private bool canMove(Position pos)
        {
            Piece p = bd.Piece(pos);
            return p == null || p.color != color;
        }

        public override bool[,] possibleMoves()
        {
            bool[,] mat = new bool[bd.lines, bd.columns];

            Position pos = new Position(0, 0);
            
            //North
            pos.defineValues(position.line - 1, position.column);
            if (bd.ValidPosition(pos) && canMove(pos))
            {
                mat[pos.line, pos.column] = true;
            }
            //NorthEast
            pos.defineValues(position.line - 1, position.column + 1);
            if (bd.ValidPosition(pos) && canMove(pos))
            {
                mat[pos.line, pos.column] = true;
            }
            //East
            pos.defineValues(position.line, position.column + 1);
            if (bd.ValidPosition(pos) && canMove(pos))
            {
                mat[pos.line, pos.column] = true;
            }
            //SouthEast
            pos.defineValues(position.line + 1, position.column + 1);
            if (bd.ValidPosition(pos) && canMove(pos))
            {
                mat[pos.line, pos.column] = true;
            }
            //South
            pos.defineValues(position.line + 1, position.column);
            if (bd.ValidPosition(pos) && canMove(pos))
            {
                mat[pos.line, pos.column] = true;
            }
            //SouthWest
            pos.defineValues(position.line + 1, position.column - 1);
            if (bd.ValidPosition(pos) && canMove(pos))
            {
                mat[pos.line, pos.column] = true;
            }
            //West
            pos.defineValues(position.line, position.column - 1);
            if (bd.ValidPosition(pos) && canMove(pos))
            {
                mat[pos.line, pos.column] = true;
            }
            //NorthWest
            pos.defineValues(position.line - 1, position.column - 1);
            if (bd.ValidPosition(pos) && canMove(pos))
            {
                mat[pos.line, pos.column] = true;
            }
            return mat;
        }
    }
}