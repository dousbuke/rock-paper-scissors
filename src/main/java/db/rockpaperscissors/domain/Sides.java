package db.rockpaperscissors.domain;

public enum Sides {

    ROCK,
    PAPER,
    SCISSORS;

    public static Sides showSides(int pick) {
        switch (pick) {
            case 0:
                return ROCK;
            case 1:
                return PAPER;
            case 2:
                return SCISSORS;
            default:
                // doNothing;
        }
        return null;
    }
}
