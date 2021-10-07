using CSharpChess.board;
using Microsoft.VisualBasic;

namespace CSharpChess.chess
{
    public class ChessMatch
    {
        public Board bd { get; private set; }
        public int turn { get; private set; }
        public Color currentPlayer { get; private set; }
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
            Piece p = bd.RemovePiece(origin);
            p.incrementMoveQtd();
            Piece pieceCaptured = bd.RemovePiece(destiny);
            bd.PutPiece(p, destiny);
        }

        public void PerformPlay(Position origin, Position destiny)
        {
            performMove(origin, destiny);
            turn++;
            ChangePlayer();
        }

        public void ValidateOriginPosition(Position pos)
        {
            if(bd.Piece(pos) == null)
            {
                throw new BoardException("Theres no piece in chosen origin position!");
            }
            if (currentPlayer != bd.Piece(pos).color);
            {
                throw new BoardException("The chosen piece is not yours");
            }
            if (!bd.Piece(pos).ThereIsPossibleMovement())
            {
                throw new BoardException("There is no possible moviments for the chosen origin piece!");
            }
        }

        public void ChangePlayer()
        {
            if(currentPlayer == Color.White)
            {
                currentPlayer = Color.Black;
            }
            else
            {
                currentPlayer = Color.White;
            }
        }

        private void PutPieces()
        {
            bd.PutPiece(new Tower(bd, Color.White), new ChessPosition('c', 1).ToPosition());
            bd.PutPiece(new Tower(bd, Color.White), new ChessPosition('c', 2).ToPosition());
            bd.PutPiece(new Tower(bd, Color.White), new ChessPosition('d', 2).ToPosition());
            bd.PutPiece(new Tower(bd, Color.White), new ChessPosition('e', 2).ToPosition());
            bd.PutPiece(new Tower(bd, Color.White), new ChessPosition('e', 1).ToPosition());
            bd.PutPiece(new King(bd, Color.White), new ChessPosition('d', 1).ToPosition());


            bd.PutPiece(new Tower(bd, Color.Black), new ChessPosition('c', 7).ToPosition());
            bd.PutPiece(new Tower(bd, Color.Black), new ChessPosition('c', 8).ToPosition());
            bd.PutPiece(new Tower(bd, Color.Black), new ChessPosition('d', 7).ToPosition());
            bd.PutPiece(new Tower(bd, Color.Black), new ChessPosition('e', 7).ToPosition());
            bd.PutPiece(new Tower(bd, Color.Black), new ChessPosition('e', 8).ToPosition());
            bd.PutPiece(new King(bd, Color.Black), new ChessPosition('d', 8).ToPosition());
        }
    }
}