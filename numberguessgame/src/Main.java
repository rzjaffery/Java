import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int MAX_NUM = 1000;
    private static int MIN_NUM = 1;


    public static void main(String[] args) {

        startgame();
    }
    public static void startgame(){
        int numGuess = 0;
        boolean guesscorrect = false;
        int computerNumber = guessbyComputer();

        while (!guesscorrect){
            int userNumber = guessbyUser();
            if (userNumber > computerNumber){
                System.out.println("Guessed Number is Greater than the Computer's Number ");
            } else if (userNumber < computerNumber) {
                System.out.println("Number Guessed is Lesser than the Computer's Number ");
            } else {
                System.out.println("Congratulations! You have guessed it correctly ");
                guesscorrect = true;
            }
            numGuess++;
        }
        System.out.println("You Guessed in "+numGuess+" number ");
    }

    private static int guessbyUser() {
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }

    private static int guessbyComputer() {
        return ThreadLocalRandom.current().nextInt(MIN_NUM,MAX_NUM+1);
    }
}