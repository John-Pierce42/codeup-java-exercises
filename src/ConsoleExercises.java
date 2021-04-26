
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {

    public static void main(String[] args) {
    //======== using format ===============================================|
//         double pi = 3.14159;
//         System.out.format("The value of pi is approximately %.2f ", pi);

        Scanner scanner = new Scanner(System.in);

    //=============== #1 =========================================|
//             System.out.print("Enter your favorite number!: ");
//                 int userInput = scanner.nextInt();
//                 System.out.println(userInput + "Nice " + userInput + "is my favorite number too");

    //=============== #2 =================================================================|
//          System.out.print("Please enter three words: ");
//          String userInput = scanner.next();
//          String userSecondInput = scanner.next();
//          String userThirdInput = scanner.next();
//          System.out.printf("You entered:\n %s\n %s\n %s", userInput, userSecondInput, userThirdInput);

    //=============== #3 and #4 ==========================================================|
//             System.out.print("Enter you sentence:");
////             String userSentence = scanner.next();
//             String userSentence = scanner.nextLine();

        //======== Experimenting with concatenation ================================|
            // String userName = scanner.next();
            // System.out.print("Your sentence said: " + userSentence + userName);

        //=========== #4 ===================================================|
//             System.out.printf("Your sentence said: %s ", userSentence);


    //============ Calculate the perimeter and area of Codeup's classrooms =================|
        //=========== #1 ============================
//            System.out.print("Enter the length of class room:");
//            String length = scanner.nextLine();
//            System.out.println("enter Width");
//            String width = scanner.nextLine();
//            int lengthAndWidth = parseInt(length) + parseInt(width);
//
//            System.out.println("the area of rectangle is: ");
//
//
//
//            System.out.printf("You Entered: %s ", lengthAndWidth);

//        System.out.println("Enter the length of classroom:");
//        int length = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Enter the width of classroom:");
//        int width = Integer.parseInt(scanner.nextLine());
//
//        int area = length * width;
//        int perimeter = (length * 2) + (width * 2);
//
//        System.out.printf(" The area is: %d\n", area);
//        System.out.printf(" The area is: %d\n", perimeter);

//================== Bonus ==================================================|

        System.out.println("Enter the length of classroom:");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the width of classroom:");
        double width = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the height of classroom:");
        double height = Double.parseDouble(scanner.nextLine());

        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        double volume = area * height;

        System.out.printf("length =  %f, width = %f, height = %f\n", length, width, height);
        System.out.printf(" The area is: %f\n", area);
        System.out.printf(" The width is: %f\n", perimeter);
        System.out.printf(" The volume is: %f\n", volume);


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