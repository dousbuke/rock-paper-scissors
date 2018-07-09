package db.rockpaperscissors.engine;

import db.rockpaperscissors.domain.Players;
import db.rockpaperscissors.domain.Sides;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class GameUtils {

    private static int size = 3;
    private static Random generator = new Random();

    public static Sides selection() {
        int result = generator.nextInt(size);

        return Sides.showSides(result);
    }

    public static Players round(Sides firstPlayer, Sides secondPlayer) {
        if (firstPlayer.equals(Sides.PAPER) && secondPlayer.equals(Sides.ROCK))
            return Players.PLAYER_A;
        else if (firstPlayer.equals(Sides.PAPER) && secondPlayer.equals(Sides.SCISSORS))
            return Players.PLAYER_B;
        else if (firstPlayer.equals(Sides.PAPER) && secondPlayer.equals(Sides.PAPER))
            return Players.DEUCE;
        else
            return Players.DEUCE;
    }

}