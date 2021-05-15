package util;

import java.util.Scanner;

public class Input {


    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = getString();

        if (userInput.equals("y") || userInput.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
        String userInput;
        userInput = this.getString();
        try {
            return Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println(userInput);
            return getInt();
        }
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
        String userInput;
        userInput = this.getString();
        try {
            return Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println(userInput);
            return getDouble();
        }
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

    public static void main(String[] args) {
//    Input input = new Input();
//        System.out.println("enter [y/n]");
//        System.out.println(input.yesNo());

//        System.out.println("enter a double number:");
//        System.out.println(input.getDouble());
//
//        System.out.println("enter a int number:");
//        System.out.println(input.getInt());
//
//    }

    }
}