import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//================= #1a ===============|
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

//================= #1b ==============|
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        }while(i <= 100);
//
//    }
//========== backwards =================|
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 2;
//        }while(i > 0);
//    }
//=========== number squared =============|
//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i * i;
//        }while(i <= 100000000);
//    }
//=============== Refactor to for Loops ==========|
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 100; i+=2) {
//               System.out.println(i);
//        }


//        for (int i = 100; i >= 0; i-=2) {
//            System.out.println(i);
//        }

//        for (long i = 2; i <= 1000000; i = i * i) {
//            System.out.println(i);
//        }

//=================== #2 ========================================|

//for(int i = 1; i <= 100; i++){
//    if(i % 3 == 0 && i % 5 == 0){
//        System.out.println("FIZZBUZZ");
//    } else if(i % 3 == 0){
//        System.out.println("FIZZ");
//    } else if(i % 5 == 0){
//        System.out.println("BUZZ");
//    } else {
//        System.out.println(i);
//    }
//
//}

//=================== #3 ================================|
        Scanner scanner = new Scanner(System.in);

        System.out.println("What number would you like to go up to?");
        int userInput = scanner.nextInt();


//        for(int i = 0; i < userInput; i++){
//
//        }
        System.out.println("Here is your table!\n number  |\n ------  |\n" + i);
    }
}
