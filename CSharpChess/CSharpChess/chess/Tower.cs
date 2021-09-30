using CSharpChess.board;

namespace CSharpChess.chess
{
    public class Tower : Piece
    {
        public Tower(Board bd, Color color) : base(bd, color)
        {
        
        }

        public override string ToString()
        {
            return "T";
        }
    }
    
}