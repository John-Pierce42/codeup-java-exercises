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

        Person[] people = {person1, person2, person3};


        System.out.println(person1.getName());

        for(Person per : people ){
            System.out.println(per.getName());
        }


    }
}
