import java.util.Scanner;

public class Bob {

    public static void main( String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ask Bob a question.");
        String userQuestion = scanner.nextLine();
        if(userQuestion.endsWith("?")){
            System.out.println("Sure.");
        } else if(userQuestion.endsWith("!")){
            System.out.println("Whoa, chill out maan!");
        } else if(userQuestion.equals("")){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever man..");

        }
    }
}

