package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Colour;

public class King extends Piece{
    public King(int x, int y, Colour colour, Status status,PieceName pieceName){
        super(x,y,colour,status,pieceName);
    }
    @Override
    public boolean move(Board board,int x, int y) {
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                if(i==0 && j==0) continue;
                int row=posx+i,col=posy+j;
                if (board.board[row][col] != null) {
                    if (x == row && y == col && (board.board[row][col].getPiece().colour != colour)) return true;
                    else return false;
                }
                if (x == row && y == col) return true;
            }
        }
        return false;
    }

}
