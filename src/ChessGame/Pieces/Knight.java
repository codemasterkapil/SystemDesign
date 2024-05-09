package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Colour;

public class Knight extends Piece {
    public Knight(int x, int y, Colour colour, Status status,PieceName pieceName) {
        super(x,y,colour,status,pieceName);
    }

    @Override
    public boolean move(Board board, int x, int y) {

        int arr[] = {2, 1, 2, -1, -2, 1, -2, -1, 1, 2, 1, -2, -1, 2, -1, -2};
        for (int i = 0; i < 16; i += 2) {
            int row=posx+arr[i],col=posy+arr[i+1];



            if (row>=0 && row<8 && col>=0 && col<8 && board.board[row][col].getPiece()!= null) {
                if (x == row && y == col && (board.board[row][col].getPiece().colour != colour)) return true;
                else return false;
            }
            if (x == row && y == col) return true;
        }
        return false;
    }

}