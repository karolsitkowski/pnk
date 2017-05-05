package Trainingpnk;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class AppTest {

    String p = "paper";
    String r = "rock";
    String s = "scissors";

    @Test
    public void playerOneWins() {
        assertEquals("Player 1 wins",App.game(p,r));
        assertEquals("Player 1 wins",App.game(r,s));
        assertEquals("Player 1 wins",App.game(s,p));
    }
    @Test
    public void playerTwoWins() {
        assertEquals("Player 2 wins",App.game(r,p));
        assertEquals("Player 2 wins",App.game(s,r));
        assertEquals("Player 2 wins",App.game(p,s));
    }

    @Test
    public void drawGame(){
        assertEquals("Draw",App.game(p,p));
        assertEquals("Draw",App.game(r,r));
        assertEquals("Draw",App.game(s,s));
    }

    @Test
    public void playerNotSelectedRockPaperScissors(){
        assertEquals("No Paper Rock Scissors selected",App.game("Test1", "Test2"));
    }

}