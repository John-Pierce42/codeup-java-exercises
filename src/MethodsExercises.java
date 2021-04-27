public class MethodsExercises {

    public static void main(String[] args){

        addition(10,10);

        System.out.println(subtraction(20,5));

        multiplication(2, 5);

        division(25, 5);

        System.out.println(modulus(10,3));

    }

    public static void addition(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }

    public static void multiplication(int num1, int num2){
        System.out.println(num1 * num2);

    }

    public static void division(int num1, int num2){
        System.out.println(num1 / num2);

    }

    public static int modulus(int num1, int num2){
         return num1 % num2;



    }

}
