package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Colour;

public class Rook extends Piece{
    public Rook(int x, int y, Colour colour, Status status,PieceName pieceName){
        super(x,y,colour,status,pieceName);
    }
    @Override
    public boolean move(Board board,int x, int y) {
       return super.moveRook(board,x,y);
    }

}
