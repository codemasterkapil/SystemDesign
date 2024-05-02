package SnakeLadderGame;

import java.util.Random;

public class Board {
    Cell[][] grid = new Cell[10][10];

    public Board()
    {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                grid[i][j] = new Cell();
            }
        }
    }

    public void addladder()
    {
        int total_places=8;
        Random rand = new Random();
        while(total_places>0){
            int start = rand.nextInt(97) + 1;
            int end = rand.nextInt(97) + 1;

            if(end>start) {
                grid[start / 10][start % 10].Setjump(new Jump(start, end));
                total_places--;
            }
        }

    }

    public void addSnakes()
    {
        int total_places=8;
        Random rand = new Random();

        while(total_places>0){
            int start = rand.nextInt(97) + 1;
            int end = rand.nextInt(97) + 1;

            if(end<start && (grid[start / 10][start % 10].jump==null) && (grid[end / 10][end % 10].jump==null)) {
                grid[start / 10][start % 10].Setjump(new Jump(start, end));
                total_places--;
            }
        }

    }

}
