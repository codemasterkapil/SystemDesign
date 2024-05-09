package ChessGame;

import ChessGame.Pieces.Piece;

public class Cell {
    Piece piece=null;
    int x;
    int y;

    Colour colour;
    Cell(int x,int y,Colour colour){
        this.x=x;
        this.y=y;
        this.colour=colour;
    }

    public void setPiece(Piece piece){
        this.piece=piece;
    }
    public Piece getPiece(){
        return piece;
    }

}
