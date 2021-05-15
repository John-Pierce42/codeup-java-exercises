import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class playground {


    public static void main(String[] args) throws IOException {

//        String myName = "Samuel";
//
//        Person personOne = new Person("John Pierce");
//        Person personTwo = new Person("Bob Pierce");
//        Person personThree = new Person("Frank Pierce");
//
//        List<Person> listOfPeople = new ArrayList<>();
//
//        listOfPeople.add(personOne);
//        listOfPeople.add(personTwo);
//        listOfPeople.add(personThree);
//
//        System.out.println(listOfPeople.size());

//        System.out.println(personOne.name);

//
//        System.out.println(personOne.getName());
//
//        System.out.println(Math.PI);
//
//        Input input = new Input();
//
//        input.

//=============== File I/O creating the directory and file ====================================|

//        String directory = "./src/codeup-java-exercises/data";
//        String filename = "contacts.txt";
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        if (Files.notExists(dataDirectory)) {
//            Files.createDirectories(dataDirectory);
//        }
//
//        if (!Files.exists(dataFile)) {
//            Files.createFile(dataFile);
//        }
//
//        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
//        Path filepath = Paths.get("data", "contacts.txt");
//


//        Path groceriesPath = Paths.get("data", "contacts.txt");
//        List<String> List = Files.readAllLines(groceriesPath);
//
//        for (int i = 0; i < groceryList.size(); i += 1) {
//            System.out.println((i + 1) + ": " + groceryList.get(i));
//        }


// ============================== Arrays and ArrayList practice ==========================================|
//        the array of pets.
//        String[] pets = {"dog", "parrot", "budgie"};
//        System.out.println(pets[1]);

//      enhanced for loop to iterate through the array of pets.
//        for (String pet : pets) {
//            System.out.println(pet);
//        }
//        System.out.println();
//      ArrayList of books.
//        ArrayList<String> books = new ArrayList<>();
//        books.add("The Hitchhiker's Guide to the Galaxy, By Douglas Adams.");
//        books.add("The Crusades, By Thomas Asbridge.");

//        System.out.println(books.toArray()[1]);
//        System.out.println();
//        for (String book : books) {
//            System.out.println(book);
//        }


//================================ Exceptions and try catch =================================|

//        this try catch code will print out "an exception happened because in the try you can
//        see that System.out.println(a[3]) is out of bounds because a[] only go's to index of 2;
//        try {
//            int[] a = {4, 5, 1};
//            System.out.println(a[3]);
//        } catch (Exception e) {
//            System.out.println("an exception happened!");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//
//
//        try{
//            int userInput = sc.nextInt();
//            System.out.println();
//            System.out.println(userInput);
//        }catch (Exception e){
//            System.out.println("Sorry please enter a number");
//        }

//      null exception
        try{
//            null try.
            int[] num = null;
            System.out.println(num[1]);

//            out of bounds try
//            int[]num = {1,2,3};
//            System.out.println(num[3]);

//            just an Exception try
//            int[]num = {1,2,3};
//            System.out.println();

        }catch (NullPointerException e){
            System.out.println("your array is null.");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("you index is out of bounds.");

        }catch (Exception e){
            System.out.println("something else went wrong.");
        }








    }
}