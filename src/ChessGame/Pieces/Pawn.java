package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Colour;

public class Pawn extends Piece {
    public Pawn(int x,int y,Colour colour,Status status,PieceName pieceName){
        super(x,y,colour,status,pieceName);
    }
    @Override
    public boolean move(Board board,int x, int y) {
        if(x>=0 && y>=0 && x<8 && y<8){
            if(this.colour==Colour.BLACK){
                if(x==posx+2 && posx==1 && y==posy && posx+2<8 && board.board[posx+2][y].getPiece()==null && board.board[posx+1][y].getPiece()==null){
                    return true;
                }else if(x==posx+1 && y==posy && posx+1<8 && board.board[posx+1][y].getPiece()==null ){
                    return true;
                }else if(x==posx+1 && y==posy+1 && posx+1<8 && posy+1<8 && board.board[posx+1][posy+1].getPiece().colour==Colour.WHITE){
                    return true;
                }
                else if(x==posx+1 && posx<7 && y==posy-1 && posy>=1 && board.board[posx+1][posy-1].getPiece().colour==Colour.WHITE){
                    return true;
                }
            }else{
                if(x==posx-2 && posx==6 && y==posy && posx-2>=0 && board.board[posx-2][y].getPiece()==null && board.board[posx-1][y].getPiece()==null){
                    return true;
                }else if(x==posx-1 && y==posy && posx-1>=0 && board.board[posx-1][y].getPiece()==null ){
                    return true;
                }else if(x==posx-1 && y==posy+1 && posx-1>=0 && posy+1<8 && board.board[posx-1][posy+1].getPiece().colour==Colour.BLACK){
                    return true;
                }
                else if(x==posx-1 && posx-1>=0 && y==posy-1 && posy-1>=0 && board.board[posx-1][posy-1].getPiece().colour==Colour.BLACK){
                    return true;
                }

            }
        }
        return false;
    }

}
