package db.rockpaperscissors.domain;

import org.junit.Test;

import static db.rockpaperscissors.domain.Sides.PAPER;
import static db.rockpaperscissors.domain.Sides.ROCK;
import static db.rockpaperscissors.domain.Sides.SCISSORS;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;


public class SidesTest {

    @Test
    public void shouldShowSides() {

        assertThat(Sides.showSides(0), equalTo(ROCK));
        assertThat(Sides.showSides(1), equalTo(PAPER));
        assertThat(Sides.showSides(2), equalTo(SCISSORS));
    }
}