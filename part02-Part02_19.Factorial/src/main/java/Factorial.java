
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        int start = 1;
        System.out.println("Give a number: ");;
        int finish = Integer.valueOf(scanner.nextLine());
        
        
        while(start <= finish){
            factorial*=start;
            start++;
        }
        System.out.println("Factorial: " + factorial);
    } 
}
