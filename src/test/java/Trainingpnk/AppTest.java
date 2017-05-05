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
        assertEquals("Human wins",App.game(p,r));
        assertEquals("Human wins",App.game(r,s));
        assertEquals("Human wins",App.game(s,p));
    }
    @Test
    public void playerTwoWins() {
        assertEquals("Computer wins",App.game(r,p));
        assertEquals("Computer wins",App.game(s,r));
        assertEquals("Computer wins",App.game(p,s));
    }

    @Test
    public void drawGame(){
        assertEquals("Draw",App.game(p,p));
        assertEquals("Draw",App.game(r,r));
        assertEquals("Draw",App.game(s,s));
    }

    @Test
    public void playerNotSelectedRockPaperScissors(){
        assertEquals("No one win because no paper, rock, scissors selected",App.game("Test1", "Test2"));
    }

}