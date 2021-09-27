namespace CSharpChess.board
{
    public class Board
    {
        public int line { get; set; }
        public int column { get; set; }
        private Piece[,] pieces;

        public Board(int line, int column)
        {
            this.line = line;
            this.column = column;
            pieces = new Piece[line, column];
        }

    }
}