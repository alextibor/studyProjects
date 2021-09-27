namespace CSharpChess.board
{
    public class Piece
    {
        public Position position { get; set; }
        public Color color { get; protected set; }
        public int moveQtd { get; protected set; }
        public Board board { get; protected set; }
        
    }
}