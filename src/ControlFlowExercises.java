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

//=================== #3 ===========================================================|
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What number would you like to go up to?");
//        int userInput = scanner.nextInt();
//
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------  | ------");
//
//        for(int i = 1; i <= userInput; i++){
//            int squared = i * i;
//            int cubed = i * i * i;
//            System.out.printf("%d      | %d       | %d \n" , i, squared, cubed);
//        }

//=================== #4 ===============================================================|

        boolean user = false;
        System.out.println(" A: 100-88\n B: 87-80\n C: 79-67\n D: 66-60\n F: 59-0");
        do {
            System.out.println("Choose grade from 0 - 100.");

            String userInput = scanner.nextLine();

            if(userInput.equalsIgnoreCase("yes")){
                System.out.println("ENTER grade here: ");
                int grade = scanner.nextInt();
                user = false;
                if (grade >= 88) {
                    System.out.println("The grade you chose is: A");
                } else if (grade >= 80) {
                    System.out.println("The grade you chose is: B");
                } else if (grade >= 67) {
                    System.out.println("The grade you chose is: C");
                } else if (grade >= 60) {
                    System.out.println("The grade you chose is: D");
                } else if (grade >= 0) {
                    System.out.println("The grade you chose is: F");
                }
            } else {
                System.out.println("Sorry you have to choose...");
                user = true;
            }

        }while(user);
    }
}
