package db.rockpaperscissors;

import db.rockpaperscissors.engine.GamePlay;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {

    public static void main(String args[]) {

        int round = 100;
        int sides = 2;

        GamePlay game = new GamePlay(round, sides);
        try {
            game.playGame();
        } catch (Exception e) {
            log.debug(e.getMessage());
        }
    }

}
