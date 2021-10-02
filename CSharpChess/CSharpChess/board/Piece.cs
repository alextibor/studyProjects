namespace CSharpChess.board
{
    public abstract class Piece
    {
        public Position position { get; set; }
        public Color color { get; protected set; }
        public int moveQtd { get; protected set; }
        public Board bd { get; protected set; }

        public Piece(Board bd, Color color)
        {
            this.position = null;
            this.bd = bd;
            this.color = color;
            this.moveQtd = 0;
        }

        public void incrementMoveQtd()
        {
            moveQtd++;
        }

        public bool ThereArePossibleMovements()
        {
            bool[,] mat = PossibleMoves();
            for (int l = 0; l < bd.lines; l++)
            {
                for (int c = 0; c < bd.columns; c++)
                {
                    if (mat[l, c] == true)
                    {
                        return true;
                    }
                }
            }
            return false;
        }

        public bool CanMoveTo(Position pos)
        {
            return PossibleMoves()[pos.line, pos.column];
        }

        public abstract bool[,] PossibleMoves();

        
    }
}