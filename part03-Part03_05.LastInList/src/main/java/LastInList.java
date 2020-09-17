
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        Import ArrayList as well as Scanner
        Created public class to match java file name
        we create the scanner to record what the user inputs
        array is then created of type String named list
        while statements states when string(input) is not blank, add the input into the list
        we then print the last string entered by retreiving it with list.get(list.size()-1)
        */
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

            System.out.println(list.get(list.size()-1));
      
    } 
}
