package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades =  new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for(int i = 0; i < grades.size(); i++){
            sum = sum + grades.get(i);
        }
        return sum / grades.size();
    };

    public static void main(String[] args){

        Student studentName = new Student("John");
        System.out.println(studentName.getName());
        System.out.println();
        studentName.addGrade(100);
        studentName.addGrade(50);

        System.out.println(studentName.getGradeAverage());

    }

}
