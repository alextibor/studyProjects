using System;
using System.Globalization;

namespace CSharpChess.board
{
    public class Board
    {
        public int lines { get; set; }
        public int columns { get; set; }
        private Piece[,] pieces;

        public Board(int lines, int columns)
        {
            this.lines = lines;
            this.columns = columns;
            pieces = new Piece[lines, columns];
        }

        public Piece Piece(int line, int column)
        {
            return pieces[line, column];
        }

        public Piece Piece(Position pos)
        {
            return pieces[pos.line, pos.column];
        }

        public bool existPiece(Position pos)
        {
            ValidatingPosition(pos);
            return Piece(pos) != null;
        }

        public void PutPiece(Piece p, Position pos)
        {
            if (existPiece(pos))
            {
                throw new BoardException("There is already a piece in this position!");
            }
            pieces[pos.line, pos.column] = p;
            p.position = pos;
        }

        public Piece RemovePiece(Position pos)
        {
            if (Piece(pos) == null)
            {
                return null;
            }
            else
            {
                Piece aux = Piece(pos);
                aux.position = null;
                pieces[pos.line, pos.column] = null;
                return aux;
            }
        }

        public bool ValidPosition(Position pos)
        {
            if (pos.line < 0 || pos.line >= lines || pos.column < 0 || pos.column >= columns)
            {
                return false;
            }
            return true;
        }

        public void ValidatingPosition(Position pos)
        {
            if (!ValidPosition(pos))
            {
                throw new BoardException("Invalid Position!");
            }
        }
    }
}