import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
            String directory = "./src/codeup-java-exercises/data";
            String filename = "contacts.txt";

            Path dataDirectory = Paths.get(directory);
            Path dataFile = Paths.get(directory,filename);

            if(Files.notExists(dataDirectory)){
                Files.createDirectories(dataDirectory);
            }

            if(! Files.exists(dataFile)){
                Files.createFile(dataFile);
            }




        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
        Path filepath = Paths.get("data", "contacts.txt");
        Files.write(filepath, groceryList);

//        Path groceriesPath = Paths.get("data", "contacts.txt");
//        List<String> List = Files.readAllLines(groceriesPath);
//
//        for (int i = 0; i < groceryList.size(); i += 1) {
//            System.out.println((i + 1) + ": " + groceryList.get(i));
//        }


    }

}
