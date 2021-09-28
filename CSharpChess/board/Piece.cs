namespace CSharpChess.board
{
    public class Piece
    {
        public Position position { get; set; }
        public Color color { get; protected set; }
        public int moveQtd { get; protected set; }
        public Board board { get; protected set; }

        public Piece(Board bd, Color color)
        {
            this.position = null;
            this.board = bd;
            this.color = color;
            this.moveQtd = 0;
        }

        public void incrementMoveQtd()
        {
            moveQtd++;
        }
    }
}