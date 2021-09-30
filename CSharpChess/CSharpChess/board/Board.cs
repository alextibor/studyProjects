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

        public void PutPiece(Piece p, Position pos)
        {
            pieces[pos.line, pos.column] = p;
            p.position = pos;
        }
        
    }
}