package ChessGame;

import ChessGame.Pieces.Piece;

import java.util.List;

public class Player {
    String playerName;
    Colour colour;

    public Player(String playerName, Colour colour) {
        this.playerName = playerName;
        this.colour = colour;
    }
}
