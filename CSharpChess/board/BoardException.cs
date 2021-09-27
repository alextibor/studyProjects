using System;

namespace CSharpChess.board
{
    public class BoardException : Exception
    {
        public BoardException(string msg) : base(msg)
        {
            
        }
    }
}