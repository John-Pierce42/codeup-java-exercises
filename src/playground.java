import util.Input;

import java.util.ArrayList;
import java.util.List;

public class playground {



    public static void main(String[] args) {

        String myName = "Samuel";

        Person personOne = new Person("John Pierce");
        Person personTwo = new Person("Bob Pierce");
        Person personThree = new Person("Frank Pierce");

        List<Person> listOfPeople = new ArrayList<>();

        listOfPeople.add(personOne);
        listOfPeople.add(personTwo);
        listOfPeople.add(personThree);

        System.out.println(listOfPeople.size());

//        System.out.println(personOne.name);

//
//        System.out.println(personOne.getName());
//
//        System.out.println(Math.PI);
//
//        Input input = new Input();
//
//        input.



    }

}
