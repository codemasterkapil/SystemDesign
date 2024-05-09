package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Colour;

public class Queen extends Piece{
    public Queen(int x, int y, Colour colour, Status status,PieceName pieceName){
        super(x,y,colour,status,pieceName);
    }
    @Override
    public boolean move(Board board, int x, int y) {
        return super.moveBishop(board, x, y) || super.moveRook(board, x, y);
    }

}
