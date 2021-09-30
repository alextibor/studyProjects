using CSharpChess.board;

namespace CSharpChess.chess
{
    public class ChessMatch
    {
        //TODO review the permitions here
        public Board bd { get; set; }
        private int turn;
        private Color currentPlayer;
        public bool FinishedMove { get; private set; }

        public ChessMatch()
        {
            bd = new Board(8, 8);
            turn = 1;
            currentPlayer = Color.White;
            InstantiatePieces();
        }

        public void PerformMovement(Position origin, Position destiny)
        {
            Piece p = bd.RemovePiece(origin);
            p.IncrementAmountMoves();
            bd.RemovePiece(destiny);
            Piece CapturedPiece = bd.RemovePiece(destiny);
            bd.PutPiece(p, destiny);
        }
        
        private void InstantiatePieces()
        {
            bd.PutPiece(new Tower(bd, Color.White), new ChessPosition('c',1).toPosition());
            bd.PutPiece(new Tower(bd, Color.White), new ChessPosition('c',2).toPosition());
            bd.PutPiece(new Tower(bd, Color.White), new ChessPosition('d',2).toPosition());
            bd.PutPiece(new Tower(bd, Color.White), new ChessPosition('e',2).toPosition());
            bd.PutPiece(new Tower(bd, Color.White), new ChessPosition('e',1).toPosition());
            bd.PutPiece(new King(bd, Color.White), new ChessPosition('d',1).toPosition());
            
            bd.PutPiece(new Tower(bd, Color.Black), new ChessPosition('c',7).toPosition());
            bd.PutPiece(new Tower(bd, Color.Black), new ChessPosition('c',8).toPosition());
            bd.PutPiece(new Tower(bd, Color.Black), new ChessPosition('d',7).toPosition());
            bd.PutPiece(new Tower(bd, Color.Black), new ChessPosition('e',7).toPosition());
            bd.PutPiece(new Tower(bd, Color.Black), new ChessPosition('e',8).toPosition());
            bd.PutPiece(new King(bd, Color.Black), new ChessPosition('d',8).toPosition());
        }
    }
}