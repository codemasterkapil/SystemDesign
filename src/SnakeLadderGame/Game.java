package SnakeLadderGame;

import java.util.LinkedList;
import java.util.Queue;

public class Game {
    Board board;
    Dice dice;
    Queue<Player> queue = new LinkedList<>();
    int players;
    public Game(int players){

        this.players=players;
        this.board=new Board();
        this.dice=new Dice();

        make_players();
        board.addladder();
        board.addSnakes();
    }

    private void make_players()
    {
        for(int i=1;i<=players;i++){
            queue.offer(new Player("player "+i,i));
        }
    }

    public void start_game()
    {
        boolean is_winner=false;
        while(!is_winner)
        {
           Player player=queue.poll();
           int val=dice.Rolldice();
           int temp_pos=player.position+val;
           System.out.println(player.playername+" is having a chance and currently on "+player.position);

           if(temp_pos>99)
           {
               System.out.println("continued");
               queue.offer(player);
               continue;
           }

           if(temp_pos==99)
           {
               is_winner=true;
               System.out.println(player.playername+" is a real winner by firstly reaching on "+temp_pos);
               continue;
           }

           Jump jump=board.grid[temp_pos/10][temp_pos%10].jump;
           if(jump!=null)
           {
               player.position=jump.end;
           }
           else
           {
               player.position=temp_pos;
           }
           queue.offer(player);
        }
    }

}
