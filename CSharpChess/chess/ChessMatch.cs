using CSharpChess.board;
using Microsoft.VisualBasic;

namespace CSharpChess.chess
{
    public class ChessMatch
    {
        public Board bd { get; private set; }
        private int turn;
        private Color currentPlayer;
        public bool finished { get; private set; }

        public ChessMatch()
        {
            bd = new Board(8, 8);
            turn = 1;
            currentPlayer = Color.White;
            finished = false;
            PutPieces();
        }

        public void performMove(Position origin, Position destiny)
        {
            Piece p = bd.removePiece(origin);
            p.incrementMoveQtd();
            Piece pieceCaptured = bd.removePiece(destiny);
            bd.putPiece(p, destiny);
        }

        private void PutPieces()
        {
            bd.putPiece(new Tower(bd, Color.White), new ChessPosition('c', 1).ToPosition());
            bd.putPiece(new Tower(bd, Color.Black), new ChessPosition('c', 2).ToPosition());
            bd.putPiece(new Tower(bd, Color.White), new ChessPosition('d', 2).ToPosition());
            bd.putPiece(new Tower(bd, Color.Black), new ChessPosition('e', 2).ToPosition());
            bd.putPiece(new Tower(bd, Color.White), new ChessPosition('e', 1).ToPosition());
            bd.putPiece(new King(bd, Color.Black), new ChessPosition('d', 1).ToPosition());
            
        }
    }
}