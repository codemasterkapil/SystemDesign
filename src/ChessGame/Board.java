package ChessGame;

import ChessGame.Pieces.*;

import java.util.ArrayList;
import java.util.List;

public class Board {

    public Cell[][] board = new Cell[8][8];
    public List<Piece>blackPieces=new ArrayList<>();
    public List<Piece>whitePieces=new ArrayList<>();

    public Board(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(i%2==0){
                    if(j%2==0) board[i][j]=new Cell(i,j,Colour.BLACK);
                    else board[i][j]=new Cell(i,j,Colour.WHITE);
                }else{
                    if(j%2!=0) board[i][j]=new Cell(i,j,Colour.BLACK);
                    else board[i][j]=new Cell(i,j,Colour.WHITE);
                }

            }
        }
        initializePawn();
        initializeBishop();
        initializeKnight();
        initializeKing();
        initializeQueen();
        initializeRook();
        setBlackPiecesList();
        setWhitePiecesList();

    }

    private void initializeRook() {
        this.board[0][0].setPiece(new Rook(0,0,Colour.BLACK, Status.ALIVE, PieceName.ROOK));
        this.board[0][7].setPiece(new Rook(0,7,Colour.BLACK, Status.ALIVE, PieceName.ROOK));
        this.board[7][0].setPiece(new Rook(7,0,Colour.WHITE, Status.ALIVE, PieceName.ROOK));
        this.board[7][7].setPiece(new Rook(7,7,Colour.WHITE, Status.ALIVE, PieceName.ROOK));
    }

    private void initializeQueen() {
        this.board[0][3].setPiece(new Queen(0,3,Colour.BLACK, Status.ALIVE, PieceName.QUEEN));
        this.board[7][3].setPiece(new Queen(7,3,Colour.WHITE, Status.ALIVE,PieceName.QUEEN));
    }

    private void initializeKing() {
        this.board[0][4].setPiece(new King(0,4,Colour.BLACK, Status.ALIVE,PieceName.KING));
        this.board[7][4].setPiece(new King(7,4,Colour.WHITE, Status.ALIVE,PieceName.KING));
    }

    private void initializeKnight() {
        this.board[0][1].setPiece(new Knight(0,1,Colour.BLACK, Status.ALIVE,PieceName.KNIGHT));
        this.board[0][6].setPiece(new Knight(0,6,Colour.BLACK, Status.ALIVE,PieceName.KNIGHT));
        this.board[7][1].setPiece(new Knight(7,1,Colour.WHITE, Status.ALIVE,PieceName.KNIGHT));
        this.board[7][6].setPiece(new Knight(7,6,Colour.WHITE, Status.ALIVE,PieceName.KNIGHT));
    }

    private void initializeBishop() {

        this.board[0][2].setPiece(new Bishop(0,2,Colour.BLACK, Status.ALIVE, PieceName.BISHOP));
        this.board[0][5].setPiece(new Bishop(0,5,Colour.BLACK, Status.ALIVE, PieceName.BISHOP));
        this.board[7][2].setPiece(new Bishop(7,2,Colour.WHITE, Status.ALIVE, PieceName.BISHOP));
        this.board[7][5].setPiece(new Bishop(7,5,Colour.WHITE, Status.ALIVE, PieceName.BISHOP));
    }

    private void initializePawn(){

       int row=1;
       for(int col=0;col<8;col++){
           this.board[row][col].setPiece(new Pawn(row,col,Colour.BLACK, Status.ALIVE,PieceName.PAWN));
       }
       row=6;
       for(int col=0;col<8;col++){
           this.board[row][col].setPiece(new Pawn(row,col,Colour.WHITE, Status.ALIVE,PieceName.PAWN));
       }

    }

    private void setBlackPiecesList(){
         for(int i=0;i<2;i++){
             for(int j=0;j<8;j++){
                 blackPieces.add(board[i][j].getPiece());
             }
         }
    }

    private void setWhitePiecesList(){
        for(int i=6;i<8;i++){
            for(int j=0;j<8;j++){
                whitePieces.add(board[i][j].getPiece());
            }
        }
    }
}
