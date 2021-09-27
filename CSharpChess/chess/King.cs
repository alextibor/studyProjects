using CSharpChess.board;

namespace CSharpChess.chess

{
    public class King : Piece
    {
        public King(Board bd, Color color) : base(bd, color)
        {
            
        }
        public override string ToString()
        {
            return "K";
        }
    }
}