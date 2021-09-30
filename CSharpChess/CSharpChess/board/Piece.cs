namespace CSharpChess.board
{
    public class Piece
    {
        public Position position { get; set; }
        public Color color { get; protected set; }
        public int amountMoves { get; set; }
        public Board bd { get; protected set; }

        public Piece(Board bd, Color color)
        {
            this.position = null;
            this.bd = bd;
            this.color = color;
            this.amountMoves = 0;
        }
    }
}