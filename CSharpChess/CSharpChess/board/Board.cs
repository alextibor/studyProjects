namespace CSharpChess.board
{
    public class Board
    {
        public int lines { get; set; }
        public int columns { get; set; }
        private Piece[,] pieces;

        public Board(int lines, int column)
        {
            this.lines = lines;
            this.columns = column;
            pieces = new Piece[lines, columns];
        }

        public Piece ReturnBoardPiece(int line, int column)
        {
            return pieces[line, column];
        }

        public Piece ReturnBoardPiece(Position pos)
        {
            return pieces[pos.line, pos.column];
        }

        public bool ThereIsAPiece(Position pos)
        {
            ValidatePosition(pos);
            return ReturnBoardPiece(pos) != null;
        }

        public void PutPiece(Piece p, Position pos)
        {
            if (ThereIsAPiece(pos))
            {
                throw new BoardException("There is already a piece in this position");
            }
            pieces[pos.line, pos.column] = p;
            p.position = pos;
        }

        public bool ValidPosition(Position pos)
        {
            if (pos.line < 0 || pos.line >= lines || pos.column < 0 || pos.column >= columns)
            {
                return false;
            }
            return true;
        }

        public void ValidatePosition(Position pos)
        {
            if (!ValidPosition(pos))
            {
                throw new BoardException("Invalid Position!");
            }
        }
        
        
    }
}