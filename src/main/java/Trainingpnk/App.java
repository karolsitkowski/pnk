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
        String inputString = null;
        gameElements userElement = null;
        int hScore = 0;
        int cScore = 0;



        while(true){
            System.out.println("Input paper, rock or scissors: ");


                try {
                    inputString = bufferRead.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    userElement = gameElements.valueOf(inputString);
                } catch (IllegalArgumentException e) {
                    System.out.println("String you entered is not paper, rock or scissors");
                }


        System.out.println("User element: " + inputString);
        String compRandom = gameElements.getRandom().name();
        System.out.println("Comp random: " + compRandom);

        int score = game(inputString,compRandom);

        if (score == 1) {
            hScore++;
         //   System.out.println("YOU");
            System.out.println("You Win round! Score --> You: " + hScore + " vs Comp: " + cScore);
        }

        if (score == 2) {
            cScore++;
         //   System.out.println("COMP");
            System.out.println("Computer Wins round! Score --> You: " + hScore + " vs Comp: " + cScore);
        }

        if (score == 0)
            System.out.println("DRAW!!!, Score --> You: " + hScore + " vs Comp: " + cScore);


        if (hScore == 3 || cScore ==3) {
            if (hScore == 3)
                System.out.println("Congratulation You wins whole game");
            if (cScore == 3)
                System.out.println("Computer Wins whole game");

            break;
        }

        //System.out.println(score);








        //TODO Improve input, Play to 3 wins , some loop

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
*/      }
    }

    public static int game (String p1, String p2){

        //String draw = "Draw";
       // String pOneWin = "Human wins";
       // String pTwoWin ="Computer wins";
//DRAW
        if (p1.equals(p2))
            return 0;
//P1 WINS
        if ((p1.equals(gameElements.paper.toString()) && p2.equals(gameElements.rock.toString())) ||
            (p1.equals(gameElements.rock.toString()) && p2.equals(gameElements.scissors.toString())) ||
            (p1.equals(gameElements.scissors.toString()) && p2.equals(gameElements.paper.toString())))
            return 1;

//P2 WINS
        if ((p2.equals(gameElements.paper.toString()) && p1.equals(gameElements.rock.toString())) ||
            (p2.equals(gameElements.rock.toString()) && p1.equals(gameElements.scissors.toString())) ||
            (p2.equals(gameElements.scissors.toString()) && p1.equals(gameElements.paper.toString())))
            return 2;


        return 9;
    }

}
