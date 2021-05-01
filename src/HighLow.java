import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamePicks = (int) (Math.random() * 100);
//        System.out.println("The secret number is: " + gamePicks);
        System.out.println();


        System.out.println("Guess a number between 1 and 100.");
        int userGuess;

        do {

            userGuess = scanner.nextInt();

            if (userGuess < gamePicks) {
                System.out.println("HIGHER.");

            } else if (userGuess > gamePicks) {
                System.out.println("LOWER.");

            } else {
                System.out.println("GOOD GUESS!");

            }
        } while (userGuess != gamePicks);


    }
}
