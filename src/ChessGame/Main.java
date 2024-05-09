package ChessGame;

import ChessGame.Pieces.Piece;
import ChessGame.Pieces.PieceName;
import ChessGame.Pieces.Status;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        boolean isGameOver = false;
        boolean isPlayer1Chance = true;

        Scanner scanner = new Scanner(System.in);

        int whiteKingx=0,whiteKingy=4,blackKingx=7,blackKingy=4;
        int countBlack=0,countWhite=0;

        while (!isGameOver) {

            System.out.println(".......");
            System.out.println("your pieces positions are :");
            if (isPlayer1Chance) {

                for (Piece piece : game.board.whitePieces) {
                    System.out.println(piece.pieceName + " at (" + piece.posx + "," + piece.posy + ")");
                }
                System.out.println("Which piece you want to  move");
                int posx = scanner.nextInt();
                int posy = scanner.nextInt();
                System.out.println("choose your next move");
                int targetx = scanner.nextInt();
                int targety = scanner.nextInt();

                Piece piece = game.board.board[posx][posy].piece;

                System.out.println(piece.pieceName);

                if (piece.move(game.board, targetx, targety)) {

                    if(Check.checkKing(game.board,game.board.blackPieces,whiteKingx,whiteKingy,game)){
                        if(countBlack==1) {
                            isGameOver=true;
                            break;
                        }
                        countBlack++;
                    }else countBlack=0;

                    if (game.board.board[targetx][targety].piece != null) {
                        Piece deadPiece = game.board.board[targetx][targety].piece;
                        deadPiece.status = Status.DEAD;
                        game.board.blackPieces.remove(deadPiece);
                    }
                    game.board.board[targetx][targety].setPiece(piece);
                    game.board.board[piece.posx][piece.posy].setPiece(null);
                    piece.posx=targetx;
                    piece.posy=targety;
                    if(piece.pieceName== PieceName.KING){
                       whiteKingx=targetx;
                       whiteKingy=targety;
                    }

                    boolean isBlackkingInDanger=Check.checkKing(game.board,game.board.whitePieces,blackKingx,blackKingy,game);

                    isPlayer1Chance = false;
                } else {
                    System.out.println("please enter a valid move !!");
                }

            } else {
                for (Piece piece : game.board.blackPieces) {
                    System.out.println(piece.pieceName + " at (" + piece.posx + "," + piece.posy + ")");
                }
                System.out.println("Which piece you want to  move");
                int posx = scanner.nextInt();
                int posy = scanner.nextInt();
                System.out.println("choose your next move");
                int targetx = scanner.nextInt();
                int targety = scanner.nextInt();

                Piece piece = game.board.board[posx][posy].piece;
                if (piece.move(game.board, targetx, targety)) {

                    if(Check.checkKing(game.board,game.board.whitePieces,blackKingx,blackKingy,game)){
                        if(countWhite==1) {
                            isGameOver=true;
                            break;
                        }
                        countWhite++;
                    }else countWhite=0;

                    if (game.board.board[targetx][targety].piece != null) {
                        Piece deadPiece = game.board.board[targetx][targety].piece;
                        deadPiece.status = Status.DEAD;
                        game.board.whitePieces.remove(deadPiece);
                    }
                    game.board.board[targetx][targety].setPiece(piece);
                    game.board.board[piece.posx][piece.posy].setPiece(null);
                    piece.posx=targetx;
                    piece.posy=targety;

                    if(piece.pieceName== PieceName.KING){
                        blackKingx=targetx;
                        blackKingy=targety;
                    }

                    boolean isWhitekingInDanger=Check.checkKing(game.board,game.board.blackPieces,whiteKingx,whiteKingy,game);
                    isPlayer1Chance = true;

                } else {
                    System.out.println("please enter a valid move !!");
                }
            }

        }

    }
}
