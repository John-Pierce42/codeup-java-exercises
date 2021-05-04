import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args){
//============== toSring =============================|
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));

// ================= Person array ========================|

        String[] personArray = {"john", "gabby", "alexandra"};
        Person person1 = new Person("john");
        Person person2 = new Person("gabby");
        Person person3 = new Person("alexandra");


        Person[] people = new Person[3];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;


        System.out.println(person1.getName());

        for(Person per : people ){
            System.out.println(per.getName());
        }
        Person grandmother = new Person("buela");
        for(int i = 0; i < addPerson(people, grandmother).length; i++){
            System.out.println(addPerson(people, grandmother)[i].getName());
        };

        addPerson(people, grandmother);

//        for(Person per : people){
//            System.out.println(per.addPerson());
//        }

    }

    public static Person[] addPerson(Person[] peoples, Person person) {
         Person[] newPersons = Arrays.copyOf(peoples,peoples.length+1);
        newPersons[newPersons.length -1] = person;
        return newPersons;
    }

}
