package Trainingpnk;

public class App 
{
    public enum gameElements {
        paper,
        rock,
        scissors;

        public static gameElements getRandom(){
            return values()[(int) (Math.random() * values().length)];
        }
    }


    public static void main( String[] args )
    {
        //TODO Input String (selected from 3), Random from 3 by computer side
        System.out.println( "Hello from main" );
        String message = game("Test1", "Test2");
        System.out.println("Message: " + message);
        System.out.println("Paper from Enum: " + gameElements.paper);
        System.out.println("Co zwraca values.lenght: " + gameElements.values().length);


        for(int i=0; i<100; i++) {

            gameElements randomElement = gameElements.getRandom();
            System.out.println(randomElement.toString());
        }

    }

    public static String game (String p1, String p2){

        String draw = "Draw";
        String pOneWin = "Player 1 wins";
        String pTwoWin ="Player 2 wins";
//DRAW
        if (p1.equals(p2))
            return draw;
//P1 WINS
        if ((p1.equals(gameElements.paper.toString()) && p2.equals(gameElements.rock.toString())) ||
            (p1.equals(gameElements.rock.toString()) && p2.equals(gameElements.scissors.toString())) ||
            (p1.equals(gameElements.scissors.toString()) && p2.equals(gameElements.paper.toString())))
            return pOneWin;

//P2 WINS
        if ((p2.equals(gameElements.paper.toString()) && p1.equals(gameElements.rock.toString())) ||
            (p2.equals(gameElements.rock.toString()) && p1.equals(gameElements.scissors.toString())) ||
            (p2.equals(gameElements.scissors.toString()) && p1.equals(gameElements.paper.toString())))
            return pTwoWin;


        return "No Paper Rock Scissors selected";
    }

}
