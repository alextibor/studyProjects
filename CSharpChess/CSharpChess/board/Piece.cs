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

        public bool ThereIsPossibleMovement()
        {
            bool[,] mat = possibleMoves();
            for (int i=0; i<bd.lines; i++)
            {
                for (int j=0; j<bd.columns; j++)
                {
                    if(mat[i, j])
                    {
                        return true;
                    }
                }
            }
            return false;
        }

        public abstract bool[,] possibleMoves();
    }
}