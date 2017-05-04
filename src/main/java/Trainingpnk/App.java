package Trainingpnk;

public class App 
{
    public static void main( String[] args )
    {
        String p = "paper";
        String r = "rock";
        String s = "scissors";
        System.out.println( "Hello from main" );
        String message = game("Test1", "Test2");
        System.out.println(message);

    }

    public static String game (String p1, String p2){

        String draw = "Draw";
        String pOneWin = "Player 1 wins";
        String pTwoWin ="Player 2 wins";
//DRAW
        if (p1.equals(p2))
            return "Draw";
//P1 WINS
        if (p1.equals("paper") && p2.equals("rock"))
            return pOneWin;
        if (p1.equals("rock") && p2.equals("scissors"))
            return pOneWin;
        if (p1.equals("scissors") && p2.equals("paper"))
            return pOneWin;
//P2 WINS
        if (p2.equals("paper") && p1.equals("rock"))
            return pTwoWin;
        if (p2.equals("rock") && p1.equals("scissors"))
            return pTwoWin;
        if (p2.equals("scissors") && p1.equals("paper"))
            return pTwoWin;


        return "default";
    }

}
