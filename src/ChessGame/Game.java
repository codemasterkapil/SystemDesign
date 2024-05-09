package ChessGame;

public class Game {
    public Board board;
    public Player player1;
    public Player player2;
    Game(){
        board=new Board();
        player1=new Player("kapil",Colour.WHITE);
        player2=new Player("vansh",Colour.BLACK);
    }



}
