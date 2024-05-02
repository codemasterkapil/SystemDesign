package SnakeLadderGame;

import java.util.Random;

public class Dice {

    public int Rolldice()
    {
        Random rand = new Random();
        int randomNumber = rand.nextInt(6) + 1;
        return randomNumber;
    }

}
