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

        public abstract bool[,] possibleMoves();
    }
}