package TicTacToe;

import TicTacToe.Piece.PieceType;
import TicTacToe.Piece.PieceX;
import TicTacToe.Piece.PieceY;
import TicTacToe.Piece.PlayingPiece;
import TicTacToe.player.Player1;
import TicTacToe.player.Player2;
import TicTacToe.player.Players;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// [[0,1,2],[3,4,5],[6,7,8],[0,4,8],[2,4,6],[0,3,6],[1,4,7],[2,5,8]]



public class Game {

    static boolean IsWinner(Players p){
        return true;
    }

    public static void main(String[] args) {

        PlayingPiece piecex=new PieceX(PieceType.X);
        PlayingPiece piecey=new PieceY(PieceType.O);

        Players player1=new Player1("takshil",piecex);
        Players player2=new Player2("kapil",piecey);

        Board board=new Board(3);

        Queue<Players> q=new LinkedList<Players>();

        q.add(player1);
        q.add(player2);

        boolean Isgameover=false;

        while(!Isgameover){
            Players p= q.remove();
           List<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<board.size;i++){
                for(int j=0;j<board.size;j++){
                    if(board.board[i][j]==null){
                        int val=i*board.size+j;
                        list.add(val);

                    }
                }
            }

            if(list.isEmpty()){
                System.out.println("No one has won the game");
                break;
            }

            int max = list.size()-1;
            int min = 0;
            int range = max - min + 1;
            int rand = (int)(Math.random() * range) + min;


            int number= list.get(rand);

            board.board[number/board.size][number%(board.size)]=p.piece;

            Isgameover = IsWinner(p);

            if(Isgameover){
                System.out.println("player"+p.name+"has won the game");
            }

            q.add(p);

        }

    }

}