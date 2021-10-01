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
        
        private bool canMove(Position pos)
        {
            Piece p = bd.Piece(pos);
            return p == null || p.color != color;
        }

        public override bool[,] possibleMoves()
        {
            bool[,] mat = new bool[bd.lines, bd.columns];
            
            Position pos = new Position(0, 0);
            
            //North
            pos.defineValues(position.line - 1, position.column);
            while (bd.ValidPosition(pos) && canMove(pos))
            {
                mat[pos.line, pos.column] = true;
                if (bd.Piece(pos) != null && bd.Piece(pos).color != color)
                {
                    break;
                } 
                pos.line = pos.line - 1;
            }
            //South
            pos.defineValues(position.line + 1, position.column);
            while (bd.ValidPosition(pos) && canMove(pos))
            {
                mat[pos.line, pos.column] = true;
                if (bd.Piece(pos) != null && bd.Piece(pos).color != color)
                {
                    break;
                } 
                pos.line = pos.line + 1;
            }
            //East
            pos.defineValues(position.line, position.column + 1);
            while (bd.ValidPosition(pos) && canMove(pos))
            {
                mat[pos.line, pos.column] = true;
                if (bd.Piece(pos) != null && bd.Piece(pos).color != color)
                {
                    break;
                } 
                pos.column = pos.column + 1;
            }
            //West
            pos.defineValues(position.line, position.column - 1);
            while (bd.ValidPosition(pos) && canMove(pos))
            {
                mat[pos.line, pos.column] = true;
                if (bd.Piece(pos) != null && bd.Piece(pos).color != color)
                {
                    break;
                } 
                pos.column = pos.column - 1;
            }
            return mat;
        }
    }
}