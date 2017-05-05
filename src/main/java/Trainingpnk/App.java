package Trainingpnk;

public class App 
{
    public enum gameElements {
        paper, rock, scissors
    }


    public static void main( String[] args )
    {
        //TODO Input String (selected from 3), Random from 3 by computer side
        System.out.println( "Hello from main" );
        String message = game("Test1", "Test2");
        System.out.println(message);
        System.out.println(gameElements.paper);

    }

    public static String game (String p1, String p2){



        String draw = "Draw";
        String pOneWin = "Player 1 wins";
        String pTwoWin ="Player 2 wins";
//DRAW
        if (p1.equals(p2))
            return draw;
//P1 WINS
        if (p1.equals(gameElements.paper.toString()) && p2.equals(gameElements.rock.toString()))
            return pOneWin;
        if (p1.equals(gameElements.rock.toString()) && p2.equals(gameElements.scissors.toString()))
            return pOneWin;
        if (p1.equals(gameElements.scissors.toString()) && p2.equals(gameElements.paper.toString()))
            return pOneWin;
//P2 WINS
        if (p2.equals(gameElements.paper.toString()) && p1.equals(gameElements.rock.toString()))
            return pTwoWin;
        if (p2.equals(gameElements.rock.toString()) && p1.equals(gameElements.scissors.toString()))
            return pTwoWin;
        if (p2.equals(gameElements.scissors.toString()) && p1.equals(gameElements.paper.toString()))
            return pTwoWin;


        return "No Paper Rock Scissors selected";
    }

}
