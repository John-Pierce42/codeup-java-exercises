package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static void main(String[] args) {

        System.out.println("what would you like to do?");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - view movies in the musical category");
        System.out.println();
//        System.out.print("Enter your choice: ");
        Input userChoice = new Input();
//        int userInput = userChoice.getInt();

//        System.out.println(userInput);
//


        Movie[] movies = MoviesArray.findAll();



        boolean askingUser = true;
        do {
            System.out.println();
            System.out.print("Enter your choice: ");
             int userInput = userChoice.getInt();
            System.out.println();

            if (userInput == 0) {
                System.out.println("exit");
                askingUser = false;

            } else if (userInput == 1) {
                for(Movie a : movies){
                    System.out.println(a.getName() + " -- " + a.getCategory());

                }
            } else if (userInput == 2) {
                for(Movie a : movies){
                    if(a.getCategory().equals("animated")){
                        System.out.println(a.getName() + " -- " + a.getCategory());

                    }
                }
            } else if (userInput == 3) {
                for(Movie a : movies){
                    if(a.getCategory().equals("drama")){
                        System.out.println(a.getName() + " -- " + a.getCategory());
                    }
                }

            } else if (userInput == 4) {
                for(Movie a : movies){
                    if(a.getCategory().equals("horror")){
                        System.out.println(a.getName() + " -- " + a.getCategory());
                    }
                }

            } else if (userInput == 5) {
                for (Movie a : movies) {
                    if (a.getCategory().equals("scifi")) {
                        System.out.println(a.getName() + " -- " + a.getCategory());
                    }
                }

            }
            else if (userInput == 6) {
                for (Movie a : movies) {
                    if (a.getCategory().equals("musical")) {
                        System.out.println(a.getName() + " -- " + a.getCategory());
                    }
                }

            }


        } while (askingUser);


    }
}
