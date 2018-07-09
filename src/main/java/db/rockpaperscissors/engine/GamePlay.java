package db.rockpaperscissors.engine;


import db.rockpaperscissors.domain.Players;
import db.rockpaperscissors.domain.Sides;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GamePlay {

    private int round;
    private int sides;
    private Sides playerA;
    private Sides playerB;
    private int playerAWin;
    private int playerBWin;
    private int deuce;

    public GamePlay(int round, int sides) {
        this.round = round;
        this.sides = sides;
    }

    public void playGame() throws Exception {
        if (sides > 2)
            throw new Exception("Sides cant be more than 2");

        for (int i = 0; i < round; i++) {
            chooseSides();

            Players result = GameUtils.round(playerA, playerB);

            scoreCount(result);
        }

        printResults();
    }

    private void printResults() {

        System.out.println("Player A wins " + playerAWin + " of 100 games");
        System.out.println("Player B wins " + playerBWin + " of 100 games");
        System.out.println("Tie: " + deuce + " of 100 games");
    }

    private void scoreCount(Players result) {
        if (result.equals(Players.PLAYER_A)) {
            playerAWin++;
        } else if (result.equals(Players.PLAYER_B)) {
            playerBWin++;
        } else {
            deuce++;
        }
    }

    private void chooseSides() {
        playerA = Sides.PAPER;
        playerB = GameUtils.selection();
    }
}
