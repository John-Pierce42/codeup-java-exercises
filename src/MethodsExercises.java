import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        addition(10, 10);
//
//        System.out.println(subtraction(20, 5));
//
//        multiplication(2, 5);
//
//        division(25, 5);
//
//        System.out.println(modulus(10, 3));

//    #2

//        getInteger(1,10);

//    #3

//        factorial();
//        System.out.println(factorial(4));

//    #4
        diceRoll();

    }

    //=================================== Methods =========================================|
    public static void addition(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static void multiplication(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public static void division(int num1, int num2) {
        System.out.println(num1 / num2);

    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

//    #2


//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter a number between %d and %d.\n", min, max);
//        int userInput = scanner.nextInt();
//
//        if (userInput > min && userInput < max) {
//            System.out.println("Right number.");
//            return userInput;
//        } else {
//            System.out.println("Wrong number. ");
//            return getInteger(min, max);
//        }
//
//    }

    //    #3
//    public static void factorial() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter integer from 1 to 10: ");
//        int userInput = scanner.nextInt();
//        int result = factorial(userInput);
//        System.out.println("The factorial of " + userInput + " is " + result);
//    }
//
//    public static int factorial(int num) {
//        int result = 1;
//        for (int i = 1; i <= num; i++) {
//            result = result * i;
//        }
//        return result;
//    }

//    #4

    public static void diceRoll() {
        boolean playingDice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the number of sides for a pair of dice");
            int userSides = scanner.nextInt();

            int dice1 = (int) (Math.random() * userSides - 1 + 1) + 1;
            int dice2 = (int) (Math.random() * userSides - 1 + 1) + 1;
            int dice = dice1 + dice2;

            System.out.println("Would you like to roll the dice? Enter [yes/no]");
            scanner.nextLine();
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("You rolled a  " + dice1 + " and " + dice2 + " for a total of " + dice + ".");

            } else {
                System.out.println("Ok nice day you will have.");
                break;
            }
            System.out.println("Would you like to rew again?");
            String userContinue = scanner.nextLine();
            if(userContinue.equalsIgnoreCase("yes")){
                System.out.println("Ok cool thanks for playing again!");
                playingDice = true;
            } else {
                System.out.println("Ok nice day you will have.");
                playingDice = false;
            }

        } while (playingDice);

    }


}
