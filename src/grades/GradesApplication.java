package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();

        students.put("John", "John42");
        students.put("Nic", "Nic42");
        students.put("Shan", "Shan42");
        students.put("Kenyan", "Kenyan42");

        Student John = new Student("John");
        Student Nic = new Student("Nic");
        Student Shan = new Student("Shan");
        Student Kenyan = new Student("Kenyan");

        John.addGrade(30);
        John.addGrade(90);
        John.addGrade(70);

        Nic.addGrade(90);
        Nic.addGrade(100);
        Nic.addGrade(100);

        Shan.addGrade(100);
        Shan.addGrade(100);
        Shan.addGrade(100);

        Kenyan.addGrade(70);
        Kenyan.addGrade(90);
        Kenyan.addGrade(100);
//===================================================== #3 ===========================================|
        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println();
        System.out.println("|" + students.get("John") + "|" + " " + "|" + students.get("Nic") + "|" + " " + "|" + students.get("Shan") + "|" + " " + "|" + students.get("Kenyan") + "|");


        System.out.println();

        System.out.println("What student would you like to see more information on?");
        String userInput = scanner.nextLine();
        boolean userContinue = false;

        do {

            if (userInput.equals("John42")) {
                System.out.println("Name: John Pierce- GitHub Username: " + students.get("John"));
                System.out.println("Current Average: " + John.getGradeAverage());
            } else if (userInput.equals("Shan42")) {
                System.out.println("Name: Shanshan Su - GitHub Username: " + students.get("Shan"));
                System.out.println("Current Average: " + Shan.getGradeAverage());
            } else if (userInput.equals("Nic42")) {
                System.out.println("Name: Nicholas Martinez - GitHub Username: " + students.get("Nic"));
                System.out.println("Current Average: " + Nic.getGradeAverage());
            } else if (userInput.equals("Kenyan42")) {
                System.out.println("Name: Kenyan Luce - GitHub Username: " + students.get("Kenyan"));
                System.out.println("Current Average: " + Kenyan.getGradeAverage());
            } else if (userInput.equalsIgnoreCase("no")) {
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + '"' + userInput + '"' + ".");
            }

            System.out.println("Would you like to see another student?");
             userInput = scanner.nextLine();
            if (userInput.equals("y")) {
                System.out.println("What student would you like to see more information on?");
                userInput = scanner.nextLine();
                userContinue = true;
            } else if (userInput.equalsIgnoreCase("no")) {
                System.out.println("Goodbye, and have a wonderful day!");
                userContinue = true;
                break;
            }


        } while (userContinue);
    }
}
