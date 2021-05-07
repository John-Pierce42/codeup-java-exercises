package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args){
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

        System.out.println("welcome!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println();
        System.out.print("|" + students.get("John") + "|" + " " + "|" + students.get("Nic") + "|" + " " + "|" + students.get("Shan") + "|" + " " + "|" + students.get("Kenyan") +"|");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What student would you like to see more information on?");



    }

}
