package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);


    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        if (getString().equals("y") || getString().equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public int getInt(int min, int max) {


        int userInput = scanner.nextInt();
        if (userInput > min && userInput < max) {
            System.out.println("yes correct number");
            return userInput;
        } else {
            System.out.println("enter another number.");
            return getInt(min, max);
        }


    }

    public double getDouble() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {

        double userInput = scanner.nextInt();
        if (userInput > min && userInput < max) {
            System.out.println("yes correct number");
            return userInput;
        } else {
            System.out.println("enter another number.");
            return getDouble(min, max);
        }
    }

}