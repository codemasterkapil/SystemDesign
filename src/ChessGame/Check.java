package ChessGame;

import ChessGame.Pieces.Piece;

import java.util.List;

public class Check {

    public static boolean checkKing(Board board, List<Piece> pieces, int targetx, int targety,Game game){

        for (Piece piece : game.board.whitePieces) {
            if(piece.move(board,targetx,targety)){
                return true;
            }
        }
        return false;
    }



}
