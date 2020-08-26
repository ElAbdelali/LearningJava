
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //initilizing ints
        int sum = 0;
        int startNum = 0;
          // sout for asking for user's last num
        System.out.println("Last number? ");
        int lastNum = Integer.valueOf(scanner.nextLine());
        // while startNum is less than lastNum. repeat the loop while adding the sum of the previous numbers
        while(startNum <= lastNum){
            sum += startNum;
            startNum++;
        }
        // print the sum at the end
        System.out.println("The sum is: " + sum);
    }
}
