package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;


}

    public String getString(){
        return scanner.nextLine();
    }

    boolean yesNo(){
    if(getString().equalsIgnoreCase("y") || getString().equalsIgnoreCase("yes")){
        return true;
    } else {
        return false;
    }
    }
