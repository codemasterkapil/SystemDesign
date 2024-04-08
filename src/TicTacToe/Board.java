package TicTacToe;

import TicTacToe.Piece.PlayingPiece;

public class Board {

    int size;
    PlayingPiece [][]board;

    public Board(int size){
        this.size=size;
        board = new PlayingPiece[size][size];
    }




}
