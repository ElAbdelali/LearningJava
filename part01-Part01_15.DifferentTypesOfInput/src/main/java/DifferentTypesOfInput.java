
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string: ");
        String value = String.valueOf(scan.nextLine());
        System.out.println("Give an integer: ");
        Integer num = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double deci = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean tOrF = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + value);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + deci);
        System.out.println("You gave the boolean " + tOrF);
      
        
        
        
        // Write your program here

    }
}
