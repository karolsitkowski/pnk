package Trainingpnk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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


    public static void main( String[] args ) {

        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input string: ");



        String inputString = null;
        gameElements userElement = null;
        try {
            inputString = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            userElement = gameElements.valueOf(inputString);
        } catch (IllegalArgumentException e){
            System.out.println("String you entered is not paper, rock or scissors");
        }




        //ACTUAL GAME
        System.out.println("User element: " + inputString);
        String compRandom = gameElements.getRandom().name();
        System.out.println("Comp random: " + compRandom);

        String score = game(inputString,compRandom);
        System.out.println(score);







        //TODO Improve imput, Play to 3 wins , some loop

 //       System.out.println("String entered : " + inputString);
 //

        //TestTrashbelow
    /*    System.out.println( "Hello from main" );
        String message = game("Test1", "Test2");
        System.out.println("Message: " + message);
        System.out.println("Paper from Enum: " + gameElements.paper);
        System.out.println("Co zwraca values.lenght: " + gameElements.values().length);


        for(int i=0; i<100; i++) {

            gameElements randomElement = gameElements.getRandom();
            System.out.println(randomElement.toString());
        }
*/
    }

    public static String game (String p1, String p2){

        String draw = "Draw";
        String pOneWin = "Human wins";
        String pTwoWin ="Computer wins";
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


        return "No one win because no paper, rock, scissors selected";
    }

}
