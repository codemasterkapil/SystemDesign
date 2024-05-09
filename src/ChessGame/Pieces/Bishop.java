package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Colour;

public class Bishop extends Piece {
    public Bishop(int x, int y, Colour colour, Status status,PieceName pieceName) {
        super(x,y,colour,status,pieceName);
    }

    @Override
    public boolean move(Board board,int x, int y) {

        return super.moveBishop(board,x,y);
    }

}
