import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        addition(10, 10);

        System.out.println(subtraction(20, 5));

        multiplication(2, 5);

        division(25, 5);

        System.out.println(modulus(10, 3));

//     #2

        Scanner scanner = new Scanner(System.in);


    }

    public static void addition(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static void multiplication(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public static void division(int num1, int num2) {
        System.out.println(num1 / num2);

    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

//    #2


    public static int getInteger(int min, int max) {
            if(min <= 0){
                System.out.print("Enter a number between 1 and 10: ");
            } else if(max >= 10){
                System.out.print("Enter a number between 1 and 10: ");
            }
    }


}
