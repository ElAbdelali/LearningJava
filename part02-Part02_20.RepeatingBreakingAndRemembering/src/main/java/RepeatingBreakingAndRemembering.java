
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNum = 0;
        int numOfNum = 0;
        double avgOfNum = 0;
        int numOfEven = 0;
        int numOfOdd = 0;
        System.out.println("Give numbers:");
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1){
                System.out.println("Thx! Bye!");
                break;
            } 
            if (num % 2 == 0){
                numOfEven++;
            }
            if (num % 2 != 0){
                numOfOdd++;
            }
            
            sumOfNum+=num;
            numOfNum++;
            avgOfNum = 1.0 * sumOfNum/numOfNum;
        }
        System.out.println("Sum: " + sumOfNum);
        System.out.println("Numbers: " + numOfNum);
        System.out.println("Average: " + avgOfNum);
        System.out.println("Even: " + numOfEven);
        System.out.println("Odd: " + numOfOdd);
    }
}
