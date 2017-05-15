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
    public void humanWins() {
        assertEquals(1,App.game(p,r));
        assertEquals(1,App.game(r,s));
        assertEquals(1,App.game(s,p));
    }
    @Test
    public void computerWins() {
        assertEquals(2,App.game(r,p));
        assertEquals(2,App.game(s,r));
        assertEquals(2,App.game(p,s));
    }

    @Test
    public void drawGame(){
        assertEquals(0,App.game(p,p));
        assertEquals(0,App.game(r,r));
        assertEquals(0,App.game(s,s));
    }

    @Test
    public void playerNotSelectedRockPaperScissors(){
        assertEquals(9,App.game("Test1", "Test2"));
    }

}