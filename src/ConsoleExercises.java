
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {

    public static void main(String[] args) {
    //======== using format ===============================================|
        // double pi = 3.14159;
        // System.out.format("The value of pi is approximately %f ", pi);

        Scanner scanner = new Scanner(System.in);

    //=============== #1 =========================================|
            // System.out.print("Enter your favorite number!: ");
                // int userInput = scanner.nextInt();

    //=============== #2 =================================================================|
        //  System.out.print("Enter three words: ");
        //  String userInput = scanner.next();
        //  String userSecondInput = scanner.next();
        //  String userThirdInput = scanner.next();
        //  System.out.printf("You entered:\n %s\n %s\n %s", userInput, userSecondInput,                 userThirdInput);

    //=============== #3 and #4 ==========================================================|
            // System.out.print("Enter you sentence:");
            // String userSentence = scanner.next();
            // String userSentence = scanner.nextLine();

        //======== Experimenting with concatenation ================================|
            // String userName = scanner.next();
            // System.out.print("Your sentence said: " + userSentence + userName);

        //=========== #4 ===================================================|
            // System.out.printf("Your sentence said: %s ", userSentence);


    //============ Calculate the perimeter and area of Codeup's classrooms =================|
        //=========== #1 ============================
            System.out.print("Enter the length of class room:");
            String length = scanner.nextLine();
            System.out.println("enter Width");
            String width = scanner.nextLine();
            int lengthAndWidth = parseInt(length) + parseInt(width);

            System.out.println("the area of rectangle is: ");



            System.out.printf("You Entered: %s ", lengthAndWidth);
    }
}

//=============================== Curriculum Notes =======================================>

//    String name = "codeup";
//System.out.printf("Hello there, %s. Nice to see you.\n", name);


//    String greeting = "Salutations";
//    String name = "codeup";
//System.out.printf("%s, %s!", greeting, name);


//    Scanner scanner = new Scanner(System.in);
//
//System.out.print("Enter something: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");