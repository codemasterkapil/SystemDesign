package TicTacToe.player;

import TicTacToe.Piece.PlayingPiece;

public abstract class Players {
    public String name;
    public PlayingPiece piece;

    public Players(String name,PlayingPiece piece){
        this.name=name;
        this.piece=piece;
    }
}
